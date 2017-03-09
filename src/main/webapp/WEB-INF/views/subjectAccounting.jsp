<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Список предметов</h1>
            <p class="lead">Список всех предметов на программе.</p>
        </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th>Предмет </th>
            </tr>
            </thead>
            <c:forEach items="${subject}" var="subject">
                <tr>
                    <td>${subject.subjectName}</td>
                    <td>
                        <a href="<spring:url value="/admin/subjectAccounting/deleteSubject/${subject.subjectId}"/> "> <span
                                class="glyphicon glyphicon-remove"></span></a>
                        <a href="<spring:url value="/admin/subjectAccounting/editSubject/${subject.subjectId}"/> "> <span
                                class="glyphicon glyphicon-pencil"></span></a></td>
                </tr>
            </c:forEach>
        </table>

        <a href="<spring:url value="/admin/subjectAccounting/addSubject"/>" class="btn btn-primary">Добавить предмет</a>

<%@include file="/WEB-INF/views/template/footer.jsp" %>