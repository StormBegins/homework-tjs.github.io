<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>手机销售列表</title>
</head>
<body>
<form  action="<c:url value="/jsp/del" />" method="post">
    <table class="table table-striped">
        <tr>
            <th><input type="checkbox" onclick="toggle_check_all(this)"></th>
            <th>编号</th>
            <th>型号</th>
            <th>出厂日期</th>
            <th>产品颜色</th>
            <th>产品价钱</th>
            <th>产品库存</th>
            <th>产品生产厂家</th>
            <th>操作</th>
        </tr>

        <c:forEach var="iphone" items="${iphones}">
        <tr>
            <td><input name="id" value=${iphone.id} type="checkbox"></td>
            <td>${iphone.id}</td>
            <td>${iphone.name}</td>
            <td>${iphone.datetime}</td>
            <td>${iphone.color}</td>
            <td>${iphone.price}</td>
            <td>${iphone.stock}</td>
            <td>${iphone.firm}</td>
            <td>
                <a href="<c:url value="/jsp/update?id=${iphone.id}"/>">更新</a>
            </td>
        </tr>
    </c:forEach>
    </table>

    <div style="margin-top: 2em;">
        <input type="submit" value="删除" class="btn btn-success">
        <a class="btn btn-primary" href="<c:url value="/jsp/add"/>">增加新的手机型号</a>
    </div>
</form>

<script>
    function toggle_check_all(e) {
        var checkboxs = document.getElementsByName("id");
        for (var i = 0; i < checkboxs.length; i++) {
            checkboxs[i].checked = e.checked;
        }
    }
    document.querySelector("#booklist").classList.add("active");
</script>
</body>
</html>

