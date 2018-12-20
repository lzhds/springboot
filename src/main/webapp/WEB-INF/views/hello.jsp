<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 24306
  Date: 2018/12/11
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        HI 现在时间是 ${now}
</body>
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${customer}" var="s" varStatus="st">
        <tr>
            <td>${s.id}</td>
            <td>${s.customer_name}</td>
        </tr>
    </c:forEach>
</table>
</html>
