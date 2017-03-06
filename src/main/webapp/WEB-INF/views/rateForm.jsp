<%@include file="/WEB-INF/views/template/header.jsp" %>
<%--Teachers table--%>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Rate Form</h1>
            <p class="lead">Here a form, which you should fill</p>
        </div>
        <table class="table table-striped table-hover">
            <thead>
            <tr>
                <th>Teacher</th>
            </tr>
            </thead>
        </table>
        <form:form action="#" method="post"
                   commandName="teacherResult" enctype="multipart/form-data">
        <ul class="list-group">
            <li class="list-group-item">
                <div class="form-group">

                    <lable for="questionOne">Question 1</lable>
                    <label class="checkbox-inline"><form:radiobutton path="questionOne" id="questionOne"
                                                                     value="1"/>
                        Bad </label>
                    <label class="checkbox-inline"><form:radiobutton path="questionOne" id="questionOne"
                                                                     value="2"/>
                        Not Bad </label>
                    <label class="checkbox-inline"><form:radiobutton path="questionOne" id="questionOne"
                                                                     value="3"/>
                        Normal </label>
                    <label class="checkbox-inline"><form:radiobutton path="questionOne" id="questionOne"
                                                                     value="4"/>
                        Good </label>
                    <label class="checkbox-inline"><form:radiobutton path="questionOne" id="questionOne"
                                                                     value="5"/>
                        Great </label>

                </div>
            </li>
            </li>
            <li class="list-group-item">
                <div class="form-group">
                    <lable for="questionTwo">Question 2</lable>
                    <label class="checkbox-inline"><form:radiobutton path="questionTwo" id="questionTwo"
                                                                     value="1"/>
                        Bad </label>
                    <label class="checkbox-inline"><form:radiobutton path="questionTwo" id="questionTwo"
                                                                     value="2"/>
                        Not Bad </label>
                    <label class="checkbox-inline"><form:radiobutton path="questionTwo" id="questionTwo"
                                                                     value="3"/>
                        Normal </label>
                    <label class="checkbox-inline"><form:radiobutton path="questionTwo" id="questionTwo"
                                                                     value="4"/>
                        Good </label>
                    <label class="checkbox-inline"><form:radiobutton path="questionTwo" id="questionTwo"
                                                                     value="5"/>
                        Great </label>

                </div>
            </li>
        </ul>

        <input type="submit" value="Submit" class="btn btn-success">
        </form:form>


<%@include file="/WEB-INF/views/template/footer.jsp" %>