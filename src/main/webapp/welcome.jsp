<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Welcome</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="./welcome.jsp">Home</a>
			</div>
		</div>
	</nav>

	<%!
	// 변수 또는 메서드 선언 
	String greeting = "웹 쇼핑몰에 오신 것을 환영합니다.";
	String tagline = "Welcome to Web Market!";%>
	
	<!-- 전체 패딩 5만큼 (3이 중간임) -->
	<!-- bg-primary : 기본 색상 -->
	<!-- text white : 글자 하얗게 -->
	<div class="p-5 bg-primary text-white">
		<!-- cotainer: 좌우 가운데 정렬 -->
		<div class="container">
			<!-- display-3: 글자크기(큰 글자 중 보통) -->
			<h1 class="display-3">
				<%=greeting%>
			</h1>
		</div>
	</div>

	<div class="container">
	    <div class="text-center">
	        <h3>
	            <%=tagline%>	       
	        </h3>	        
	        <%
	        //시간 함수	        
	        Date today = new Date();
	        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");	        
	        out.println("현재 접속 시간: " + format.format(today));	     
	        %>
	        	        
	    </div>
	</div>
	<footer class="container">
		<p>&copy; WebMarket </p>
	</footer>

</body>
</html>