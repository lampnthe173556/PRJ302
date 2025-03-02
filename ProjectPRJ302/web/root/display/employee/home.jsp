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
            <section id="createRequest">
                <h2>Tạo Đơn Nghỉ Phép</h2>
                <form action="createRequest" method="post">
                    <div class="mb-3">
                        <label class="form-label">Ngày Bắt Đầu</label>
                        <input type="date" class="form-control" name="dateStart" required="">
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Ngày Kết Thúc</label>
                        <input type="date" class="form-control" name="dateEnd" required="">
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Lý Do</label>
                        <textarea class="form-control" rows="3" name="issue" required=""></textarea>
                    </div>
                    <button type="submit" class="btn btn-primary">Gửi Đơn</button>
                </form>
            </section>
        <c:if test="${ErrDate != null}">
            <p style="color: red">${ErrDate}</p>
        </c:if>
        <c:if test="${CreateForm != null}">
            <p style="color: green">${CreateForm}</p>
        </c:if>
        </div>

        <script src="https://unpkg.com/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    </body>

</html>