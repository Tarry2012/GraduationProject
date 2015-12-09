<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <title>问道学习视频网站</title>
    <link href="<%=request.getContextPath()%>/resources/css/index.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="js/myfocus-2.0.1.min.js"></script>
    <style type="text/css">
        #myFocus{ width:560px; height:300px;}
    </style>
    <script type="text/javascript">
        //设置
        myFocus.set({
            id:'myFocus',//ID
            pattern:'mF_fancy'//风格
        });
    </script>
</head>
<body>

<div class="top_content">
    <ul>
        <li><a href="#">我的主页</a></li>
        <li><a href="#">登录</a></li>
        <li><a href="#">注册</a></li>
    </ul>
    <div class="top_title">
        欢迎来到 问道视频学习网站
    </div>
</div>
<%--top结束--%>

<div class="logo">
    <div class="logo_left">
        <img src="resources/images/wendaologo.png" alt="logoImage" height="200px">
    </div>
    <div class="logo_middle">传播全人类的智慧</div>
    <div class="logo_right">
        <form action="" method="get">
            <div class="search_text">
                <input name="search" type="text" placeholder="请输入内容"/>
                <button name="searchButton" type="button"><i class="glyphicon glyphicon-search"></i></button>
            </div>
        </form>
    </div>
</div>
<div class="navigation">
    <ul class="nav nav-pills">
        <li role="presentation" class="disabled"><a href="#">首页</a></li>
        <li role="presentation" class="disabled"><a href="#">计算机</a></li>
        <li role="presentation" class="disabled"><a href="#">哲学</a></li>
        <li role="presentation" class="disabled"><a href="#">历史</a></li>
        <li role="presentation" class="disabled"><a href="#">心理</a></li>
        <li role="presentation" class="disabled"><a href="#">数学</a></li>
        <li role="presentation" class="disabled"><a href="#">文学</a></li>
    </ul>
</div>
<%--loge结束--%>

<div class="advertisement">
    <div class="picture">
        <ul>
            <li><a href="#1"><img src="resources/images/1a.jpg" thumb="" alt="图片1来源于网络，版权属于作者" text="图片1更详细的描述文字" /></a></li>
            <li><a href="#2"><img src="resources/images/2a.jpg" thumb="" alt="版权属于作者，图片2来源于网络" text="图片2更详细的描述文字" /></a></li>
            <li><a href="#3"><img src="resources/images/3a.jpg" thumb="" alt="图片3来源于网络，版权属于作者" text="图片3更详细的描述文字" /></a></li>
            <li><a href="#4"><img src="resources/images/4a.jpg" thumb="" alt="版权属于作者，图片4来源于网络" text="图片4更详细的描述文字" /></a></li>
            <li><a href="#5"><img src="resources/images/5a.jpg" thumb="" alt="图片5来源于网络，版权属于作者" text="图片5更详细的描述文字" /></a></li>
        </ul>
    </div>
    <div class="rankinglist"></div>
</div> <%--advertisement结束--%>
</body>
</html>