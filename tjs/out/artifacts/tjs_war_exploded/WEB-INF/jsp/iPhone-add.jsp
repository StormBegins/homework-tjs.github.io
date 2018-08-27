<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<form action="<c:url value="/jsp/add"/>" method="post">
    <div class="form-group">
        <label for="id">手机编号</label>
        <input type="number" class="form-control" id="id" name="id" placeholder="id">
    </div>
    <div class="form-group">
        <label for="name">手机型号</label>
        <input type="text" class="form-control" id="name" name="name" placeholder="name">
    </div>
    <div class="form-group">
        <label for="datetime">出厂日期</label>
        <input type="text" class="form-control" id="datetime" name="datetime" placeholder="datetime">
    </div>
    <div class="form-group">
        <label for="color">产品颜色</label>
        <input type="text" class="form-control" id="color" name="color" placeholder="color">
    </div>
    <div class="form-group">
        <label for="price">手机价钱</label>
        <input type="number" class="form-control" id="price" name="price" placeholder="price">
    </div>
    <div class="form-group">
        <label for="stock">手机库存</label>
        <input type="number" class="form-control" id="stock" name="stock" placeholder="stock">
    </div>
    <div>
        <label for="firm">产品生产厂家</label>
        <input type="text" class="form-control" id="firm" name="firm" placeholder="firm">
    </div>
    <div><input type="submit" class="btn btn-primary"></div>
</form>

</body>
</html>
