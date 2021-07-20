<%@ page contentType="text/html; charset=utf-8"%>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<script 	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script 	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
html {
	font-size: 95%
}
@media ( min-width : 768px) {
	.container {
		width: 750px;
	}
}
@media ( min-width : 992px) {
	.container {
		width: 940px;
	}
}
@media ( min-width : 1200px) {
	.container {
		width: 940px;
	}
}
</style>


<title>무템 - 무료템플릿 모음 사이트</title>
<!-- 화면 변경 크기와 navbar의 배경색, 글자색 변경 -->
<!-- 화면 위쪽에 고정하기 위해 fixed-top 클래스 추가 -->
<nav class="navbar navbar-expand-md navbar-light fixed-top" 	style="background-color: #9494F7;">
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarsExample03" aria-controls="navbarsExample03"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<!-- navbar-brand의 content 변경 -->
	<div class="collapse navbar-collapse" id="navbarsExample03" style="padding: 0px 50px 0px 50px;">  
		<a class="navbar-brand" href="/mutem">무템</a>
		<ul class="navbar-nav mr-auto">
			<li class="nav-link"><a class="nav-link"  href="/mutem/allList">모든템플릿</a></li>
			<li class="nav-link"><a class="nav-link"  href="/mutem/list">추천템플릿 <span class="sr-only">(current)</span></a>
			</li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
				role="button" aria-haspopup="true" aria-expanded="false">개발자 </a>
				<div class="dropdown-menu pull-right">
					<a class="dropdown-item disabled" href="#">서희정</a> 
					<a class="dropdown-item disabled" href="#">010-997-4928</a>
					<a class="dropdown-item" href="adminLogin">관리자모드</a>
					<c:if test="${!empty sessionScope.id}">
						<a class="dropdown-item" href="adminLogout">로그아웃</a></c:if>
			</li>
					</div>
			</li>
			</ul>
		</div>
</nav>
