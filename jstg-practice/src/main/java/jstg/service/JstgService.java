package jstg.service;

import java.util.List;

import jstg.dto.ArtistDto;
import jstg.dto.MemberDto;
import jstg.dto.NoticeDto;
import jstg.dto.ProfileDto;

public interface JstgService {
	
	
	//게시글 목록 조회
	public List<NoticeDto> selectNboardList() throws Exception;
	
	//게시글 상세조회
	public NoticeDto selectNboardDetail() throws Exception;
	
	//아티스트 목록 페이지 조회
	public List<ArtistDto> selectArtistList() throws Exception;
	
	//아티스트별 멤버목록 조회
	public List<MemberDto> selectMemberList() throws Exception;
	
	//프로필 화면에서 멤버목록의 멤버명을 누르면 해당 멤버의 이름 조회
	//public List<MemberDto> selectMemberNameById() throws Exception;

	//아티스트 목록 페이지 조회
	public List<ProfileDto> selectProfileList() throws Exception;
	
	//아티스트idx에 따른 프로필 내용 조회
	public ProfileDto selectProfileDetail(int profileIdx) throws Exception;
}
