package student.dto;

import lombok.Data;

@Data
public class StudentDto {
	
	private int studentIdx;
	private String studentName;
	private String specialty;
	private String email;
	private String registDt;
	private String registId;
	private String deletedYn;//나중에 필요없으면 삭제
	
}

