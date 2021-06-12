package com.myapp.marvel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/marvel")
public class MarvelController {

	@Autowired
	MarvelService marvelService;
	
	@GetMapping("/list")
	public String selectMarvelList(Model model){
		List<Marvel> marvelList = marvelService.selectMarvelMovie();
		model.addAttribute("marvelList",marvelList);
				
		return "marvelListView";
	}
}
