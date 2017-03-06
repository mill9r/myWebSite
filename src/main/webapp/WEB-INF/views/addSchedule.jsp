<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Add group</h1>
            <p class="lead">Please, add a group number</p>
        </div>
        <form:form action="${pageContext.request.contextPath}/admin/scheduleAccounting/addSchedule"
                   method="post" commandName="schedule">


        <div class="form-group">
            <label for="currentSemester">Current Semester</label>
            <form:input path="currentSemester" id="currentSemester" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="group.groupId">Group Number </label>
            <form:select path="group.groupId">
                <ul class="dropdown-menu">
                    <form:options items="${group}" itemValue="groupId" itemLabel="groupNumber"/>
                </ul>
            </form:select>
        </div>

        <div class="form-group">
            <label for="teacher.contractNumber">Teacher </label>
            <form:select path="teacher.contractNumber">
                <ul class="dropdown-menu">
                    <form:options items="${teacher}" itemValue="contractNumber" itemLabel="lastName"/>
                </ul>
            </form:select>
        </div>

        <div class="form-group">
            <label for="subject.subjectId">Subject </label>
            <form:select path="subject.subjectId">
                <ul class="dropdown-menu">
                    <form:options items="${subject}" itemValue="subjectId" itemLabel="subjectName"/>
                </ul>
            </form:select>
        </div>


        <br>
        <br>

        <input type="submit" value="submit" class="btn btn-default">
        <a href="<spring:url value="/admin/scheduleAccounting"/>" class="btn btn-primary">Cancel</a>

        </form:form>

<%@include file="/WEB-INF/views/template/footer.jsp" %>