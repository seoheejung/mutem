<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<c:if test="${empty sessionScope.id}">
			<script type="text/javascript">
				alert("잘못된 경로입니다. 관리자모드는 로그인이 필요합니다.");
				location.href = "adminLogin"
			</script>
	</c:if>
		
	<jsp:include page="menu.jsp" />
	
	<div align="center" style="padding:30px;">
	<br><br><br>
		<div class="alert alert-light" role="alert">관리자 페이지입니다.</div>
			    <button type="button" class="btn btn-outline-secondary float-right btn-sm"  onClick="location.href='add'">템플릿 추가</button><br>
		<div class="table-responsive">
			<table class="table table-condensed  table-hover">
				<thead class="thead-light">
					<tr>
						<th>등록번호</th>
						<th>카테고리</th>
						<th class ="col-4">템플릿 이름</th>
						<th>유튜브 채널</th>
						<th>파일 형식</th>
						<th>프로그램</th>
						<th>등록날짜</th>
						<th>수정/삭제</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${allList}" var="tVO">
						<tr>
							<td>${tVO.tem_number}</td>
							<td>${tVO.tem_category}</td>
							<td>${tVO.tem_name}</td>
							<td>${tVO.tem_channel}</td>
							<td>${tVO.tem_format}</td>
							<td>${tVO.tem_program}</td>
							<td>${tVO.reg_date}</td>
							<td>
								<button type="button" class="btn btn-outline-dark"
									onclick="location.href='modify?tem_number=${tVO.tem_number}' ">수정</button>
								<button type="button" class="btn btn-outline-dark"
									onclick="location.href='delete?tem_number=${tVO.tem_number}' ">삭제</button>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>