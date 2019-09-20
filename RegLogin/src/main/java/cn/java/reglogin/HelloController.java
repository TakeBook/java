package cn.java.reglogin;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("hello.do")
	public String showHello() {
		System.out.println("HelloController.showHello()");
		return null;
	}
	
	@RequestMapping("reg.do")
	public String showReg() {
		System.out.println("UserController.showReg()");
		return "reg";
	}
	
	@RequestMapping("handle_reg.do")
	public String handleReg(User user,UserFile userFile,HttpServletRequest request) throws IOException {
		System.out.println(user);
		userFile.createUserFile(user);
		return null;
	}
}
