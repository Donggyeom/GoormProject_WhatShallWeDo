package pe.gameplans.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BaseController {
	
	private final HttpSession httpSession = null;
	
	@GetMapping("/home")
	public String home(Model model) {
				
		return "content/home";
	}
	
	@GetMapping("/ongame")
	public String ongame(Model model) {
				
		return "content/ongame";
	}
	
	@GetMapping("/offgame")
	public String offgame(Model model) {
				
		return "content/offgame";
	}
	
	@GetMapping("/gallery")
	public String gallery(Model model) {
				
		return "content/gallery";
	}
	
	@GetMapping("/freeboard")
	public String freeboard(Model model) {
				
		return "content/freeboard";
	}
}
