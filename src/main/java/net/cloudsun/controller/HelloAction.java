package net.cloudsun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/test")
public class HelloAction {
	/**
	 * 这是范例
	 * @return
	 */
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(){
		System.out.println("hello,Mr zhou!");
		return "ok";
	}

}
