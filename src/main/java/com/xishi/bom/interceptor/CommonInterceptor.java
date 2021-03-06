package com.xishi.bom.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


/**
 * @Description: 公共拦截器，用于拦截一个帐号多个人使用
 * @author: 赵天祥
 * @date: 2015年2月2日
 */
public class CommonInterceptor implements HandlerInterceptor {

	protected Logger logger = Logger.getLogger(CommonInterceptor.class);
	
//	private String mappingURL;//利用正则映射到需要拦截的路径    
//    public void setMappingURL(String mappingURL) {    
//           this.mappingURL = mappingURL;    
//   }   
	
//	@Autowired
//	private LoginService loginService;


	/** 
     * 在业务处理器处理请求之前被调用 
     * 如果返回false 
     *     从当前的拦截器往回执行所有拦截器的afterCompletion(),再退出拦截器链 
     *  
     * 如果返回true 
     *    执行下一个拦截器,直到所有的拦截器都执行完毕 
     *    再执行被拦截的Controller 
     *    然后进入拦截器链, 
     *    从最后一个拦截器往回执行所有的postHandle() 
     *    接着再从最后一个拦截器往回执行所有的afterCompletion() 
     */ 
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url=request.getRequestURL().toString();
        if(url.contains("/LoginController/")){
        	return true;  
        }else {
//        	String userId = request.getParameter("userId");
//        	String oldSessionId = request.getParameter("sessionId");
//        	boolean flg = loginService.isNeedLoginAgain(userId,oldSessionId);
//        	if (flg) {//需要重新登录
//        		logger.info("session冲突，参数:userId="+userId+",sessionId="+oldSessionId);
//        		response.setContentType("application/json; charset=utf-8");  
//        		response.getWriter().print("{\"respCode\":\"9999\",\"respMsg\":\"此帐号已经在其他设备登录，请重新登录\"}");
//        		return false;   
//        	}else {
//        		return true;
//        	}
        	return false;
		}
	}
	//在业务处理器处理请求执行完成后,生成视图之前执行的动作
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	/** 
     * 在DispatcherServlet完全处理完请求后被调用  
     *  
     *   当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion() 
     */  
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
