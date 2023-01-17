package student.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import student.dto.StudentDto;

@Mapper
public interface StudentMapper {
	List<StudentDto> selectStudentList() throws Exception;
	void insertStudent(StudentDto studentDto) throws Exception;
}
