package practiceTest.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import practiceTest.dto.LoginDto;
import practiceTest.dto.UserDto;
import practiceTest.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
		
	//로그인 화면 요청
	@GetMapping("/login")
	public String login(HttpSession session) throws Exception{
		if (session.getAttribute("user") == null) {
			return "login.html";
		} else {
			return "redirect:/test/openFanboardList";
		}
	}
	
	//로그인 처리 요청
	@PostMapping("/login")
	public String login(LoginDto loginDto, HttpSession session) throws Exception{
		UserDto userDto = loginService.login(loginDto);
		if (userDto == null) {
			session.setAttribute("message", "일치하는 정보가 존재하지 않습니다.");
			return "redirect:login";
		} else {
			session.setAttribute("user", userDto);
			return "redirect:/test/openFanboardList?celebrityIdx=1";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) throws Exception{
		session.removeAttribute("user");
		session.invalidate();
		return "redirect:login";
	}
	
	
	
}
