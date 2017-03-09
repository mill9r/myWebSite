<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Редактировать расписание</h1>
            <p class="lead">Редактировать текущий семестр, группу, преподавателя и предмет</p>
        </div>
        <form:form action="${pageContext.request.contextPath}/admin/scheduleAccounting/editSchedule"
                   method="post" commandName="schedule">

        <form:hidden path="scheduleId" value="${schedule.scheduleId}"/>
        
        <div class="form-group">
            <label for="currentSemester">Текущий семестр</label>
            <form:input path="currentSemester" id="currentSemester" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="group.groupId">Номер группы </label>
            <form:select path="group.groupId">
                <ul class="dropdown-menu">
                    <form:options items="${group}" itemValue="groupId" itemLabel="groupNumber"/>
                </ul>
            </form:select>
        </div>

        <div class="form-group">
            <label for="teacher.contractNumber">Преподаватель </label>
            <form:select path="teacher.contractNumber">
                <ul class="dropdown-menu">
                    <form:options items="${teacher}" itemValue="contractNumber" itemLabel="lastName"/>
                </ul>
            </form:select>
        </div>

        <div class="form-group">
            <label for="subject.subjectId">Предмет </label>
            <form:select path="subject.subjectId">
                <ul class="dropdown-menu">
                    <form:options items="${subject}" itemValue="subjectId" itemLabel="subjectName"/>
                </ul>
            </form:select>
        </div>


        <br>
        <br>

        <input type="submit" value="Сохранить" class="btn btn-primary">
        <a href="<spring:url value="/admin/scheduleAccounting"/>" class="btn btn-default">Отмена</a>

        </form:form>

<%@include file="/WEB-INF/views/template/footer.jsp" %>