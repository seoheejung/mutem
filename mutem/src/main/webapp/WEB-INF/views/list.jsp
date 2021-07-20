<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div align="center" style="padding:50px;">
<br><br>
<div class="alert alert-light" role="alert">
   무템이 직접 제안하는 <b>추천 템플릿</b>을 만나 보세요
</div>

		<div class="container" >
		<hr>
			<div class="row" align="center" 	 style="word-break: break-all; word-wrap: break-word;">
				<c:forEach items="${list}" var="tVO">
					<div class="col-6 col-md-4" style="height: 460px;">
					<div class="card" style="width: 100%;">
					<div class="card-header ">
						<a href="${tVO.tem_link}" target="_blank">  
						<img src="https://img.youtube.com/vi/${tVO.tem_linkshare}/mqdefault.jpg" style="max-width: 100%; height: auto;"> </a>
 					 </div>
						<ul class="list-group list-group-flush">
							<li class="list-group-item" style="height: 70px;">${tVO.tem_name}
								<c:if test="${tVO.recommendation eq 1}">
									<span class="badge badge-secondary">추천</span>
								</c:if></li>
							<li class="list-group-item">
								<span class="badge badge-primary">${tVO.tem_category}</span> 
								<span class="badge badge-light">${tVO.tem_program}</span>
								<span class="badge badge-light">${tVO.tem_format}</span></li>
							<li class="list-group-item">${tVO.tem_channel}</li>
							<li class="list-group-item">
							<a href="${tVO.tem_link}" class="btn btn-secondary" role="button" target="_blank"> 해당 영상 이동 &raquo;</a></li>
						</ul>
					</div>
					</div>
				</c:forEach>
			</div>
			<hr>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>