package student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.dto.StudentDto;
import student.mapper.StudentMapper;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public List<StudentDto> selectStudentList() throws Exception {
		return studentMapper.selectStudentList();
	}
	
	@Override
	public void insertStudent(StudentDto studentDto) throws Exception {
		studentMapper.insertStudent(studentDto);
	}
	
	@Override
	public void updateStudent(StudentDto studentDto) throws Exception{
		studentMapper.updateStudent(studentDto);
	}
	
	@Override
	public void deleteStudent(int studentIdx) throws Exception{
		studentMapper.deleteStudent(studentIdx);
	}
	
	@Override
	public StudentDto selectStudentDetail(int studentIdx) throws Exception{
		return studentMapper.selectStudentDetail(studentIdx);
	}
}
