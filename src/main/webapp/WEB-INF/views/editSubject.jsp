<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Edit subject</h1>
            <p class="lead">Please, update the information about subject</p>
        </div>
        <form:form action="${pageContext.request.contextPath}/admin/subjectAccounting/editSubject"
                   method="post" commandName="subject">

            <form:hidden path="subjectId" value="${subject.subjectId}"/>

        <div class="form-group">
            <label for="subjectName">Subject </label><form:errors path="subjectName" cssStyle="color: #ff0000"/>
            <form:input path="subjectName" id="subjectName" class="form-Control" value="${subject.subjectName}"/>
        </div>

        <br>
        <br>

        <input type="submit" value="submit" class="btn btn-default">
        <a href="<spring:url value="/admin/subjectAccounting"/>" class="btn btn-primary">Cancel</a>

        </form:form>

<%@include file="/WEB-INF/views/template/footer.jsp" %>