<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 012 12.03.18
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>userdata</title>
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

</head>
<body>
<h1>Details</h1>
<table id="tb">
    <tr>
        <th width="80">ID</th>
        <th width="120">NAME</th>
        <th width="120">LastName</th>
        <th width="120">Email</th>
        <th width="120">Mobile</th>
    </tr>

    <tr>
        <td>${us.id}</td>
        <td>${us.name}</td>
        <td>${us.lastName}</td>
        <td>${us.email}</td>
        <td>${us.mobile}</td>
    </tr>
</table>
</body>
</html>
