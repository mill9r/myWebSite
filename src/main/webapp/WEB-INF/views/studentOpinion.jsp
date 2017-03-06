<%@include file="/WEB-INF/views/template/header.jsp" %>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Add Teacher</h1>
            <p class="lead">Fill the below information to add a teacher!</p>
        </div>


        <div class="form-group">
            <lable for="category">Academic degree:</lable>
            <label class="checkbox-inline"><form:radiobutton path="academicDegree" id="degree" value="Bachelor"/>
                Bachelor </label>
            <label class="checkbox-inline"><form:radiobutton path="academicDegree" id="degree" value="Master"/>
                Master </label>
            <label class="checkbox-inline"><form:radiobutton path="academicDegree" id="degree" value="Doctor"/>
                Doctor </label>
        </div>


        <input type="submit" value="Submit" class="btn btn-default">
        <a href="<c:url value="/admin/teacherAccounting"/> " class="btn btn-default">Cancel</a>

        </form:form>
<%@include file="/WEB-INF/views/template/footer.jsp" %>