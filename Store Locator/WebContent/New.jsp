<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
var directionsService = new google.maps.DirectionsService();
var directionsDisplay = new google.maps.DirectionsRenderer();

var map = new google.maps.`Map(document.getElementById('map'), {
  zoom:7,
  mapTypeId: google.maps.MapTypeId.ROADMAP
});
<%;
String result = (String)request.getAttribute("res");%>

directionsDisplay.setMap(map);
directionsDisplay.setPanel(document.getElementById('panel'));
var query_string = {};
var query = window.location.search.substring(1);
var vars = query.split("&");
//alert(vars);
	var orign=vars[0];//jQuery.url.param("origin");//'Nandavanam Road,Palayam,Trivandrum,Kerala';
	var dest=vars[1];//jQuery.url.param("destination");//'kolkata';
	
var request = {
  origin: orign, 
  destination: dest,
  travelMode: google.maps.DirectionsTravelMode.DRIVING
};

directionsService.route(request, function(response, status) {
  if (status == google.maps.DirectionsStatus.OK) {
    directionsDisplay.setDirections(response);
  }
});

</script>
</head>
<body>

</body>
</html>