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


                <section id="history" class="mt-4">
                    <h2>Lịch Sử Đơn</h2>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Ngày Bắt Đầu</th>
                                <th>Ngày Kết Thúc</th>
                                <th>Lý Do</th>
                                <th>Trạng Thái</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${listForm}" var="i">
                            <tr>
                                <td>${i.dateStart}</td>
                                <td>${i.dateEnd}</td>
                                <td>${i.issue}</td>
                                <c:if test="${i.status == 1}">
                                    <td class="text-success">đã duyệt</td>
                                </c:if>
                                <c:if test="${i.status == -1}">
                                    <td class="text-danger">Từ chối</td>
                                </c:if>
                                <c:if test="${i.status == 0}">
                                    <td class="text-warning">đang xử lý</td>
                                </c:if>                                   

                            </tr>
                        </c:forEach>

                    </tbody>
                </table>
            </section>


        </div>

        <script src="https://unpkg.com/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    </body>

</html>