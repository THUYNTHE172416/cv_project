<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Login</title>

        <!-- Bootstrap CDN -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <div class="container mt-5">
            <div class="row justify-content-center">

                <div class="col-md-4 card shadow p-4">

                    <h3 class="text-center mb-4">Login</h3>

                    <form action="login" method="post">

                        <div class="mb-3">
                            <label class="form-label">Username</label>
                            <input type="text" name="username" class="form-control">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Password</label>
                            <input type="password" name="password" class="form-control">
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary">Login</button>
                        </div>
                        <div class="text-center mt-3">
                            <small>Chưa có tài khoản? <a href="register">Đăng ký</a></small> <br/>
                            <small>Quên mật khẩu? <a href="find">Tìm kiếm tài khoản</a></small>
                        </div>
                    </form>

                </div>
            </div>
        </div>
    <%@ include file="./public/notify.jsp" %>
    </body>
</html>