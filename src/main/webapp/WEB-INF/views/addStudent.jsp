<%----%>
<%@include file="/WEB-INF/views/template/header.jsp" %>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Add Student</h1>
            <p class="lead">Fill the below information to add a student!</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/admin/studentAccounting/addStudent" method="post"
                   commandName="student" enctype="multipart/form-data">


        <div class="form-group">
            <label for="studentId">Student ID</label><form:errors path="studentId" cssStyle="color: #ff0000"/>
            <form:input path="studentId" id="studentId" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="name">Name </label>
            <form:input path="name" id="name" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="lastName">Surname </label><form:errors path="lastName" cssStyle="color: #ff0000"/>
            <form:input path="lastName" id="lastName" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="username">Username </label>
            <form:input path="username" id="username" class="form-Control"/>
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
