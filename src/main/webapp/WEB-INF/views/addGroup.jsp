<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Дабивать группу</h1>
            <p class="lead">Пожалуйста, внесите информацию о группе</p>
        </div>
        <form:form action="${pageContext.request.contextPath}/admin/groupAccounting/addGroup"
                   method="post" commandName="group">

        <div class="form-group">
            <label for="groupNumber">Номер группы </label><form:errors path="groupNumber" cssStyle="color: #ff0000"/>
            <form:input path="groupNumber" id="groupNumber" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="semester">Текущий семестр </label><form:errors path="semester" cssStyle="color: #ff0000"/>
            <form:input path="semester" id="semester" class="form-Control"/>
        </div>

        <br>
        <br>

        <input type="submit" value="Сохранить" class="btn btn-primary">
        <a href="<spring:url value="/admin/groupAccounting"/>" class="btn btn-default">Отменить</a>

        </form:form>

<%@include file="/WEB-INF/views/template/footer.jsp" %>