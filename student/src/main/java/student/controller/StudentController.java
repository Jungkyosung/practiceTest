package student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import student.dto.StudentDto;
import student.service.StudentService;

//student가 아닌 board로 바꿔야 할 지도 모르겠음. 애초에 게시판(board)여서

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/student/openStudentList.do") //*일단 board로 냅두겠음
	public ModelAndView openStudentList() throws Exception{
		ModelAndView mv = new ModelAndView("/student/studentList");
		
		List<StudentDto> list = studentService.selectStudentList();
		mv.addObject("list", list);
		
		return mv;
	}
	
	
	@RequestMapping("/student/openStudentWrite.do")
	public String openStudentWrite() throws Exception {
		return "/student/studentWrite";
	}
	
	@RequestMapping("/student/insertStudent.do")
	public String insertStudent(StudentDto studentDto) throws Exception{
		studentService.insertStudent(studentDto);
		return "redirect:/student/openStudentList.do";
	}
	
	@GetMapping("/student/openStudentDetail.do")
	
	public ModelAndView openStudentDetail(@RequestParam int studentIdx) throws Exception{
		   ModelAndView mv = new ModelAndView("/student/studentDetail");
		   
		   StudentDto studentDto = studentService.selectStudentDetail(studentIdx);
		   mv.addObject("student", studentDto);
		   
		   return mv;
	}
	
	
	
	//업데이트
	@RequestMapping("/student/updateStudent.do")
	public String updateStudent(StudentDto studentDto) throws Exception{
		studentService.updateStudent(studentDto);
		return "redirect:/student/openStudentList.do";
		
	}
	
	//삭제
	@RequestMapping("/student/deleteStudent.do")
	public String deleteStudent(StudentDto studentDto) throws Exception{
		studentService.deleteStudent(studentDto);
		return "redirect:/student/openStudentList.do";
	}
	
	
	
}
