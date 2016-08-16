package ssa;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller

public class Controller {
	
	@RequestMapping("")
	public String index(Model model){
		return "prototype";
	}
		
	@RequestMapping(value="/post" ,method = RequestMethod.POST)
	public String serch(Model model, @RequestParam("name") String name){
		model.addAttribute("name", name);
		return "prototype";
	}
}
