<html>
<head>
    <title> Spring Boot Project</title>
<link href="/bootstrap.min.css" rel="stylesheet">
    <script src="/jquery-2.2.1.min.js"></script>
    <script src="/bootstrap.min.js"></script>
</head>
<body bgcolor="pink">
<div class="container" style="margin:50px" align="center">
    <div class="row text-center"><strong> User Details</strong></div>
        <p>Hello Friend,  to view the Login page.</p>
        <c:forEach var="user" items="users">
        <div class="row" style="border: 5px solid green; padding: 20px">
			 <form action="welcome"method="post">
				<input type="text" name="name" placeholder="Name"><br>
				<br> <input type="email" name="email" placeholder="Email"><br>
				<br> <input type="text" name="address" placeholder="Address"><br>
				<br>
				<input type="submit" placeholder="Submit"><br><br>
			</form> 
			</div>
			</div>
		</c:forEach>
		<a href="/dashboard"><strong>Click here</strong></a>        
   </div>
   
</body>
</html>