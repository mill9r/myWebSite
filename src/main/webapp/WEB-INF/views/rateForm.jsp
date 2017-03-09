<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>
<%--Teachers table--%>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Форма для оценки</h1>
            <p class="lead">
                <strong>Преподаватель: </strong>${teacherResult.teacher.lastName} ${teacherResult.teacher.name} ${teacherResult.teacher.patronymic}. <strong>Предмет</strong> ${teacherResult.subject.subjectName}</p>

            <h4 class="text-center">Каждый вопрос надо оценить <strong>по шкале от 1 до 5</strong>. При этом <strong> 1 – совсем нет, 2 – едва ли соответствует,
                3 – скорее соответствует, 4- соответстует,  5 – более чем соответствует (превосходно)</strong></h4>

        </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th class="col-md-10">Вопрос</th>
                <th>1</th>
                <th>2</th>
                <th>3</th>
                <th>4</th>
                <th>5</th>
            </tr>
            </thead>

            <form:form action="${pageContext.request.contextPath}/rateTeacher/rateForm" method="post"
                       commandName="teacherResult" enctype="multipart/form-data">

            <sx:hidden path="teacher" value="${teacherResult.teacher}"/>
            <sx:hidden path="student" value="${teacherResult.student}"/>
            <sx:hidden path="subject" value="${teacherResult.subject}"/>
            <tr>

                <td>
                    <lable for="questionOne">1.Преподаватель объяснял темы с использованием практических примеров.</lable>
                </td>
                <td ><form:radiobutton path="questionOne" id="questionOne" value="1"/></td>
                <td><form:radiobutton path="questionOne" id="questionOne" value="2"/></td>
                <td><form:radiobutton path="questionOne" id="questionOne" value="3"/></td>
                <td><form:radiobutton path="questionOne" id="questionOne" value="4"/></td>
                <td><form:radiobutton path="questionOne" id="questionOne" value="5"/></td>
            </tr>
            <tr>
                <td>
                    <lable for="questionTwo">2. В начале семинара преподаватель четко обозначил цель курса.</lable>
                </td>
                <td><form:radiobutton path="questionTwo" id="questionTwo" value="1"/></td>
                <td><form:radiobutton path="questionTwo" id="questionTwo" value="2"/></td>
                <td><form:radiobutton path="questionTwo" id="questionTwo" value="3"/></td>
                <td><form:radiobutton path="questionTwo" id="questionTwo" value="4"/></td>
                <td><form:radiobutton path="questionTwo" id="questionTwo" value="5"/></td>
            </tr>
            <tr>
                <td>
                    <lable for="questionThree">3. Преподаватель особо подчеркивал важную информацию.</lable>
                </td>
                <td><form:radiobutton path="questionThree" id="questionThree" value="1"/></td>
                <td><form:radiobutton path="questionThree" id="questionThree" value="2"/></td>
                <td><form:radiobutton path="questionThree" id="questionThree" value="3"/></td>
                <td><form:radiobutton path="questionThree" id="questionThree" value="4"/></td>
                <td><form:radiobutton path="questionThree" id="questionThree" value="5"/></td>
            </tr>
            <tr>
                <td>
                    <lable for="questionFour">4. Преподаватель дал практические знания, которые я смогу в дальнейшем использовать.</lable>
                </td>
                <td><form:radiobutton path="questionFour" id="questionFour" value="1"/></td>
                <td><form:radiobutton path="questionFour" id="questionFour" value="2"/></td>
                <td><form:radiobutton path="questionFour" id="questionFour" value="3"/></td>
                <td><form:radiobutton path="questionFour" id="questionFour" value="4"/></td>
                <td><form:radiobutton path="questionFour" id="questionFour" value="5"/></td>
            </tr>
            <tr>
                <td>
                    <lable for="questionFive">5. Преподаватель умеет хорошо структурировать семинар(лекцию).</lable>
                </td>
                <td><form:radiobutton path="questionFive" id="questionFive" value="1"/></td>
                <td><form:radiobutton path="questionFive" id="questionFive" value="2"/></td>
                <td><form:radiobutton path="questionFive" id="questionFive" value="3"/></td>
                <td><form:radiobutton path="questionFive" id="questionFive" value="4"/></td>
                <td><form:radiobutton path="questionFive" id="questionFive" value="5"/></td>
            </tr>
            <tr>
                <td>
                    <lable for="questionSix">6. Преподаватель побуждал высказывать собственные мысли, соображения по какой-либо теме.</lable>
                </td>
                <td><form:radiobutton path="questionSix" id="questionSix" value="1"/></td>
                <td><form:radiobutton path="questionSix" id="questionSix" value="2"/></td>
                <td><form:radiobutton path="questionSix" id="questionSix" value="3"/></td>
                <td><form:radiobutton path="questionSix" id="questionSix" value="4"/></td>
                <td><form:radiobutton path="questionSix" id="questionSix" value="5"/></td>
            </tr>
            <tr>
                <td>
                    <lable for="questionSeven">7. Преподаватель дал мне практические навыки, которые я смогу использовать в своей профессиональной деятельности.</lable>
                </td>
                <td><form:radiobutton path="questionSeven" id="questionSeven" value="1"/></td>
                <td><form:radiobutton path="questionSeven" id="questionSeven" value="2"/></td>
                <td><form:radiobutton path="questionSeven" id="questionSeven" value="3"/></td>
                <td><form:radiobutton path="questionSeven" id="questionSeven" value="4"/></td>
                <td><form:radiobutton path="questionSeven" id="questionSeven" value="5"/></td>
            </tr>
            <tr>
                <td>
                    <lable for="questionEight">8. Преподаватель был готов прислушаться к предложениям от участников курса(семинар,лекция).</lable>
                </td>
                <td><form:radiobutton path="questionEight" id="questionEight" value="1"/></td>
                <td><form:radiobutton path="questionEight" id="questionEight" value="2"/></td>
                <td><form:radiobutton path="questionEight" id="questionEight" value="3"/></td>
                <td><form:radiobutton path="questionEight" id="questionEight" value="4"/></td>
                <td><form:radiobutton path="questionEight" id="questionEight" value="5"/></td>
            </tr>
            <tr>
                <td>
                    <lable for="questionNine">9. Благодаря семинарам я смог лучше понять содержание курса.</lable>
                </td>
                <td><form:radiobutton path="questionNine" id="questionNine" value="1"/></td>
                <td><form:radiobutton path="questionNine" id="questionNine" value="2"/></td>
                <td><form:radiobutton path="questionNine" id="questionNine" value="3"/></td>
                <td><form:radiobutton path="questionNine" id="questionNine" value="4"/></td>
                <td><form:radiobutton path="questionNine" id="questionNine" value="5"/></td>
            </tr>
            <tr>
                <td>
                    <lable for="questionTen">10. Благодаря семинарам я смогу в будущем легче справляться с полученными заданиями.</lable>
                </td>
                <td><form:radiobutton path="questionTen" id="questionTen" value="1"/></td>
                <td><form:radiobutton path="questionTen" id="questionTen" value="2"/></td>
                <td><form:radiobutton path="questionTen" id="questionTen" value="3"/></td>
                <td><form:radiobutton path="questionTen" id="questionTen" value="4"/></td>
                <td><form:radiobutton path="questionTen" id="questionTen" value="5"/></td>
            </tr>
            <tr>
                <td>
                    <lable for="questionEleven">11. Материалы для семинара были хорошо подобранны и понятны.</lable>
                </td>
                <td><form:radiobutton path="questionEleven" id="questionEleven" value="1"/></td>
                <td><form:radiobutton path="questionEleven" id="questionEleven" value="2"/></td>
                <td><form:radiobutton path="questionEleven" id="questionEleven" value="3"/></td>
                <td><form:radiobutton path="questionEleven" id="questionEleven" value="4"/></td>
                <td><form:radiobutton path="questionEleven" id="questionEleven" value="5"/></td>
            </tr>
            <tr>
                <td>
                    <lable for="questionTwelve">12. Во время семинара я выучил много полезной информации.</lable>
                </td>
                <td><form:radiobutton path="questionTwelve" id="questionTwelve" value="1"/></td>
                <td><form:radiobutton path="questionTwelve" id="questionTwelve" value="2"/></td>
                <td><form:radiobutton path="questionTwelve" id="questionTwelve" value="3"/></td>
                <td><form:radiobutton path="questionTwelve" id="questionTwelve" value="4"/></td>
                <td><form:radiobutton path="questionTwelve" id="questionTwelve" value="5"/></td>
            </tr>


        </table>
        <input type="submit" value="Сохранить" class="btn btn-primary">
        <a href="<c:url value="/rateTeacher"/> " class="btn btn-default">Отмена</a>
        </form:form>


<%@include file="/WEB-INF/views/template/footer.jsp" %>