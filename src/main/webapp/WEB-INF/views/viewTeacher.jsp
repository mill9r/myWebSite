
<%@include file="/WEB-INF/views/template/header.jsp" %>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Детальная информация о преподавателе</h1>
            <p class="lead">Здесь представлена информация о преподавателе</p>
        </div>
        <div class="container">
            <div class="row">

                <div class="col-md-6">
                    <img src="<c:url value="/resources/images/${teacher.contractNumber}.png"/> " alt="img"
                         style="width:100%; height: 70%"/>
                </div>

                <div class="col-md-5">
                    <h3>${teacher.lastName}</h3>
                    <h3>${teacher.name}</h3>
                    <h3>${teacher.patronymic}</h3>
                    <p><strong>Академическая степень</strong> : ${teacher.academicDegree}</p>
                    <h3>Преподает:</h3>
                    <h4>Компонентное проектирование</h4>
                    <h4>Android разработка</h4>
                    <c:set var="url" scope="page" value="/teacherList"/>
                    <a href="<c:url value="${url}"/> " class="btn btn-primary">Back</a>

                </div>


            </div>

        </div>

<%@include file="/WEB-INF/views/template/footer.jsp" %>