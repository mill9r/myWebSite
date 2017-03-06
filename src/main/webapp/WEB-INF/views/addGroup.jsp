<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Add group</h1>
            <p class="lead">Please, add a group number</p>
        </div>
        <form:form action="${pageContext.request.contextPath}/admin/groupAccounting/addGroup"
                   method="post" commandName="group">

        <div class="form-group">
            <label for="groupNumber">Group Number </label><form:errors path="groupNumber" cssStyle="color: #ff0000"/>
            <form:input path="groupNumber" id="groupNumber" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="semester">Текущий семестр </label><form:errors path="semester" cssStyle="color: #ff0000"/>
            <form:input path="semester" id="semester" class="form-Control"/>
        </div>

        <br>
        <br>

        <input type="submit" value="submit" class="btn btn-default">
        <a href="<spring:url value="/admin/groupAccounting"/>" class="btn btn-primary">Cancel</a>

        </form:form>

<%@include file="/WEB-INF/views/template/footer.jsp" %>