<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>
<%--Teachers table--%>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Administrator page</h1>
            <p class="lead">This is the administration page</p>
        </div>
        <h3>
            <a href="<c:url value="/admin/teacherAccounting"/> "> Teacher Accounting</a>
        </h3>

        <c:if test="${pageContext.request.userPrincipal.name !=null}">
        <h2>
            Welcome: ${pageContext.request.userPrincipal.name} | <a href="<c:url value="/j_spring_security_logout"/> ">Logout</a>

        </h2>
        </c:if>

        <p>Here you can view, check and modify the teacher accounting</p>
        <%@include file="/WEB-INF/views/template/footer.jsp" %>
