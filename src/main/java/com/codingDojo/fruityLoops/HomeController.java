package com.codingDojo.fruityLoops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(Model model) {
		ArrayList<Fruit> fruits = new ArrayList<Fruit>();
		
		fruits.add(new Fruit("kiwi", 1.5));
		fruits.add(new Fruit("mango", 2.0));
		fruits.add(new Fruit("Goji Berries", 4.0));
		fruits.add(new Fruit("Guava", .75));
		
		model.addAttribute("fruitFamily", fruits);
		
		return "index.jsp";
		
	}
}
