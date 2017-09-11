<%@ page pageEncoding="utf-8" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<title>Login</title>
<body>
<s:form action="login" method="POST">
    <s:textfield name="user.name" />
    <s:password name="user.password"/>
    <s:submit value="Login"/>
</s:form>
</body>
</html>