package com.myapp.marvel;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarvelMovieService {

	@Autowired
	MarvelMovieMapper marvelMovieMapper;
	
	public List<MarvelMovie> getMarvelList() {
		return marvelMovieMapper.selectMarvelMovie();
	}
	
	public MarvelMovie joinMarvel(MarvelMovie marvelMovie) {
		marvelMovie.setWriteDate(LocalDateTime.now());
		marvelMovie.setUpdateDate(LocalDateTime.now());
		int affectedRows = marvelMovieMapper.insertMarvelMovie(marvelMovie);
		if(affectedRows ==1) {
			return new MarvelMovie(marvelMovie.getMarvelId(), marvelMovie.getTitle(), marvelMovie.getTitleEng(),
					marvelMovie.getReleaseDate(), marvelMovie.getWorldBoxOffice(), marvelMovie.getWriteDate(),
					marvelMovie.getUpdateDate());
		}else {
			return null;
		}
	}
	
	public int deleteMarvel(int marvelId) {
		return marvelMovieMapper.deleteMarvelMovie(marvelId);
	}
}
