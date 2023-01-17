package student.service;

import java.util.List;

import student.dto.StudentDto;

public interface StudentService {
	public List<StudentDto> selectStudentList() throws Exception;
	public void insertStudent(StudentDto studentDto) throws Exception;
}
