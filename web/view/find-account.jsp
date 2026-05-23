<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>find account</title>

        <!-- Bootstrap CDN -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <div class="container mt-5">
            <div class="row justify-content-center">

                <div class="col-md-4 card shadow p-4">

                    <h3 class="text-center mb-4">Tìm tài khoản</h3>

                    <form action="find" method="post">

                        <div class="mb-3">
                            <label class="form-label">Username</label>
                            <input type="text" name="username" class="form-control" placeholder="Username hoặc email">
                        </div>
                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary">Tìm tài khoản</button>
                        </div>
                        <div class="text-center mt-3">
                            <small>Đăng nhập bằng mật khẩu <a href="login">Đăng nhập</a></small> <br/>
                            <small>Chưa có tài khoản? <a href="register">Đăng ký</a></small>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    <%@ include file="./public/notify.jsp" %>
    </body>
</html>