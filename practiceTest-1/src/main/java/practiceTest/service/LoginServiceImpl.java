package practiceTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practiceTest.dto.LoginDto;
import practiceTest.dto.UserDto;
import practiceTest.mapper.LoginMapper;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginMapper loginmapper;
	
	@Override
	public UserDto login(LoginDto loginDto) throws Exception {
		
		return loginmapper.login(loginDto);
	}

}
