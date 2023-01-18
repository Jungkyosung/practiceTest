package practiceTest.service;

import practiceTest.dto.LoginDto;
import practiceTest.dto.UserDto;

public interface LoginService {
	public UserDto login(LoginDto loginDto) throws Exception;
}
