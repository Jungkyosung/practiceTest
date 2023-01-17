package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.CacheAspect;
import aspect.ExecuteTimeAspect;
import spring.Calculator;
import spring.ImplCalculator;
import spring.RecuCalculator;

@Configuration
@EnableAspectJAutoProxy
public class AppCtx {
	
	@Bean
	public CacheAspect cacheAspect() {
		return new CacheAspect();
	}
	
	@Bean
	public ExecuteTimeAspect executeTimeAspect() {
		return new ExecuteTimeAspect();
	}
	
	@Bean
	public Calculator implCalculator() {
		return new ImplCalculator();
	}
	
	@Bean
	public Calculator recuCalculator() {
		return new RecuCalculator();
	}
}
