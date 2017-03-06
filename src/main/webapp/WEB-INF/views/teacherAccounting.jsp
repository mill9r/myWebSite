
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
                <th>Name</th>
                <th>Surname</th>
                <th>Patronymic</th>
                <th>Academic degree</th>
            </tr>
            </thead>
            <c:forEach items="${teachers}" var="teacher">
                <tr>
                    <td><img src="<c:url value="/resources/images/${teacher.contractNumber}.png"/> " alt="img"
                        style="width:100%"/>
                    </td>
                    <td>${teacher.name}</td>
                    <td>${teacher.lastName}</td>
                    <td>${teacher.patronymic}</td>
                    <td>${teacher.academicDegree}</td>
                    <td><a href="<spring:url value="/teacherList/viewTeacher/${teacher.contractNumber}"/> "> <span
                            class="glyphicon glyphicon-info-sign"></span></a>
                        <a href="<spring:url value="/admin/teacherAccounting/deleteTeacher/${teacher.contractNumber}"/> "> <span
                                class="glyphicon glyphicon-remove"></span></a>
                        <a href="<spring:url value="/admin/teacherAccounting/editTeacher/${teacher.contractNumber}"/> "> <span
                                class="glyphicon glyphicon-pencil"></span></a></td>
                </tr>
            </c:forEach>
        </table>

        <a href="<spring:url value="/admin/teacherAccounting/addTeacher"/>" class="btn btn-primary">Add teacher</a>

        <%@include file="/WEB-INF/views/template/footer.jsp" %>
