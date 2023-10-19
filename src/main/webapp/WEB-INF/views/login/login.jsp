<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Movie</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous" />
<script src="http://localhost:9000/js/jquery-3.6.4.min.js"></script>
<script src="http://localhost:9000/js/mycgv_jsp_jquery.js"></script>
<script>
	let join_result = "${join_result}";
	if(join_result == 'ok'){
		alert("Login Success");
	}

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
    <div class="container">
        <div id="loginbox" style="margin-top: 50px;" class="col-md-3 col-md-offset-2 col-sm-6 col-sm-offset-2">
            <div class="card border-info">
                <div class="card-header bg-info">
                    로그인
                </div>

                <div class="card-body">
                    <div class="card-text">
            <form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST" class="form-horizontal">
                <div class="form-group">
                    <div class="col-xs-15">
                        <div>
                <c:if test="${param.error != null}">

                    <div class="alert alert-danger col-xs-offset-1 col-xs-10">
                        Invalid username and password.
                    </div>
                </c:if>
                <c:if test="${param.logout != null}">

                    <div class="alert alert-success col-xs-offset-1 col-xs-10">
                        You have been logged out.
                    </div>
                </c:if>

                </div>

                </div>
            </div>
        </div>
    </div>

					<!-- User name -->
					<div style="margin-bottom: 25px;" class="input-group">
						<input type="text" name="username" placeholder="아이디" class="form-control" />
					</div>

					<!-- Password -->
					<div style="margin-bottom: 25px;" class="input-group">
						<input type="password" name="password" placeholder="패스워드" class="form-control" />
					</div>

					<!-- Login/Submit Button -->
					<div style="margin-top: 10px;" class="form-group">
						<div class="col-sm-6 controls">
							<button type="submit" class="btn btn-success">로그인</button>
						</div>
					</div>

					</form:form>

				</div>
			</div>
		</div>
	</div>
	</div>
	<!-- footer -->
	<%--<jsp:include page="../footer.jsp"></jsp:include>--%>
</body>
</html>
















