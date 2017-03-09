<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Список группы</h1>
            <p class="lead">Здесь представлен список групп.</p>
        </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th>Номер группы</th>
                <th>Текущий семестр</th>
            </tr>
            </thead>
            <c:forEach items="${group}" var="group">
                <tr>
                    <td>${group.groupNumber}</td>
                    <td>${group.semester}</td>
                    <td>
                        <a href="<spring:url value="/admin/groupAccounting/deleteGroup/${group.groupId}"/> "> <span
                                class="glyphicon glyphicon-remove"></span></a>
                        <a href="<spring:url value="/admin/groupAccounting/editGroup/${group.groupId}"/> "> <span
                                class="glyphicon glyphicon-pencil"></span></a></td>
                </tr>
            </c:forEach>
        </table>

        <a href="<spring:url value="/admin/groupAccounting/addGroup"/>" class="btn btn-primary">Добавить группу</a>

<%@include file="/WEB-INF/views/template/footer.jsp" %>