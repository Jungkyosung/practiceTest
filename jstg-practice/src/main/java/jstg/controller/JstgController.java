package jstg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jstg.dto.NoticeDto;
import jstg.dto.ProfileDto;
import jstg.service.JstgService;

@Controller
public class JstgController {
	
	@Autowired
	private JstgService jstgService;
	
	@GetMapping("/jstg/openNboardList")
	public ModelAndView openNboardList() throws Exception{
		ModelAndView mv = new ModelAndView("/jstg/NboardList"); //NboardList html필요
		
		List<NoticeDto> nboardList = jstgService.selectNboardList();
		mv.addObject("nBoardList", nboardList);
		
		return mv;
	}
	
	@GetMapping("/jstg/openProfileList")
	public ModelAndView openProfileList() throws Exception{
		ModelAndView mv = new ModelAndView("/jstg/ProfileList");
		
		List<ProfileDto> profileList = jstgService.selectProfileList();
		mv.addObject("ProfileList", profileList);
		return mv;
	}
	
	
	@GetMapping("/jstg/openProfileDetail")
	public ModelAndView openProfileDetail(@RequestParam int profileIdx) throws Exception{
		ModelAndView mv = new ModelAndView("/jstg/ProfileDetail");
		
		ProfileDto profileDetail = jstgService.selectProfileDetail(profileIdx);
		mv.addObject("ProfileDetail",profileDetail);
		return mv;
	}
	
	
	
	
	
}
