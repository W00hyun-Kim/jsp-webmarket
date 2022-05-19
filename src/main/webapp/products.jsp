<%@page import="dao.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="dto.Product" %>
 
<!-- Action Tag -->
<jsp:useBean id="repository" class="dao.ProductRepository" scope="session" />  
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Item List</title>
</head>
<body>
	<%
	//ProductRepository repository = new ProductRepository();
	List<Product> products = repository.getAllProducts();
	
	for(Product product: products) {
		out.println(product.toString() + "<br><br>");
	}
	
	
	%>
</body>
</html>