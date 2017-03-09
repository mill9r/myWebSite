<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>
<%--Teachers table--%>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Оценки</h1>
            <p class="lead">
                <strong>Преподаватель: </strong>${teacher.lastName} ${teacher.name} ${teacher.patronymic}.
                <strong>Предмет</strong> ${subject.subjectName}</p>


        </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th>Средний балл</th>
                <th>Структура семинара/лекций</th>
                <th class="col-md-2">Качество подобранных материалов</th>
                <th class="col-md-2">Эффективность семинарских занятий</th>
            </tr>
            </thead>
            </tr>
            <tr>
                <td>${avgMark}</td>
                <td>${avgStruct}</td>
                <td>${avgQuality}</td>
                <td>${avgEffect}</td>
            </tr>


        </table>
        <a href="<c:url value="/admin/rankResult"/> " class="btn btn-default">Назад</a>


<%@include file="/WEB-INF/views/template/footer.jsp" %>