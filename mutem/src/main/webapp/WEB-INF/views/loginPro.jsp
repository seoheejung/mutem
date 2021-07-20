<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${check == 1}">

<c:set var="id" value="${id}" scope="session" />
	<script type="text/javascript">
		alert("관리자님 안녕하세요.");
		location.href = "admin";
	</script>
</c:if>

<c:if test="${check != 1}">
	<script type="text/javascript">
		alert("관리자가 아닙니다.");
		location.href = "adminLogin";
	</script>
</c:if>
