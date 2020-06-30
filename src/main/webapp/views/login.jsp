<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng Nhập</title>
</head>
<body>
	<div id="login">
		<div class="container">
			<div id="login-row"
				class="row justify-content-center align-items-center">
				<div id="login-column" class="col-md-6">
					<div id="login-box" class="col-md-12">
						<form id="login-form" class="form"
							action="<c:url value='/dang-nhap'/>" method="post">
							<h3 class="text-center text-info">Đăng Nhập</h3>
							<div class="form-group">
								<label for="username" class="text-info">Tên Đăng Nhập:</label><br>
								<input type="text" name="username" id="username"
									class="form-control">
							</div>
							<div class="form-group">
								<label for="password" class="text-info">Mật Khẩu:</label><br>
								<input type="password" name="password" id="password"
									class="form-control">
							</div>
							<input type="hidden" value="login" name="action" />
							<button type="submit" class="btn btn-primary">Đăng nhập</button>
						</form>
					</div>
					<c:if test="${not empty message }">
						<div class="alert alert-${alert}">${message}</div>
					</c:if>
					

				</div>
			</div>
		</div>
	</div>
</body>
</html>