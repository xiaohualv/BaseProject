<%@page language="java" contentType="text/plain; charset=UTF-8" pageEncoding="UTF-8"%><%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	out.println("Server");
	out.println("---------------");
	java.lang.Runtime r = java.lang.Runtime.getRuntime();
	try {
		java.net.InetAddress ia = java.net.InetAddress.getLocalHost();
		out.println("     HostName : " + ia.getCanonicalHostName());
		out.println("   IP Address : " + ia.getHostAddress());
	} catch (Exception e){
		
	}
	
	out.println("Jvm Mem Total : " + r.totalMemory());
	out.println(" Jvm Mem Free : " + r.freeMemory());
	
	out.println("");
	out.println("Request");
	out.println("---------------");
	out.println(" ContextPath : " + path);
	out.println("    BasePath : " + basePath);
	out.println(" Server Info : " + request.getLocalName()+ " | " + request.getLocalAddr() + " : " + request.getLocalPort());
	out.println(" Remote Info : " + request.getRemoteUser() + "@" + request.getRemoteHost() + " | " + request.getRemoteAddr() + " : " + request.getRemotePort());
	out.println("");
	out.println("        RemoteAddr : " + request.getRemoteAddr());
	out.println("         X-Real-IP : " + request.getHeader("X-Real-IP"));
	out.println("   x-forwarded-for : " + request.getHeader("x-forwarded-for"));
	out.println("   Proxy-Client-IP : " + request.getHeader("Proxy-Client-IP"));
	out.println("WL-Proxy-Client-IP : " + request.getHeader("WL-Proxy-Client-IP"));
	
	out.println("");
	out.println("Cookie");
	out.println("---------------");
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (int i = 0; i < cookies.length; i++) {
			out.print(cookies[i].getName() + "=" + cookies[i].getValue());
			out.print(" Domain:" + cookies[i].getDomain());
			out.print(" Path:" + cookies[i].getPath());
			out.println(" MAXAGE:" + cookies[i].getMaxAge());
		}
	}
	out.println("");
	out.println("Session");
	out.println("----------------");
	out.println("Session ID :" + session.getId());
	out.println("");
	
	java.util.Enumeration e = session.getAttributeNames();
	while (e.hasMoreElements()) {
		String name = (String) e.nextElement();
		String value = session.getAttribute(name).toString();
		out.println(name + " = " + value);
	}
%>