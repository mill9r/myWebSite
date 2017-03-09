<%@include file="/WEB-INF/views/template/header.jsp" %>

<%--Teachers table--%>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Страница Администратор</h1>
            <p class="lead">На этой странице можно отредактировать данные.</p>
        </div>
        <h3>
            <a href="<c:url value="/admin/teacherAccounting"/> "> Редактировать преподавателей</a>
        </h3>
        <h3>
            <a href="<c:url value="/admin/groupAccounting"/> "> Редактировать группы</a>
        </h3>
        <h3>
            <a href="<c:url value="/admin/studentAccounting"/> "> Редактировать студентов</a>
        </h3>
        <h3>
            <a href="<c:url value="/admin/subjectAccounting"/> "> Редактировать предметы</a>
        </h3>
        <h3>
            <a href="<c:url value="/admin/scheduleAccounting"/> "> Редактировать расписание</a>
        </h3>
        <h3>
            <a href="<c:url value="/admin/rankResult"/> "> Создать отчёт </a>
        </h3>

        <c:if test="${pageContext.request.userPrincipal.name != null}">
        <h2>
            Welcome: ${pageContext.request.userPrincipal.name} | <a href="<c:url value="/j_spring_security_logout"/> ">Logout</a>

        </h2>
        </c:if>


        <%@include file="/WEB-INF/views/template/footer.jsp" %>
