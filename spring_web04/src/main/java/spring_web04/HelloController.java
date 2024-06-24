package spring_web04;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Hello, Controller{
	//interface의 특징 : 다중상속 가능 , class 단일 상속의 한계를 극복함.
	String name;
	String email;
	String message;
	
	public HelloController() {}
	
	public HelloController(String name, String email, String message) {
		this.name = name;
		this.email = email;
		this.message = message;
	}
	
	/*
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	*/

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg" , sayHello());
		mav.setViewName("hello");
		return mav;
	}

	@Override
	public String sayHello() {
		return email + "을 쓰는 " + name + "님의 "+ message;
	}
	
	
}
