/* AdministratorController.java
 *
 * Copyright (C) 2013 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 * 
 */

package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/administrator")
public class AdministratorController extends AbstractController {

	// Constructors -----------------------------------------------------------
	
	public AdministratorController() {
		super();
	}
		
	// Action-1 ---------------------------------------------------------------		

	@RequestMapping("/action-1.do")
	public @ResponseBody ModelAndView action1(
			@RequestParam(value = "x", required = false) Double x,
			@RequestParam(value = "y", required = false) Double y) {
		ModelAndView result;
		
				
		result = new ModelAndView("administrator/action-1");
		
		if (x != null && y != null) {
		
		result.addObject("numero1", x);
		result.addObject("suma", "+");
		result.addObject("numero2", y);
		result.addObject("igual", "=");
		result.addObject("resultado", x+y);
		
		} else {
			result.addObject("resultado", "Por favor, pase los valores de X e Y a traves de la URL");
		}
		
		return result;
	}
	
	// Action-2 ---------------------------------------------------------------
	
	@RequestMapping("/action-2")
	public ModelAndView action2() {
		List<String> ls = new ArrayList<String>();
		ls.add("Disfrutar el momento es disfrutar la vida. (Esteban)");
		ls.add("Si Buscas resultados distintos, no hagas siempre lo mismo. (Albert Einstein)");
		ls.add("Cada persona forja su propia grandeza. Los enanos permanecer�n enanos aunque se suban a los Alpes. (August von Kotzebue)");
		ls.add("El �xito es f�cil de obtener. Lo dif�cil es merecerlo. (Albert Camus)");
		ls.add("Pensar es el trabajo m�s dif�cil que existe. Quiz� sea �sta la raz�n por la que haya pocas personas que lo practiquen. (Henry Ford)");
		ls.add("No hay camino para la paz, la paz es el camino. (Mahatma Gandhi)");
		ls.add("El amor no tiene cura, pero es la �nica medicina para todos los males. (Leonard Cohen)");
		ls.add("Un hermano puede no ser un amigo, pero un amigo ser� siempre un hermano. (Benjamin Franklin)");
		ls.add("Estar preparado es importante, saber esperarlo es a�n m�s, pero aprovechar el momento adecuado es la clave de la vida. (Arthur Schnitzler)");
		ls.add("S�lo puede ser feliz siempre el que sepa ser feliz con todo. (Confucio)");
		
		ModelAndView result;
				
		result = new ModelAndView("administrator/action-2");
		
		result.addObject("frase", ls.get((int) (Math.random()*10)));
	
		return result;
	}
	
}