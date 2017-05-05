<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
if (request.getHeader("accept").indexOf("application/json") > -1
		|| (request.getHeader("X-Requested-With") != null && request.getHeader("X-Requested-With").indexOf(
				"XMLHttpRequest") > -1)) {

	// JSON格式返回
	response.setStatus(200);
	response.setContentType("application/json;charset=UTF-8");
	response.setCharacterEncoding("UTF-8");
	com.qimooc.common.model.JsonResult<String> jsonResult = new com.qimooc.common.model.JsonResult<String>(404,"Not Found -  未找到");
	
	String jsonResultString = com.qimooc.common.util.JsonUtils.toJson(jsonResult);
	
	System.out.println(jsonResultString);
	
	response.getWriter().write(jsonResultString);
	response.getWriter().flush();

} else {
	out.println("404 Not Found - 未找到");
}
%>