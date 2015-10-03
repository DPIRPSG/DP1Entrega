/* ProfileController.java
 *
 * Copyright (C) 2013 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 * 
 */

package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/profile")
public class ProfileController extends AbstractController {
	
	// Action-1 ---------------------------------------------------------------		

	@RequestMapping("/action-1")
	public ModelAndView action1() {
		ModelAndView result;
				
		result = new ModelAndView("profile/action-1");
		
		return result;
	}
	
	// Action-2 ---------------------------------------------------------------		
	
	@RequestMapping("/action-2.do")
	public ModelAndView action2(
			@RequestParam(value = "count", required = false) Integer count) {
		ModelAndView result;
				
		result = new ModelAndView("profile/action-2");
		
		String res = "";
		
		if (count != null) {
			for (int i = 0; i < count; i++) {
				res = res + i + ", ";
			}

			res = res + count;
		}
		result.addObject("escalera", res);
		
		return result;
	}
	
	// Action-2 ---------------------------------------------------------------		
	
	@RequestMapping("/action-3")
	public ModelAndView action3() {
		throw new RuntimeException("Oops! An exception was thrown.");
	}
	
}