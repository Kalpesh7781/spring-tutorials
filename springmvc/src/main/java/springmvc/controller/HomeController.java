package springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
 
	//sending data to view using model
@RequestMapping("/home")
public String home(Model model)
{
	model.addAttribute("name", "ram rajan");
	System.out.println("called");
return "Home";	
}

//sending data to view using modelandview
@RequestMapping(path="/help", method=RequestMethod.GET)
public ModelAndView help()
{
	System.out.println("help is called");
	ModelAndView modelandview =new ModelAndView();
	modelandview.setViewName("Help");
	modelandview.addObject("name","kalpesh");
	modelandview.addObject("roll",101);
	LocalDateTime now=LocalDateTime.now();
	modelandview.addObject("time", now);
	return modelandview;
	
}


@RequestMapping(path="/search/{id}", method=RequestMethod.GET)
public String search(@PathVariable("id") int id,Model model)
{
	System.out.println(id);
	model.addAttribute("id", id);
	
	return "path";
	
}

@ExceptionHandler
public String exception()

{
return "null_p";	
}
}
