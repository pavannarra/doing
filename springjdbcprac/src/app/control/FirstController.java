package app.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import app.pojos.Rregister;
import app.service.Servimpl;

@Controller
@ControllerAdvice
public class FirstController {
@Autowired
private Servimpl si;
@RequestMapping(value="/hi",method=RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute Rregister r) {
	System.out.println("in controller insert==="+r);
	si.insert(r);
		return new ModelAndView("response","h","successfulll");
	}
@RequestMapping(value="/re",method=RequestMethod.POST)
public ModelAndView retrieve(@ModelAttribute Rregister r) {
	System.out.println("in retrieval controller");
	si.retrival(r);
	return new ModelAndView("response","h","retrieved succesfully");
}
@ModelAttribute
public void print() {
	System.out.println("am in print");
}
@RequestMapping(value="/checking/{data}")
public void check(@PathVariable("data") String data) {
System.out.println("in controller checking==="+data);
}
}
