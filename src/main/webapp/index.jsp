<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导航</title>
</head>
<body>

	<div style="margin: 0 auto;margin-top: 100px; text-align: center;">
	
		<a href="topage.html?pagename=oneUpload">单文件上传</a><br><br>
		<a href="topage.html?pagename=moreUpload">多文件上传</a><br><br>
		<a href="download.html?fileName=1.jpg">文件下载 1.jpg (请确保文件存在)</a><br><br>
		<a href="topage.html?pagename=i18n">国际化</a><br><br>
		<a href="topage.html?pagename=login">验证码</a><br>
	
	</div>

</body>
</html>