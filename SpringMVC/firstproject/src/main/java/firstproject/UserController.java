package firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class UserController {
	@RequestMapping("/register")
	public String register() {
		System.out.println("Registration in progess.....");
		return "register";
	}

	@RequestMapping("/processform")
	public String handleForm(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("age") String age, Model model) {
		System.out.println("Getting form data.....");

		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmail(email);
		emp.setAge(age);
		model.addAttribute("emp", emp);
		System.out.println("Inside home");
		return "success";
	}

	@RequestMapping("/register/{name}/{email}/{age}/")
	public String handle(@PathVariable("name") String name, @PathVariable("email") String email,
			@PathVariable("age") String age, Model model) {
		System.out.println("Getting form data.....");

		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmail(email);
		emp.setAge(age);

		model.addAttribute("emp", emp);
		return "success";
	}

//	@RequestMapping("/processform")
//	public String handleForm(@ModelAttribute Employee emp, Model model) {
//		System.out.println("Getting form data.....");
//		model.addAttribute("emp", emp);
//		return "success";
//	}

}
