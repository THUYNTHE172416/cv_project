<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Change password</title>

        <!-- Bootstrap CDN -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <div class="container mt-5">
            <div class="row justify-content-center">

                <div class="col-md-4 card shadow p-4">

                    <h3 class="text-center mb-4">Đổi mật khẩu</h3>

                    <form action="change-password" method="post">
                        <input type="hidden" name="uId" value="${uId}" />
                        <div class="mb-3">
                            <label class="form-label">Mật khẩu mới</label>
                            <input type="password" name="newPassword" class="form-control">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Xác nhận mật khẩu mới</label>
                            <input type="password" name="rePassword" class="form-control">
                        </div>
                        
                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary">Đổi mật khẩu</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    <%@ include file="./public/notify.jsp" %>
    </body>
</html>