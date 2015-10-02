/* CustomerController.java
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
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customer")
public class CustomerController extends AbstractController {

	// Constructors -----------------------------------------------------------

	public CustomerController() {
		super();
	}

	// Action-1 ---------------------------------------------------------------		

	@RequestMapping("/action-1")
	public ModelAndView action1() {
		ModelAndView result;
		
		Double sin1 = 0.0;

		result = new ModelAndView("customer/action-1");
		
		for (int i = 0;i <= 10;i++) {
			sin1 = Math.sin(i);
			result.addObject("valor"+i, sin1);
		}

		return result;
	}
	
	// Action-2 ---------------------------------------------------------------		

	@RequestMapping("/action-2")
	public ModelAndView action2() {
		ModelAndView result;
		
		Double num1 = 0.0;
		Double num2 = 0.0;

		result = new ModelAndView("customer/action-2");
		
		for (int i = 0;i <= 10;i++) {
			num1 = Math.random()*100;
			num2 = Math.random()*100;
			result.addObject("valor"+i, "("+num1+", "+num2+")");
		}

		return result;
	}
}