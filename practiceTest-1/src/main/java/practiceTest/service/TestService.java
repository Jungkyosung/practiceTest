package practiceTest.service;

import java.util.List;

import practiceTest.dto.Dto;
import practiceTest.dto.SearchDto;

public interface TestService {

	
	List<Dto> selectFanboardList(int celebrityIdx) throws Exception;
	
	Dto selectCelebrityName(int celebrityIdx) throws Exception;
}
