<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MYCGV</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>

<style>
	.error {
		color: red;
	}
</style>

<body>
	<!-- header -->
	<!-- <iframe src="http://localhost:9000/header.jsp"
			scrolling="no" width="100%" height="149px" frameborder=0></iframe> -->
	<jsp:include page="../header.jsp"></jsp:include>
	
	<!-- content -->
	<div class="container">
		<div id="loginbox" style="margin-top: 50px;" class="col-md-3 col-md-offset-2 col-sm-6 col-sm-offset-2">
			<div class="card border-info">

			<h1 class="card-header bg-info">Register</h1>
				<div class="card-body">
					<div class="card-text">
			<form:form action="${pageContext.request.contextPath}/register/processRegistrationForm" modelAttribute="webUser" method="POST" class="form-horizontal">
				<div class="form-group">
					<div class="col-xs-15">
						<div>
							<c:if test="${registrationError != null}">

								<div class="alert alert-danger col-xs-offset-1 col-xs-10">
										${registrationError}
								</div>

							</c:if>

                        </div>
                    </div>
                </div>

				<div style="margin-bottom: 25px" class="input-group">
					<form:errors path="userName" cssClass="error"></form:errors>
					<form:input path="userName" placeholder="username (*)" class="form-control" />
				</div>


				<div style="margin-bottom: 25px" class="input-group">
						<form:errors path="password" cssClass="error"></form:errors>
						<form:input path="password" placeholder="password (*)" class="form-control"></form:input>
				</div>

				<div style="margin-bottom: 25px" class="input-group">
					<form:errors path="firstName" cssClass="error"></form:errors>
					<form:input path="firstName" placeholder="First Name (*)" class="form-control"></form:input>
				</div>

				<div style="margin-bottom: 25px" class="input-group">
					<form:errors path="lastName" cssClass="error"></form:errors>
					<form:input path="lastName" placeholder="Last Name (*)" class="form-control"></form:input>
				</div>

				<div style="margin-bottom: 25px" class="input-group">
					<form:errors path="email" cssClass="error"></form:errors>
					<form:input path="email" placeholder="Email (*)" class="form-control"></form:input>
				</div>

				<div style="margin-top: 10px" class="form-group">
					<div class="col-sm-6 controls">
						<button type="submit" class="btn btn-primary">Register</button>
					</div>
				</div>
			</form:form>
		</div>
	</div>
	</div>
	</div>

</div>
	
	<!-- footer -->
	<!-- <iframe src="http://localhost:9000/footer.jsp"
			scrolling="no" width="100%" height="500px" frameborder=0></iframe> -->
</body>
</html>
















