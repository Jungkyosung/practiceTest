package practiceTest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import practiceTest.dto.Dto;

@Mapper
public interface TestMapper {
	public List<Dto> selectFanboardList(int celebrityIdx) throws Exception;
	
	public Dto selectCelebrityName(int celebrityIdx) throws Exception;
}
