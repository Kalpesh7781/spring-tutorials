package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;

@Controller
public class ContactController {
@RequestMapping("/contact")
public String contact()
{
System.out.println("contact controller");
return "contact";	
}

//use of model attribute
@RequestMapping(path="/process",  method=RequestMethod.POST)
public String handle(@ModelAttribute User user,Model model)
{
	/*
	 * User user=new User();
	 * user.setName();
	 * user.setEmail();
	 * 
	 * model.setAttrinute("user",user);
	 */
	
	/*
	 * Redirect redirect=new Redirect();
	 * redirect.seturl();
	 * */
	if(user.getName().isBlank())
	{
		return "redirect:/contact";
	}
	System.out.println(user);
	
	return "process";
	
}
}
