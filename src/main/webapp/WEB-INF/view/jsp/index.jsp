<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/commons/include/taglib-context.jsp" %>
<html>
<head>
    <title>用户登录</title>
    <style>
        body {
            background-color: #eee;
        }

        #carousel-example-generic {
            margin-top: 70px;
            margin-bottom: 70px;
        }

        .form-row {
            margin-bottom: 17px;
            width:340px;
        }
    </style>
</head>
<body>
<div id="content" style="padding-top: 70px;">
    <%--<div class="row" id="content">--%>
    <%--<div class="col-sm-4"></div>--%>
    <%--<div class="col-xs-6">--%>
    <%--<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">--%>
    <%--<!-- Indicators -->--%>
    <%--<ol class="carousel-indicators">--%>
    <%--<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>--%>
    <%--<li data-target="#carousel-example-generic" data-slide-to="1"></li>--%>
    <%--<li data-target="#carousel-example-generic" data-slide-to="2"></li>--%>
    <%--</ol>--%>

    <%--<!-- Wrapper for slides -->--%>
    <%--<div class="carousel-inner" role="listbox">--%>
    <%--<div class="item active">--%>
    <%--<img src="static/images/1.jpg" alt="1.jpg">--%>

    <%--<div class="carousel-caption">--%>
    <%--<h3>1111</h3>--%>

    <%--<p>1111</p>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--<div class="item">--%>
    <%--<img src="static/images/2.jpg" alt="2.jpg">--%>

    <%--<div class="carousel-caption">--%>
    <%--<h3>2222</h3>--%>

    <%--<p>2222</p>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--<div class="item">--%>
    <%--<img src="static/images/3.jpg" alt="3.jpg">--%>

    <%--<div class="carousel-caption">--%>
    <%--<h3>3333</h3>--%>

    <%--<p>3333</p>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--<div class="col-sm-4">--%>
    <div class="alert alert-info center-block" style="width:400px;" role="alert">商户初始密码为手机号后6位</div>
    <div id="login-form-container" class="center-block" style="width:400px;background-color: #fff;padding: 30px 30px 20px 30px;">
        <form action="${ctx}/login.do" method="post">
            <h3 style="width:100px; margin: 0; float: left; margin-bottom: 20px;">用户登录</h3>
            <c:if test="${!empty info}">
                <div id="tip" style="width:220px; padding:4px; margin:0; float:right;"  class="alert alert-warning" role="alert">
                        ${info}
                </div>
            </c:if>
            <div class="input-group input-group-lg form-row" style="margin-top: 20px; clear: both;">
                <span class="input-group-addon" id="username-addon" style="width:90px;">账&nbsp;&nbsp;号</span>
                <input type="text" class="form-control" placeholder="请输入商户编号"
                       aria-describedby="username-addon" name="username">
            </div>
            <div class="input-group input-group-lg form-row">
                <span class="input-group-addon" id="password-addon" style="width:90px;">密&nbsp;&nbsp;码</span>
                <input type="password" class="form-control" placeholder="请输入密码"
                       aria-describedby="password-addon" name="password">
            </div>
            <div class="input-group input-group-lg" style="width:180px;float:left;margin-bottom:15px;">
                <span class="input-group-addon" id="validcode-addon" style="width:90px;">验证码</span>
                <input type="text" class="form-control" aria-describedby="validcode-addon" name="validcode">
            </div>
            <img id="validateImg" src="${ctx}/validateCode/getValidateCode.do" class="img-responsive img-rounded"
                 style="width:150px;cursor:pointer;float:right;margin-bottom:15px;">

            <div class="checkbox form-row" style="clear: both;">
                <label>
                    <input id="rememberMe" name="rememberMe" type="checkbox" value="true"> 记住密码<span
                        style="color: #999;">   (请勿在公共电脑上勾选此项)</span>
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block form-row" type="submit">登录系统</button>
        </form>
    </div>
</div>
<script>
    $(document).ready(function () {
        $('input[name=username]').focus();
//        $('.carousel').carousel();
        $('#tip').fadeOut(8000);
    });
    $('#validateImg').on('click', function () {
        var newSrc = $('#validateImg').attr("src") + "?rand=" + new Date().getTime();
        $('#validateImg').attr({src: newSrc});
    })
</script>
</body>
</html>