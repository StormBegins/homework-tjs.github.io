<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/jsp/update" method="post">
<c:forEach var="iphone" items="${iphone}">
    <div class="form-group">
        <label for="id">手机编号</label>
        <input type="number" class="form-control" id="id" name="id" value="${iphone.id}">
    </div>
    <div class="form-group">
        <label for="name">手机型号</label>
        <input type="text" class="form-control" id="name" name="name"  value="${iphone.name}">
    </div>
    <div class="form-group">
        <label for="datetime">出厂日期</label>
        <input type="text" class="form-control" id="datetime" name="datetime" value="${iphone.datetime}">
    </div>
    <div class="form-group">
        <label for="color">产品颜色</label>
        <input type="text" class="form-control" id="color" name="color" value="${iphone.color}">
    </div>
    <div class="form-group">
        <label for="price">手机价钱</label>
        <input type="number" class="form-control" id="price" name="price" value="${iphone.price}">
    </div>
    <div class="form-group">
        <label for="stock">手机库存</label>
        <input type="number" class="form-control" id="stock" name="stock" value="${iphone.stock}">
    </div>
    <div>
        <label for="firm">产品生产厂家</label>
        <input type="text" class="form-control" id="firm" name="firm" value="${iphone.firm}">
    </div>
    <div><input type="submit" value="提交更新" class="btn btn-success"></div>
</c:forEach>
</form>

</body>
</html>
