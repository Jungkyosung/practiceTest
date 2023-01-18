package practiceTest.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginCheckInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		//요청 주소에 /test가 포함된 경우, 세션에 user정보가 존재하는지 체크
		//포함되지 않은 경우 메시지와 함계 login페이지로 이동
		if (request.getRequestURI().indexOf("/test")>= 0 && request.getSession().getAttribute("user") == null) {
			request.getSession().setAttribute("message","로그인 후 사용할 수 있습니다.");
			response.sendRedirect("/login");
			return false;
		} else {
			return true;
		}
	}

}
