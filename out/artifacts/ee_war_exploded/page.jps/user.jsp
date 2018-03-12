<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org.tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org.tags/form" prefix="form"%>
<%@taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user</title>
</head>
<style type="text/css">
    .tb {
        border-collapse: collapse;
        border-spacing: 0;
        border-color: #ccc;
    }

    .tb td {
        font-family: Arial, sans-serif;
        font-size: 14px;
        padding: 10px 5px;
        border-style: solid;
        border-width: 1px;
        overflow: hidden;
        word-break: normal;
        border-color: #ccc;
        color: #333;
        background-color: #fff;
    }

    .tb th {
        font-family: Arial, sans-serif;
        font-size: 14px;
        font-weight: normal;
        padding: 10px 5px;
        border-style: solid;
        border-width: 1px;
        overflow: hidden;
        word-break: normal;
        border-color: #ccc;
        color: #333;
        background-color: #f0f0f0;
    }

    .tb .tg-4eph {
        background-color: #f9f9f9
    }
</style>
<body>
<a href="../../index.jsp">back to main menu</a>
<br/>
<br/>
<h1>User List</h1>
<c:if test="${!empty listUsers}">
<table id="tb">
    <tr>
        <th width="80">ID</th>
        <th width="120">name</th>
        <th width="120">lastName</th>
        <th width="120">email</th>
        <th width="120">mobile</th>
        <th width="60">edit</th>
        <th width="60">delete</th>
    </tr>
    <c:forEach items ="${listUsers} var=us">
    <tr>
        <td>${us.id}</td>
        <td>${us.name}</td>
        <td>${us.lastName}</td>
        <td>${us.email}</td>
        <td>${us.mobile}</td>
        <td><a href="<c:url value='/edit/${us.id}'/>">">Edit</a> </td>
        <td><a href="<c:url value='/remove/${us.id}'/>">">Delete</a> </td>
    </tr>
    </c:forEach>
</table>
</c:if>


<h1>Registry</h1>

<c:url var="addAction" value="/user/add">

    <form:form action="${addAction}" commandName="us">
        <table>
            <c:if test:="${!empty us.name}">
                <tr>
                    <td>
                        <form:label path="id">
                            <sping:message text="ID"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="id" readonly="true" size="8" disabled="true"/>
                        <form:hidden path:id/>
                    </td>
                </tr>
            </c:if>
            <tr>
                <td>
                    <form:label path="name">
                        <spring:message text="name"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="name"/>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="lastName">
                        <srimg:message text="lastName"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="lastName"/>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="email">
                        <srimg:message text="email"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="email"/>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="mobile">
                        <srimg:message text="mobile"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="mobile"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <c:if test="${!empty us.name}">
                        <input type="submit"
                               value="<spring:message  text="Edit User"/>"/>
                    </c:if>
                    <c:if test="${!empty us.name}">
                        <input type="submit"
                               value="<spring:message  text="Add User"/>"/>
                    </c:if>

                </td>
            </tr>

        </table>
    </form:form>

</body>
</html>
