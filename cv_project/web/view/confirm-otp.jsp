<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Confirm OTP</title>

        <!-- Bootstrap CDN -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <div class="container mt-5">
            <div class="row justify-content-center">

                <div class="col-md-4 card shadow p-4">

                    <h3 class="text-center mb-4">Xác nhận OTP</h3>

                    <form action="confirm-otp" method="post">

                        <div class="mb-3">
                            <label class="form-label">OTP</label>
                            <input type="text" name="otp" class="form-control" placeholder="Mã OTP">
                        </div>
                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary">Xác nhận</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    <%@ include file="./public/notify.jsp" %>
    </body>
</html>