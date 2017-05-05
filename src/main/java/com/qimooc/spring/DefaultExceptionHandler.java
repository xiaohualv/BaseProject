package com.qimooc.spring;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.qimooc.common.model.JsonResult;
import com.qimooc.common.util.JsonUtils;

@ControllerAdvice
public class DefaultExceptionHandler {
	/**
	 * 没有权限 异常
	 * <p/>
	 * 后续根据不同的需求定制即可
	 */
	
	@ExceptionHandler({ Exception.class })
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView processException(NativeWebRequest request, HttpServletResponse response, Exception e) {
		
		if (request.getHeader("accept").indexOf("application/json") > -1
				|| (request.getHeader("X-Requested-With") != null && request.getHeader("X-Requested-With").indexOf(
						"XMLHttpRequest") > -1)) {

			// JSON格式返回
			int statusCode = HttpStatus.INTERNAL_SERVER_ERROR.value();
			String message = "Internal Server Error -  内部错误 : " + e.getMessage();
			responseJson(response, statusCode, message);
			return null;

		} else {
			String viewName = "error/unauthorized";
			return responsePage(request,viewName, e);
		}

	}
	
	@ExceptionHandler({ ServletException.class })
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ModelAndView processNotFoundException(NativeWebRequest request, HttpServletResponse response, ServletException e) {
		
		if (request.getHeader("accept").indexOf("application/json") > -1
				|| (request.getHeader("X-Requested-With") != null && request.getHeader("X-Requested-With").indexOf(
						"XMLHttpRequest") > -1)) {
			
			// JSON格式返回
			int statusCode = HttpStatus.NOT_FOUND.value();
			String message = "Not Found -  未找到 : " + e.getMessage();
			responseJson(response, statusCode, message);
			return null;
			
		} else {
			String viewName = "error/unauthorized";
			return responsePage(request,viewName, e);
		}
		
	}

	private void responseJson(HttpServletResponse response, int statusCode, String message) {
		
		try {
			response.setStatus(200);
			response.setContentType("application/json;charset=UTF-8");
			JsonResult<Object> jsonResult = new JsonResult<Object>(statusCode,message);
			
			PrintWriter writer = response.getWriter();
			writer.write(JsonUtils.toJson(jsonResult));
			writer.flush();
		} catch (IOException exx) {
			exx.printStackTrace();
		}
	}

	private ModelAndView responsePage(NativeWebRequest request, String viewName, Exception e) {
		
		if ("Y".equals(request.getParameter("debug"))) {
			// 视图显示专门的错误页
			ModelAndView modelAndView = new ModelAndView("error/debug");
			modelAndView.addObject("exception", e);
			modelAndView.addObject("url", "abcd");
			return modelAndView;
		} else {
			ModelAndView mv = new ModelAndView("error/error");
			// mv.addObject("exception", e);
			mv.setViewName(viewName);
			return mv;
		}
	}

}
