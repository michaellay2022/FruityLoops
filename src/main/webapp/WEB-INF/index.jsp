<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.util.Date"%>
    
   <!-- c:out ; c:forEach ; c:if -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   <!-- Formatting (like dates) -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
   <!-- form:form -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
   <!-- for rendering errors on PUT routes -->
 <%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Default for Java Spring</title>
  <!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
      rel="stylesheet" 
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
      crossorigin="anonymous">
      
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>
    <div class="container"> <!-- Beginning of Container -->
    <a class="btn btn-primary float-end mt-2" href="/dashboard">Dashboard</a>
    <h1>Welcome to the Fruit Store!</h1>
    
    <table class="table">
            <thead>
                <tr class=t_roll>
                   
                    <th scope="col">Name:</th>
                    <th scope="col">Price ($)</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="i" items ="${fruitsFromMyController}">
                <tr>
                    <td><c:out value="${i.name}"></c:out></td>
                    <td><c:out value="${i.price}"></c:out></td>
                </tr>
                </c:forEach>
            </tbody>

    </table>
    	
    </div> <!-- End of Container -->
</body>
</html>