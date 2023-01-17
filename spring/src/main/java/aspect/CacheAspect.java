package aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CacheAspect {
	
	private Map<Long, Object> cache = new HashMap<>();
	
	@Pointcut("executioin(public * spring..*(long))")
	public void cacheTarget() {
		
		
	}
	
	@Around("cacheTarget()")
	public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
		//원래 수행할 기능(factorial 계산)에 전달된 매개변수가 
		//cache 해쉬 맵에 포함되어 있으면 해쉬 맵에서 결과를 가져와서 반환
		//없다면 저장하고 결과 반환
		
		long num = (Long)joinPoint.getArgs()[0];
		if (cache.containsKey(num)) {
			System.out.printf("CacheAspect: cache에서 가져옮 [ %d]\n",num);
			return cache.get(num);
		}
			Object result = joinPoint.proceed();
			cache.put(num,  result);
			
			return result;
	}
}