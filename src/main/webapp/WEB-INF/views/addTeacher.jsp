
<%----%>
<%@include file="/WEB-INF/views/template/header.jsp" %>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Добавить преподавателя</h1>
            <p class="lead">Заполните форму для внесения преподавателя в базу данных!</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/admin/teacherAccounting/addTeacher" method="post"
                   commandName="teacher" enctype="multipart/form-data">

            <form:hidden path="enabled" value="${teacher.enabled}"/>
            <form:hidden path="username" value="${teacher.username}"/>
            <form:hidden path="password" value="${teacher.password}"/>


        <div class="form-group">
            <label for="contractNumber">Номер контракта </label><form:errors path="contractNumber" cssStyle="color: #ff0000"/>
            <form:input path="contractNumber" id="contractNumber" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="name">Имя  </label>
            <form:input path="name" id="name" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="lastName">Фамилия </label><form:errors path="lastName" cssStyle="color: #ff0000"/>
            <form:input path="lastName" id="lastName" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="patronymic">Отчество </label>
            <form:input path="patronymic" id="patronymic" class="form-Control"/>
        </div>
        <div class="form-group">
            <lable for="category">Академическая степень:</lable>
            <label class="checkbox-inline"><form:radiobutton path="academicDegree" id="degree" value="Bachelor"/>
                Бакалавр </label>
            <label class="checkbox-inline"><form:radiobutton path="academicDegree" id="degree" value="Master"/>
                Магистр </label>
            <label class="checkbox-inline"><form:radiobutton path="academicDegree" id="degree" value="Doctor"/>
                Кандидат технических наук </label>
        </div>

        <div class="form-group">
            <label class="control-label" for="teacherImage">Загрузить фотографию </label>
            <form:input id="teacherImage" path="teacherImage" type="file" class="form:input-large"/>
        </div>


        <br>
        <br>
        <input type="submit" value="Сохранить" class="btn btn-primary">
        <a href="<c:url value="/admin/teacherAccounting"/> " class="btn btn-default">Отмена</a>

        </form:form>
<%@include file="/WEB-INF/views/template/footer.jsp" %>