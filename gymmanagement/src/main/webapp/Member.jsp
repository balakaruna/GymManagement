<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="Member.css">
    <link rel="icon" href="/i">
</head>
<body>
	
	<div>
        <nav>
            <div class="logo">
                <p>Apple gym</p>
            </div>
            <ul>
             <li><a href="http://localhost:8080/gymmanagement/HomePage.jsp">Home</a></li>
             <li><a href="http://localhost:8080/gymmanagement/Member.jsp">Member</a></li>
             <li><a href="http://localhost:8080/gymmanagement/Trainer.jsp">Trainer</a></li>
             <li><a href="http://localhost:8080/gymmanagement/Attendance.jsp">Attendance</a></li>
             <li><a href="http://localhost:8080/gymmanagement/Billing.jsp">Billing</a></li>
            </ul>
        </nav>

    </div>
    <br>
    <br>
    <br>  
    <div class="memdetail">
  <form action="memberServlet" method="post">
    <h1>Members Details</h1>
    <div class="memberform">
        <label class="memlabel" for="name">Name</label>
        <input class="mem" type="text" name="name" id="name" required>
    </div>
    <div class="memberform">
        <label class="memlabel" for="dateOfBirth">DOB</label>
        <input class="mem" type="date" name="dateOfBirth" id="dateOfBirth" required>
    </div>
    <div class="memberform">
        <label class="memlabel" for="address">Address</label>
        <input type="text" name="address" id="address" required>
    </div>
    <div class="memberform">
        <label class="memlabel" for="contact">Contact Number</label>
        <input type="number" name="contact" id="contact" required>
    </div>
    <div class="memberform">
        <label class="memlabel"  for="email">Email</label>
        <input type="email" name="email" id="email" required>
    </div>
    <div class="memberform">
        <label class="memlabel" for="trainerId">Trainer Id</label>
        <input type="number" name="trainerId" id="trainerId" required>
    </div>
    <div class="btn">
        <button type="submit">SUBMIT</button>

    </div>
    
  </form>
    </div>
	
</body>
</html>