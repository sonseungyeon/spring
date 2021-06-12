package com.myapp.marvel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarvelService {

	@Autowired
	MarvelMapper marvelMapper;
	//조회, 삽입, 수정, 삭제
	
	public List<Marvel> selectMarvelMovie() {
		return marvelMapper.selectMarvelList();
	}
	
	public int insertMarvel(Marvel marvel) {
		return marvelMapper.insertMarvel(marvel);
	}
	
	public Marvel selectMarvelOnebyId(int marvelId) {
		return marvelMapper.selectMarvelOneById(marvelId);
	}
	
	public int updateMarvel(Marvel marvel) {
		return marvelMapper.updateMarvel(marvel);
	}
	
	public int deleteMarvel(int marvelId) {
		return marvelMapper.deleteMarvel(marvelId);
	}
	
}
