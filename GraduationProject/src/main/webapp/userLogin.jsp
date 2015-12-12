<%--
  Created by IntelliJ IDEA.
  User: tqy
  Date: 15-12-12
  Time: 下午3:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>问道 用户登录</title>
    <link href="<%=request.getContextPath()%>/resources/css/userLogin.css" rel="stylesheet" type="text/css"/>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <%-- video.js--%>
</head>
<body>
<div class="container">
    <div>
        <h3>问道 登录</h3>
    </div>
    <div class="input-group input-group-lg">
        <span class="input-group-addon" id="sizing-addon1">用户名:</span>
        <input type="text" class="form-control" placeholder="Username" aria-describedby="sizing-addon1">
    </div>

    <div class="input-group input-group-lg">
        <span class="input-group-addon" id="sizing-addon1">密&nbsp&nbsp&nbsp码:</span>
        <input type="password" class="form-control" placeholder="Password" aria-describedby="sizing-addon1">
    </div>

    <div class="button">
        <input type="submit" name="submit" value="登录"/>
        <input type='button' value="取消" Response.Write("
        <script language=\"javascript\">window.opener=null;window.close();</script>
        ");>
    </div>
</div>
</body>
</html>
