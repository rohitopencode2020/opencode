<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
 <form:form method="POST" action="uploadFile" enctype="multipart/form-data" modelAttribute="fileUploadModel">
        File to Upload: <input type="file" name="file"></br> </br> 
        Name: <input type="text" name="name"><br /> </br> 
        <input type="submit" value="Upload"></br>
        <form:errors path="file" style="color:red;"/>
 </form:form>
</body>
</html>