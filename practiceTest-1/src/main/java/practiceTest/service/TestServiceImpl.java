package practiceTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practiceTest.dto.Dto;
import practiceTest.dto.SearchDto;
import practiceTest.mapper.TestMapper;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestMapper testMapper;
	
	@Override
	public List<Dto> selectFanboardList(int celebrityIdx) throws Exception {
		return testMapper.selectFanboardList(celebrityIdx);
	}
	
	@Override
	public Dto selectCelebrityName(int celebrityIdx) throws Exception{
		return testMapper.selectCelebrityName(celebrityIdx);
	}
	
}
