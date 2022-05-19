<%@page import="dao.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="dto.Product" %>
 
<!-- Action Tag -->
<!-- session : This server is based on TomCat server. need to know what session is. -->
<!--  when you use code below, server will reuse it -->
<jsp:useBean id="repository" class="dao.ProductRepository" scope="session" />  
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Item List</title>
</head>
<body>
	<%
	//when using code below, server will update seperately.
	//ProductRepository repository = new ProductRepository(); 
	List<Product> products = repository.getAllProducts();
	
	for(Product product: products) {
		out.println(product.toString() + "<br><br>");
	}
	
	
	%>
</body>
</html>