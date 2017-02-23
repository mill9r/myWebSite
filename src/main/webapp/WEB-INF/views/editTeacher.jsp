<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="/WEB-INF/views/template/header.jsp" %>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Edit Teacher</h1>
            <p class="lead">Please, update the information about teacher!</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/admin/teacherAccounting/editTeacher" method="post"
                   commandName="teacher" enctype="multipart/form-data">
        <div class="form-group">
            <label for="contractNumber">Contract Number</label><form:errors path="contractNumber" cssStyle="color: #ff0000"/>
            <form:input path="contractNumber" id="contractNumber" class="form-Control" value="${teacher.contractNumber}"/>
        </div>
        <div class="form-group">
            <label for="name">Name </label>
            <form:input path="name" id="name" class="form-Control"  value="${teacher.name}"/>
        </div>
        <div class="form-group">
            <label for="lastName">Surname </label><form:errors path="lastName" cssStyle="color: #ff0000"/>
            <form:input path="lastName" id="lastName" class="form-Control"  value="${teacher.lastName}"/>
        </div>
        <div class="form-group">
            <label for="patronymic">Patronymic </label>
            <form:input path="patronymic" id="patronymic" class="form-Control"  value="${teacher.patronymic}"/>
        </div>
        <div class="form-group">
            <lable for="category">Academic degree:</lable>
            <label class="checkbox-inline"><form:radiobutton path="academicDegree" id="degree" value="Bachelor"/>
                Bachelor </label>
            <label class="checkbox-inline"><form:radiobutton path="academicDegree" id="degree" value="Master"/>
                Master </label>
            <label class="checkbox-inline"><form:radiobutton path="academicDegree" id="degree" value="Doctor"/>
                Doctor </label>
        </div>
        <div class="form-group">
            <label for="teacherDepartment">Teacher Department </label>
            <form:input path="teacherDepartment" id="teacherDepartment" class="form-Control"  value="${teacher.teacherDepartment}"/>
        </div>

        <div class="form-group">
            <label class="control-label" for="teacherImage">Upload picture</label>
            <form:input id="teacherImage" path="teacherImage" type="file" class="form:input-large"/>
        </div>

        <br>
        <br>
        <input type="submit" value="Submit" class="btn btn-default">
        <a href="<c:url value="/admin/teacherAccounting"/> " class="btn btn-default">Cancel</a>

        </form:form>
<%@include file="/WEB-INF/views/template/footer.jsp" %>