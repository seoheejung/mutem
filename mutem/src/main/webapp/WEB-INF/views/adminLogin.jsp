<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<jsp:include page="menu.jsp" />
<body>
	<div align="center" style="padding:50px;">
<br><br>
<div class="alert alert-light" role="alert">
   관리자모드는 로그인이 필요합니다.
</div>
		<div class="container">
			<div class="col-md-4 col-md-offset-4">
				<c:if test="${empty sessionScope.id}">
				<form class="form-signin" action="login" method="post">
					<div class="form-group">
						<label for="inputUserName" class="sr-only">admin id</label>
						 <input type="text" class="form-control" placeholder="ID" name="id" required autofocus>
					</div>
					<div class="form-group">
						<label for="inputPassword" class="sr-only">admin password</label>
						<input type="password" class="form-control" placeholder="Password"  name="pw"  required>
					</div>
					<button class="btn btn-primary  btn-block"  id="login"> 로그인</button>
					</form>
				</c:if>
				
				<c:if test="${!empty sessionScope.id}">
					<c:redirect url="admin"/>
				</c:if>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>