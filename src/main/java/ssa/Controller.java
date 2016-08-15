package ssa;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller

public class Controller {
	@RequestMapping("")
	public String index(Model model){
		model.addAttribute("name", "Aoki");
		return "index";
	}
}
