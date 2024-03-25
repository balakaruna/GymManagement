<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="Attendance.css">
    <link rel="icon" href="/">


</head>
<body>

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
    <div>
        <br>
        <br>
        <br>
        <br>
        
        <div class="attendanceform">

            <form action="attendanceServlet" method="post">
                <h1>Attendance</h1>
                <br>
                <br>
                <br>
                <div class="at">
                    <label class="atlabel" for="memberId">Member Id</label>
                    <input type="number" name="memberId" id="memberId">  
                </div>
                <br>
                <br>
                <br>
                <div class="at">
                    <input  type="radio" name="check" id="IN" value="IN">
                    <label class="atlabel1" for="check">IN</label>
                    <input type="radio" name="check" id="OUT" value="OUT">
                    <label class="atlabel1" for="check">OUT</label>
                </div>
                <br>
                <br>
                <br>
            <div class="btn">
               <button type="submit">Submit</button>
            </div>
        
       
    
            </form>
        </div>
        </div>
	

</body>
</html>