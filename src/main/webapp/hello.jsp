<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" cellpadding="0" cellspacing="0" width="500px" height="250px" style="margin:0 auto">
    <caption>项目信息(<a href="addEmp.jsp">新增项目</a>)</caption>
    <tr>
        <td>Projec tName*</td>
        <td>Justification</td>
        <td>positions</td>
        <td>Project Leader*</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${listEmp }" var="emp" varStatus="i">
        <tr class="row${i.index%2+1 }">
            <td>${emp.id }</td>
            <td>${emp.name }</td>
            <td>${emp.salary }</td>
            <td>${emp.age }</td>
            <td><a href="delete.do?id=${emp.id }" onclick="return confirm('是否确认删除${emp.name }信息?')">删除</a> <a href="load.do?id=${emp.id }">更新</a></td>
        </tr>
    </c:forEach>
</table>
<div style="width:250px;margin:0 auto">
    <c:choose>
        <c:when test="${page.pageNum<=1 }">
            <a href="list.do?pageNum=1">前一页</a>
        </c:when>
        <c:otherwise>
            <a href="list.do?pageNum=${page.pageNum-1 }">前一页</a>
        </c:otherwise>
    </c:choose>
    <c:forEach var="i" begin="1" end="${page.pageTotal }" step="1">
        <a href="list.do?pageNum=${i }">${i }</a>
    </c:forEach>
    <c:choose>
        <c:when test="${page.pageNum>=page.pageTotal }">
            <a href="list.do?pageNum=${page.pageTotal} ">后一页</a>
        </c:when>
        <c:otherwise>
            <a href="list.do?pageNum=${page.pageNum+1 }">后一页</a>
        </c:otherwise>
    </c:choose>
    <span style="margin-left:10px">一共${page.pageTotal }页</span>
</div>
</body>
</html>
</html>
