package fi.ryhma2.teht1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Teht1Controller {
	@RequestMapping("index")
	@ResponseBody
	public String showMainPage() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String showContactPage() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHelloToSomeone(@RequestParam(name="name") String etunimi,@RequestParam(name="location") String paikka ) {
		return "Welcome to the " + paikka + " " + etunimi + "!";
	}

}
