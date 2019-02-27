package app.inter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class FirstInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object obj, Exception e)
			throws Exception {
		// TODO Auto-generated method stub
     System.out.println("in after completion");
	}

	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object obj, ModelAndView m)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in interceptor posthandle");

	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object obj) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in interceptor prehandle");
		String s=req.getParameter("name");
		req.setAttribute("am", s);
		return true;
	}

}
