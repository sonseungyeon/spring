package com.myapp.marvel;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //화면선택, 보내줄 데이터를 만드는 역할
@RequestMapping("/marvel")
public class MarvelController {

	@Autowired
	MarvelService marvelService;
	
	//조회하는 기능
	@GetMapping("/list")
	public String showMarvelListView(Model model) {
		List<Marvel> marvelList = marvelService.selectAllMarvel();
		model.addAttribute("marvelList",marvelList);
		
		return "marvelListView";
	}
	
	@GetMapping("/insert")
	public String showMarvelInsertView() {
		return "marvelInsertView";
	}
	
	@PostMapping("/insert")
	public String insertMarvel(Marvel marvel) {
		Marvel newMarvel = new Marvel(0,marvel.getTitle(), marvel.getTitleEng(), 
				marvel.getReleaseDate(),marvel.getWorldBoxOffice(), LocalDateTime.now() ,LocalDateTime.now());
		int affectedRows = marvelService.insertMarvel(newMarvel);
		return "insertResult";
	}
	
	@GetMapping("/update")
	public String showMarvelUpdateView(Model model,int marvelId) {
		Marvel marvel = marvelService.selectMarvelById(marvelId);
		model.addAttribute("marvel",marvel);
		return "marvelUpdateView";
	}
	
	@PostMapping("/update")
	public String updateMarvel(Marvel marvel) {
		Marvel newMarvel = new Marvel(marvel.getMarvelId(),marvel.getTitle(), marvel.getTitleEng(), 
				marvel.getReleaseDate(),marvel.getWorldBoxOffice(), marvel.getWriteDate() ,LocalDateTime.now());
		int affectedRows = marvelService.updateMarvel(newMarvel);
		return "marvelUpdateResult";
	}
	
	@GetMapping("/delete")
	public String deleteMarvel(int marvelId) {
		marvelService.deleteMarvel(marvelId);
		return "marvelDeleteResult";
	}
	
	@GetMapping("/movie")
	public String showMovieListView(Model model) {
		List<Movie> movieList = marvelService.selectAllMovie();
		model.addAttribute("movieList",movieList);
		return "movieSelectView";
		
	}
}
