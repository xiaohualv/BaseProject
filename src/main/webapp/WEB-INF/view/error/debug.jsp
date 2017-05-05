<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Inernal Server Error</title>
</head>
<body>
<div>
<h2>Inernal Server Error : 服务器内部错误 ! </h2>
<div style='font-family:"courier new";color:#FFF;'>
<%
	Exception ex = (Exception) request.getAttribute("exception");
%>
<h3>Exception:<%=ex.getMessage()%></h3>
<pre>
<%
	ex.printStackTrace(new java.io.PrintWriter(out));
%>
</pre>
</div>
</div>
</body>
</html>

