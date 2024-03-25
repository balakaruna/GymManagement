<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="Billing.css"> 
    <link rel="icon" href="/media/favicon.ico.svg">


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
    <div class="billingform">
        <h1>Billing</h1>
        <form action="billingServlet" method="post">
            <div class="b1">
                <label class="blabel" for="search">Search</label>
                <input type="search" name="search" id="search" placeholder="MemberId">
            </div>
    <div class="b1">
        <label class="blabel" for="amount">Amount</label>
        <input type="number" name="amount" id="amount">
    </div>
      
 <div class="btn">
    <button type="submit">SUBMIT</button>
 </div>
   </form>

    </div>


</body>
</html>