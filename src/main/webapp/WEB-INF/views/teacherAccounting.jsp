<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>
<%--Teachers table--%>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Teachers accounting page</h1>
            <p class="lead">This is a teachers accounting page</p>
        </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th>Photo Thumb</th>
                <th>Teacher name</th>
                <th>Teacher last name</th>
                <th>Teacher patronymic</th>
                <th>Teachers academic degree</th>
            </tr>
            </thead>
            <c:forEach items="${teachers}" var="teacher">
                <tr>
                    <td><img src="#"/> " alt="img"/>
                    </td>
                    <td>${teacher.name}</td>
                    <td>${teacher.lastName}</td>
                    <td>${teacher.patronymic}</td>
                    <td>${teacher.academicDegree}</td>
                    <td><a href="<spring:url value="/teacherList/viewTeacher/${teacher.contractNumber}"/> "> <span
                            class="glyphicon glyphicon-info-sign"></span></a></td>
                </tr>
            </c:forEach>
        </table>

        <a href="<spring:url value="/admin/teacherAccounting/addTeacher"/>" class="btn btn-primary">Add teacher</a>

        <%@include file="/WEB-INF/views/template/footer.jsp" %>
