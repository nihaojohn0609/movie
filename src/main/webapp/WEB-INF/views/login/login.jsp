<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MYCGV</title>
<link rel="stylesheet" href="http://localhost:9000/css/mycgv_jsp.css">
<script src="http://localhost:9000/js/jquery-3.6.4.min.js"></script>
<script src="http://localhost:9000/js/mycgv_jsp_jquery.js"></script>
<script>
	let join_result = "${join_result}";
	if(join_result == 'ok'){
		alert("회원가입에 성공하셨습니다.");
	}
	
	/*
	$(document).ready(function(){
		$("#btnLogin").click(function(){
			var vForm = $("#loginForm");
			var formData = new FormData(vForm[0]);
			
			$.ajax({
				type: "POST",
				url: "login_proc.do",
				async: true,
				dataType: "json",
				contentType: false, //Ajax로 이메일 보낼 때 필수 추가 하여야 합니다.
				processData: false, //Ajax로 이메일 보낼 때 필수 추가 하여야 합니다.
				data: formData,
				success: function (result) {
					alert(result);
				}
				
			});
		});
	});
	*/
</script>

	<style>
		.failed {
			color:red;
		}
	</style>

</head>
<body>
	<!-- header -->
<%--	<jsp:include page="../header.jsp"></jsp:include>--%>
	
	<!-- content -->
	<div class="content">
		<section class="login">
			<h1 class="title">로그인</h1>
			<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
				<c:if test="${param.error != null}">
					<i class="failed">등록되지 않은 사용자 혹은 잘못된 비밀번호입니다.</i>
				</c:if>
					<p>
						<label>아이디</label>
						<input type="text" name="username" id="id">
					</p>
					<p>
						<label>패스워드</label>
						<input type="password" name="password" id="pass">
					</p>
						<input type="submit" value="Login" />

			</form:form>
		</section>
	</div>
	<!-- footer -->
	<%--<jsp:include page="../footer.jsp"></jsp:include>--%>
</body>
</html>
















