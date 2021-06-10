package com.myapp.marvel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/marvel")
public class MarvelMovieController {

	@Autowired
	MarvelMovieService marvelMovieService;
	
	@GetMapping("/list")
	public String showMarvelList(Model model) {
		
		List<MarvelMovie> marvelList = marvelMovieService.getMarvelList();
		
		model.addAttribute("marvelList", marvelList);
		
		return "marvelListView";
	}
	
	@GetMapping("/input")
	public String fowardInputForm(){
		return "marvelInputForm";
	}
	
	@PostMapping("/input")
	public String insertMarvelList(Model model,MarvelMovie marvelMovie) {
		MarvelMovie marvelInsert = marvelMovieService.joinMarvel(marvelMovie);
		model.addAttribute("result",marvelInsert);
		
		return "result";
	}
	
	@GetMapping("/delete")
	public String deleteMarvelList(Model model,int marvelId) {
		marvelMovieService.deleteMarvel(marvelId);
		
		List<MarvelMovie> marvelList = marvelMovieService.getMarvelList();
		
		model.addAttribute("marvelList", marvelList);
		
		return "marvelListView";
	}
}
