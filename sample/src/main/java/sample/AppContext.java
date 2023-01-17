package sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {	//해당 클래스를 스프링 설정 클래스로 지정.
	@Bean	//해당 메소드가 생성한 객체를 스프링이 관리하는 빈 객체로 등록하겠다.
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요");
		return g;
	}
}
