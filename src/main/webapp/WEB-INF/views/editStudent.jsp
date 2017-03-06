<%----%>
<%@include file="/WEB-INF/views/template/header.jsp" %>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Add Student</h1>
            <p class="lead">Fill the below information to add a student!</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/admin/studentAccounting/editStudent" method="post"
                   commandName="student" enctype="multipart/form-data">

            <form:hidden path="studentId" value="${student.studentId}"/>
            <form:hidden path="name" value="${student.name}"/>
            <form:hidden path="password" value="${student.password}"/>
            <form:hidden path="lastName" value="${student.lastName}"/>
            <form:hidden path="username" value="${student.username}"/>

        <div class="form-group">
            <lable for="enabled">Block Account</lable>
            <label class="checkbox-inline"><form:radiobutton path="enabled" id="enabled" value="true"/>
                Enable </label>
            <label class="checkbox-inline"><form:radiobutton path="enabled" id="enabled" value="false"/>
                Disable </label>
        </div>

        <div class="form-group">
            <label for="group.groupId">Group Number </label>
            <form:select path="group.groupId">
                <ul class="dropdown-menu">
                    <form:options items="${groupList}" itemValue="groupId" itemLabel="groupNumber"/>
                </ul>
            </form:select>
        </div>

        <br>
        <br>
        <input type="submit" value="Submit" class="btn btn-default">
        <a href="<c:url value="/admin/studentAccounting"/> " class="btn btn-default">Cancel</a>

        </form:form>
        <%@include file="/WEB-INF/views/template/footer.jsp" %>
