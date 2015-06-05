<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="pages/js/documentationList.js"></script>
<title>Consulta de documentaci&oacute;n</title>
</head>
<body>
<div class="table-responsive">
  <table class="table">
  	<thead>
  		<tr>
  			<th>Registro</th>
  			<th>Fecha de recepci&oacute;n</th>
  			<th>N&uacute;mero de oficio o entidad</th>
  			<th>Asunto</th>
  			<th>Nombre del recepcionista</th>
  		</tr>
  	</thead>
  	<c:forEach var="aDocumentation" items="${docList}">
  		<tr>
  			<td>  				
				<p><c:out value="${aDocumentation.registerIdentifier}"/></p>					
  			</td>
  			<td>
  				<p><c:out value="${aDocumentation.receptionDate}"/></p>
  			</td>
  			<td>
  				<p><c:out value="${aDocumentation.purposeNumber}"/></p>
  			</td>
  			<td>
  				<p><c:out value="${aDocumentation.entityName}"/></p>
  			</td>
  			<td>
  				<p><c:out value="${aDocumentation.description}"/></p>
  			</td>
  		</tr>
  	</c:forEach>
  </table>
</div>
</body>
</html>