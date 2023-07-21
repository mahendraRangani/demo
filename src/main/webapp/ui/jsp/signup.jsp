<%@ page language="java"  contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
form{
background-color: #89f5ee;
width: 300px;
height: 400 px;
border-style: solid;
border-color: blue;
padding: 10px;
}
</style>

<div>
<form action="/set-user"method="post">
<div><h2>Register Page</h2>
</div><br><br>
<div>UserName: <input type="text"name="userName" valu="">
</div><br><br>
<div>Password: <input type="text"name="password1"valu="">
</div><br><br>
<div>Retype Password: <input type="text"name="password2"valu=""></div><br>
<div><input type="submit"valu="Register"  style="background-color: red;"></div>

</form>
</div>





