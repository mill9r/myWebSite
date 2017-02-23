<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%----%>
<%@include file="/WEB-INF/views/template/header.jsp" %>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Teacher Detail</h1>
            <p class="lead">Here is an information about teacher!</p>
        </div>
        <div class="container">
            <div class="row">

                <div class="col-md-5">
                    <img src="<c:url value="/resources/images/${teacher.contractNumber}.png"/> " alt="img"
                         style="width:100%"/>
                </div>

                <div class="col-md-5">
                    <h3>${teacher.name}</h3>
                    <h3>${teacher.lastName}</h3>
                    <h3>${teacher.patronymic}</h3>
                    <p><strong>Academic degree</strong> : ${teacher.academicDegree}</p>
                    <p><strong>Department</strong> : ${teacher.teacherDepartment}</p>

                    <c:set var="url" scope="page" value="/teacherList"/>
                    <a href="<c:url value="${url}"/> " class="btn btn-default">Back</a>


                </div>


            </div>

        </div>

<%@include file="/WEB-INF/views/template/footer.jsp" %>