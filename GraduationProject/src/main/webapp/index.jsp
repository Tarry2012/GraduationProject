<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form name="loginForm" method="post" action="<%=request.getContextPath()%>/userLogin">
    <table>
        <tr>
            <td>用户名:<input type="text" name="userName" id="userName"></td>
        </tr>
        <tr>
            <td>密码:<input type="password" name="password" id="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录" >
                <input type="reset" value="重置" ></td>
        </tr>
    </table>
</form>
</body>
</html>
