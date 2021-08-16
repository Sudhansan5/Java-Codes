package firstproject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Sudhanshu");
		List<String> names = new ArrayList<String>();
		names.add("Saket");
		names.add("Niket");
		model.addAttribute("nameList", names);
		System.out.println("Inside home");
		return "home";
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact() {
		System.out.println("This is contact page");
		ModelAndView modelAndView=new ModelAndView();
		LocalDateTime time =  LocalDateTime.now();
		modelAndView.addObject("name", "Sudhanshu");
		modelAndView.addObject("email", "sudhan4san@gmail.com");
		modelAndView.addObject("time", time);
		modelAndView.setViewName("contact");
		return modelAndView;
	}
}
