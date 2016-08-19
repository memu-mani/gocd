<!DOCTYPE html>
<%@page import="com.servlets.*"%>
<html>
<head>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


</head>

<body>
<%
StoreLocator sl=new StoreLocator();
sl.locate();
%>
</body>
</html>