<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="d-flex flex-column" style="min-height: 100vh;">

<jsp:include page="../layout/header.jsp"/>

<div class=" d-flex flex-grow-1">
    <jsp:include page="../layout/sidebar.jsp"/>
    <div class="flex-grow-1 mt-3 bg-light">
        <div class="container">
            <form action="url" method="post" enctype="multipart/form-data">

            </form>
        </div>
    </div>
</div>

<jsp:include page="../layout/footer.jsp"/>
<%@ include file="./../public/notify.jsp" %>

</body>
</html>