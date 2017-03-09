<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Редактировать предмет </h1>
            <p class="lead">Пожалуйста, обновите информацию о предмете.</p>
        </div>
        <form:form action="${pageContext.request.contextPath}/admin/subjectAccounting/addSubject"
                   method="post" commandName="subject">


        <div class="form-group">
            <label for="subjectName">Предмет </label><form:errors path="subjectName" cssStyle="color: #ff0000"/>
            <form:input path="subjectName" id="subjectName" class="form-Control" value="${subject.subjectName}"/>
        </div>

        <br>
        <br>

        <input type="submit" value="Сохранить" class="btn btn-primary">
        <a href="<spring:url value="/admin/subjectAccounting"/>" class="btn btn-default">Отмена</a>

        </form:form>

<%@include file="/WEB-INF/views/template/footer.jsp" %>