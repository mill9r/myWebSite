
<%@include file="/WEB-INF/views/template/header.jsp" %>
<%--Teachers table--%>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Список преподавателей</h1>
            <p class="lead">Здесь представленна информация о преподавателях</p>
        </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th>Фото</th>
                <th>Имя</th>
                <th>Фамилия</th>
                <th>Отчество</th>
                <th class="col-md-4">Академическая степень</th>
            </tr>
            </thead>
            <c:forEach items="${teachers}" var="teacher">
                <tr>
                    <td><img src="<c:url value="/resources/images/${teacher.contractNumber}.png"/> " alt="img"
                        style="width:100%; height: auto"/>
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


        <%@include file="/WEB-INF/views/template/footer.jsp" %>
