<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="card shadow p-4" style="width: 400px;">
            <h3 class="text-center mb-4">Đăng ký</h3>

            <form action="register" method="post">

                <!-- Username -->
                <div class="mb-3">
                    <label class="form-label">Username</label>
                    <input type="text" name="username" class="form-control" placeholder="Nhập username">
                </div>

                <!-- Email -->
                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <input type="email" name="email" class="form-control" placeholder="Nhập email">
                </div>

                <!-- Password -->
                <div class="mb-3">
                    <label class="form-label">Password</label>
                    <input type="password" name="password" class="form-control" placeholder="Nhập mật khẩu">
                </div>

                <!-- Submit -->
                <div class="d-grid">
                    <button type="submit" class="btn btn-warning">Đăng ký</button>
                </div>

                <!-- Link login -->
                <div class="text-center mt-3">
                    <small>Đã có tài khoản? <a href="login">Đăng nhập</a></small> <br/>
                    <small>Quên mật khẩu? <a href="find">Tìm kiếm tài khoản</a></small>
                </div>
            </form>
        </div>
    </div>
    <%@ include file="./public/notify.jsp" %>
</body>
</html>