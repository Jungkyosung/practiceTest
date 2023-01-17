package jstg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jstg.dto.ArtistDto;
import jstg.dto.MemberDto;
import jstg.dto.NoticeDto;
import jstg.dto.ProfileDto;
import jstg.mapper.JstgMapper;

@Service
public class JstgServiceImpl implements JstgService {

	@Autowired
	private JstgMapper jstgMapper;
	
	@Override //게시글 목록 조회
	public List<NoticeDto> selectNboardList() throws Exception {
		return jstgMapper.selectNboardList();
	}

	@Override //게시글 상세 조회
	public NoticeDto selectNboardDetail() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override //아티스트 목록 페이지 조회
	public List<ArtistDto> selectArtistList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override //아티스트별 멤버 목록 조회
	public List<MemberDto> selectMemberList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override //프로필 화면에서 멤버목록의 멤버명을 누르면 해당 멤버의 이름 조회
//	public List<ProfileDto> selectProfile() throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override //아티스트 목록 페이지 조회
	public List<ProfileDto> selectProfileList() throws Exception {
		return jstgMapper.selectProfileList();
	}
	
	@Override //아티스트 목록 페이지 조회
	public ProfileDto selectProfileDetail(int profileIdx) throws Exception {
		return jstgMapper.selectProfileDetail(profileIdx);
	}
	

}
