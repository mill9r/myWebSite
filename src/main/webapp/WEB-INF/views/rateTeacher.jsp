<%@include file="/WEB-INF/views/template/header.jsp" %>
<%--Teachers table--%>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Предметы в текущем семестре</h1>
            <p class="lead">Здесь представленна информация о текущих предметах в семестре у студента</p>
        </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th>Предмет</th>
                <th>Преподаватель</th>
            </tr>
            </thead>
            <c:forEach items="${schedules}" var="schedules">
                <tr>
                    <td>${schedules.subject.subjectName}</td>
                    <td>${schedules.teacher.lastName}</td>
                    <td><a href="<spring:url value="/rateTeacher/rateForm/${schedules.teacher.contractNumber} & ${schedules.subject.subjectId}"/> "> <span
                            class="glyphicon glyphicon-list-alt"></span></a></td>
                </tr>
            </c:forEach>
        </table>


        <%@include file="/WEB-INF/views/template/footer.jsp" %>
