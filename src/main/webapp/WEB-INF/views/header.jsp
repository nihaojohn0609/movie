<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="http://localhost:9000/css/mycgv_jsp.css">
	
</head>
<body>
	<header>
		<div class="header_menu">
			<nav class="nav1">
				<c:choose>
				<c:when test="${sessionScope.svo == null}">
					<ul>
						<li><a href="${pageContext.request.contextPath}/login">로그인</a></li>
						<!-- <li><a href="http://localhost:9000/mypage/mypage.jsp" target="_parent">마이페이지</a></li> -->
						<sec:authorize access="hasRole('MANAGER')">
							<li><a href="${pageContext.request.contextPath}/leaders">VIP</a></li>
						</sec:authorize>
						<li><a href="#">고객센터</a></li>
						<li><a href="http://localhost:9000/notice_list/1/">공지사항</a></li>
						<li><a href="http://localhost:9000/board/list">게시판</a></li>
						<li><a href="http://localhost:9000/board_list_json">게시판(JSON)</a></li>
						<sec:authorize access="hasRole('ADMIN')">
							<li><a href="${pageContext.request.contextPath}/admin">ADMIN</a></li>
						</sec:authorize>
					</ul>
				</c:when>
				<c:otherwise>
					<ul>
						<li><a href="#" style="width:150px">[ ${sessionScope.svo.name} ]님!! 반갑습니다~</a></li>
						<li><a href="http://localhost:9000/logout">로그아웃</a></li>
<%--						<li><a href="http://localhost:9000/join/join.jsp" target="_parent">회원가입</a></li>--%>
						<li><a href="http://localhost:9000/mypage">마이페이지</a></li>
						<li><a href="#">VIP</a></li>
						<li><a href="#">고객센터</a></li>
						<li><a href="http://localhost:9000/notice_list/1/">공지사항</a></li>
						<li><a href="http://localhost:9000/board_list">게시판</a></li>
						<li><a href="http://localhost:9000/board_list_json">게시판(JSON)</a></li>
						<c:if test="${sessionScope.svo.id == 'admin'}">
							<li><a href="http://localhost:9000/admin/index">ADMIN</a></li>
						</c:if>
					</ul>
				</c:otherwise>
				</c:choose>
			</nav>
			<div>
				<a href="http://localhost:9000/">
					<img src="http://localhost:9000/images/h1_cgv.png">
				</a>
				<div>
					<img src="http://localhost:9000/images/h2_cultureplex.png" >
					<nav class="nav2">
						<ul>
							<li><a href="#">영화</a></li>
							<li><a href="#">예매</a></li>
							<li><a href="#">극장</a></li>
							<li><a href="#">이벤트&컬처</a></li>
						</ul>
					</nav>				
				</div>
				<form:form action="${pageContext.request.contextPath}/logout" method="POST" id="logout">
					<input type="submit" value="Logout">
				</form:form>
			</div>
		</div>


	</header>
</body>
</html>