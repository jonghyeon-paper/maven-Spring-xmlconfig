package spring.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import spring.hello.service.HelloService;

@RestController
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "hello";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<?> getUserList() {
		return helloService.getUserList();
	}

}
