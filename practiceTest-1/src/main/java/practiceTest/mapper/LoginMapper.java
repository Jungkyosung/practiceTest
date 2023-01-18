package practiceTest.mapper;

import org.apache.ibatis.annotations.Mapper;

import practiceTest.dto.LoginDto;
import practiceTest.dto.UserDto;

@Mapper
public interface LoginMapper {
	public UserDto login(LoginDto loginDto) throws Exception;
}
