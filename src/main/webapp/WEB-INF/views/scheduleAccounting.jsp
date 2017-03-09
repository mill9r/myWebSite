
<%@include file="/WEB-INF/views/template/header.jsp" %>
<%--Teachers table--%>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Расписние</h1>
            <p class="lead">Здесь собрана информация о группах, текущем семетре, преподавателе и предмете</p>
        </div>
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th>Текущий семестр</th>
                <th>Группа</th>
                <th>Предмет</th>
                <th>Преподаватель</th>
            </tr>
            </thead>
            <c:forEach items="${schedule}" var="schedule">
                <tr>
                    <td>${schedule.currentSemester}</td>
                    <td>${schedule.group.groupNumber}</td>
                    <td>${schedule.subject.subjectName}</td>
                    <td>${schedule.teacher.lastName}</td>
                    <td>
                        <a href="<spring:url value="/admin/scheduleAccounting/deleteSchedule/${schedule.scheduleId}"/> "> <span
                                class="glyphicon glyphicon-remove"></span></a>
                        <a href="<spring:url value="/admin/scheduleAccounting/editSchedule/${schedule.scheduleId}"/> "> <span
                                class="glyphicon glyphicon-pencil"></span></a></td>
                </tr>
            </c:forEach>
        </table>

        <a href="<spring:url value="/admin/scheduleAccounting/addSchedule"/>" class="btn btn-primary">Добавить в расписание</a>

        <%@include file="/WEB-INF/views/template/footer.jsp" %>

