<%@ page language="java"  contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
form{
background-color: skyblue;
width: 300px;
height: 200 px;
border-style: solid;
border-color: blue;
padding: 10px;
}
</style>

<div>
<form action="/login"method="post">
<c:if test="${not empty  error}">
<div style="background-color: red;"><h3>${error }</h3></div>
</c:if>
<c:if test="${not empty  registerSucess}">
<div style="background-color: yellow;"><h3>${registerSucess }</h3></div>
</c:if>
<c:if test="${not empty  registerError}">
<div style="background-color: pink;"><h3>${registerError }</h3></div>
</c:if>
<div>UserName: <input type="text"name="userName"valu=""></div><br><br>
<div>Password: <input type="text"name="password"valu=""></div><br>
<div><input type="submit"valu="Login"style="background-color: yellow;"></div><br>
<div><input type="button"valu="Register" onclick="goToRegister()" style="background-color: red;"></div>

</form>
</div>

<script type="text/javascript">
function goToRegister(){
	alert("go to register");
	window.location.href="/register";
}
</script>



