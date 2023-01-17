package practiceTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import practiceTest.dto.Dto;
import practiceTest.service.TestService;


@Slf4j
@Controller
public class TestController {
	
	@Autowired 
	private TestService testService;
	
	@GetMapping("/test/openFanboardList")
	public ModelAndView openBoardList(int celebrityIdx) throws Exception {
		ModelAndView mv = new ModelAndView("/test/fanboardList");
		
		List<Dto> list = testService.selectFanboardList(celebrityIdx);
		mv.addObject("List", list);
		
		Dto celebName = testService.selectCelebrityName(celebrityIdx);
		mv.addObject("celebName", celebName);
		
		//50개면 10개씩 5개의 리스트 필요 
		
		
		return mv;
	}
	
}
