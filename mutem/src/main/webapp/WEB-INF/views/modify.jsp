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
	<div align="center" style="padding:50px;">
		<br><br>
		<div class="alert alert-light" role="alert">템플릿을 수정하세요.</div>

		<div class="container" >
			<hr>
			<form name="addTemplate" action="modifyTemplate"
				class="form-horizontal" method="post">
				<input type="hidden" class="btn btn-primary" name="tem_number"
					value="${modify.tem_number}">
				<div class="form-group row">
					<label class="col-6 col-md-4">카테고리</label>
					<div class="col-6 col-md-4">
						<input type="text" name="tem_category" class="form-control"
							value="${modify.tem_category}">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-6 col-md-4">템플릿 이름</label>
					<div class="col-6 col-md-4">
						<input type="text" name="tem_name" class="form-control"
							value="${modify.tem_name}">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-6 col-md-4">유튜브 채널</label>
					<div class="col-6 col-md-4">
						<input type="text" name="tem_channel" class="form-control"
							value="${modify.tem_channel}">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-6 col-md-4">유튜브 링크</label>
					<div class="col-6 col-md-4">
						<textarea name="tem_link" cols="50" rows="2" class="form-control">${modify.tem_link}</textarea>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-6 col-md-4">유튜브 동영상 코드</label>
					<div class="col-6 col-md-4">
						<input type="text" name="tem_linkshare" class="form-control"
							value="${modify.tem_linkshare}">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-6 col-md-4">파일 형식 (포맷)</label>
					<div class="col-6 col-md-4">
						<input type="text" name="tem_format" class="form-control"
							value="${modify.tem_format}">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-6 col-md-4">프로그램</label>
					<div class="col-6 col-md-4">
						<input type="radio" name="tem_program" value="프리미어프로">
						PremierePro <input type="radio" name="tem_program" value="애프터이펙트">
						AfterEffects
					</div>
				</div>
				<div class="form-group row">
					<label class="col-6 col-md-4">추천</label>
					<div class="col-6 col-md-4">
						<input type="radio" name="recommendation" value=1> O <input
							type="radio" name="recommendation" value=0 checked> X
					</div>
				</div>
				<div class="form-group row">
					<div class="col-sm-offset-2 col-sm-10 ">
						<input type="submit" class="btn btn-primary" value="등록">
						<input type="button" class="btn btn-primary" value="취소"
							onclick="history.back(-1);">
					</div>
				</div>
			</form>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>