package jstg.dto;

import lombok.Data;

@Data
public class ProfileDto {
	private int profileIdx;
	private String profileName;
	private String profileContents;
	private String profileImage;
	private String profileUrl;
	private int[] member;
	
}
