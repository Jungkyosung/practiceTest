package student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import student.dto.StudentDto;
import student.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/student/openStudentList.do")
	public ModelAndView openStudentList() throws Exception {
		ModelAndView mv = new ModelAndView("/student/studentList");
		
		List<StudentDto> list = studentService.selectStudentList();
		mv.addObject("list", list);
		
		return mv;
	}
	
	@RequestMapping("/student/openStudentWrite.do")
	public String openStuentWrite() throws Exception {
		return "/student/studentWrite";
	}
	
	@RequestMapping("/student/insertStudent.do")
	public String insertStudent(StudentDto studentDto) throws Exception {
		studentService.insertStudent(studentDto);
		return "redirect:/student/openStudentList.do";
	}
}
