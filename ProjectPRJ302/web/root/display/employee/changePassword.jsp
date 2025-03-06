<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Leave Request System</title>
        <link rel="stylesheet" href="https://unpkg.com/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    </head>

    <body>

        <jsp:include page="/root/display/employee/header.jsp"></jsp:include>
            <div class="container mt-4">

                <section id="changePassword" class="mt-4">
                    <h2>Đổi Mật Khẩu</h2>
                    <form action="changePassaword" method="post">
                        <div class="mb-3">
                            <label class="form-label">Mật Khẩu Hiện Tại</label>
                            <input type="password" name="oldPassword" class="form-control">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Mật Khẩu Mới</label>
                            <input type="password" name="newPassword" class="form-control">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Nhâp lại Mật Khẩu Mới</label>
                            <input type="password" name="confirmPassword" class="form-control">
                        </div>
                        <button type="submit" class="btn btn-warning">Cập Nhật</button>
                    </form>
                </section>
            </div>
        <c:if test="${errMess != null}">
            <p style="color: red">${errMess}</p>
        </c:if>
        <script src="https://unpkg.com/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    </body>

</html>