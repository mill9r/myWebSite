
<%@include file="/WEB-INF/views/template/header.jsp" %>
<%--Teachers table--%>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>timetable page</h1>
            <p class="lead">This is a timetable page</p>
        </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th>Current Semester</th>
                <th>Group</th>
                <th>Subject</th>
                <th>Teacher</th>
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

        <a href="<spring:url value="/admin/scheduleAccounting/addSchedule"/>" class="btn btn-primary">Add table</a>

        <%@include file="/WEB-INF/views/template/footer.jsp" %>

