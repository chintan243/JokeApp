package guru.springframework.chucknorrisforactuator.JokesController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.chucknorrisforactuator.service.ChuckNorrisQuot;

@Controller
public class JokesController {
	
	private ChuckNorrisQuot chuckNorrisQuot;
	
	@Autowired
	public JokesController(ChuckNorrisQuot chuckNorrisQuot){
		this.chuckNorrisQuot = chuckNorrisQuot;
	}
	
	@RequestMapping({"/",""})
	public String getJoke(Model model){
		model.addAttribute("joke", chuckNorrisQuot.getJoke());
		return "chucknorris";
	}
	
}
