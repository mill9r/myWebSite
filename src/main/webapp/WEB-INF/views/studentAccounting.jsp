
<%@include file="/WEB-INF/views/template/header.jsp" %>
<%--Teachers table--%>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Students accounting page</h1>
            <p class="lead">This is a student accounting page</p>
        </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th>Name</th>
                <th>Surname</th>
                <th>GroupNumber</th>
            </tr>
            </thead>
            <c:forEach items="${student}" var="student">
                <tr>
                    <td>${student.name}</td>
                    <td>${student.lastName}</td>
                    <td>${student.group.groupNumber}</td>
                    <td><a href="<spring:url value="/admin/studentAccounting/deleteStudent/${student.studentId}"/> "> <span
                                class="glyphicon glyphicon-remove"></span></a>
                        <a href="<spring:url value="/admin/studentAccounting/editStudent/${student.studentId}"/> "> <span
                                class="glyphicon glyphicon-pencil"></span></a></td>
                </tr>
            </c:forEach>
        </table>

        <a href="<spring:url value="/admin/studentAccounting/addStudent"/>" class="btn btn-primary">Add student</a>

        <%@include file="/WEB-INF/views/template/footer.jsp" %>

