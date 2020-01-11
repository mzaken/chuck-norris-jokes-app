/**
 * 
 */
package chucknorrisjokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import chucknorrisjokesapp.services.ChuckNorrisJokesService;
import chucknorrisjokesapp.services.JokeService;

/**
 * @author Maor Zaken
 * Created on Jan 11, 2020
 */

@Controller
public class JokesController {
	
	private JokeService jokesService;

	/**
	 * @param jokesService
	 */
	public JokesController(JokeService jokesService) {
		super();
		this.jokesService = jokesService;
	}
	
	@RequestMapping(value= {"/", ""})
	public String showJoke(Model model) {
		model.addAttribute("joke", jokesService.getJoke());
		
		return "chucknorris";
	}
}
