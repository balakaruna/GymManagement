<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>apple gym</title>
<link rel="stylesheet" href="Login.css" type="text/css"> 
    <link rel="icon" href="/media/favicon.ico.svg">


</head>
<body>

	 <div class="regform">
        <form action="loginServlet" method="post">
        <h1>SignUp</h1>
        <div class="input">
            <label class="textlable" for="name">User Name</label>
            <input type="text" name="name" id="name" placeholder="username" required>
        </div>
        <div class="input">
            <label class="textlable" for="password">Password</label>
            <input type="password" name="password" id="password" placeholder="password" required >
        </div>
        <div class="btn">
            <button type="submit"> Submit </button></div>







        </form>
    </div>
	

</body>
</html>