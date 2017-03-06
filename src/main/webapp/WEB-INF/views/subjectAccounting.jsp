<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Subject list page</h1>
            <p class="lead">This is a subject list page</p>
        </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th>Subject</th>
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

        <a href="<spring:url value="/admin/subjectAccounting/addSubject"/>" class="btn btn-primary">Add group</a>

<%@include file="/WEB-INF/views/template/footer.jsp" %>