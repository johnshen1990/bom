<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/commons/include/taglib-context.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap -->
    <link href="${ctx}/static/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${ctx}/static/css/web.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="${ctx}/static/lib/jquery/jquery-1.11.3.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${ctx}/static/lib/bootstrap/js/bootstrap.min.js"></script>
    <style>
        #header {
            background-color: #222;
        }

        #header h2 {
            color: #999;
            margin: 0;
            line-height: 70px;
        }

        .shadow {
            height: 2px;
            background-color: #000;
        }

        #footer {
            background-color: #222;
        }

        #footer p.copyright {
            line-height: 45px;
            margin: 0;
            color: #999;
        }
    </style>
    <decorator:head />
</head>
<body>
    <div class="container-fluid">
        <div class="row" id="header">
            <div class="col-sm-1"></div>
            <div class="col-sm-10">
                <h2>即联商户后台管理系统</h2>
            </div>
            <div class="col-sm-1"></div>
        </div>
        <div class="row">
            <div class="col-sm-12 shadow"></div>
        </div>

        <div class="row">
            <div class="col-sm-12">
                <decorator:body/>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-12 shadow"></div>
        </div>
        <div class="row" id="footer">
            <div class="col-sm-12">
                <p class="text-center copyright">Copyright © 2014-2015 北京西石信息技术有限公司 版权所有 京ICP备15012500号</p>
            </div>
        </div>
    </div>
    <script>
        //确保content区域的最小高度
        $(function(){
            var headerHeight = $('#header').height();
            var footerHeight = $('#footer').height();
            var windowHeight = $(window).height();
            var contentHeight = windowHeight - (headerHeight + footerHeight + 4);
            $('#content').css('min-height',contentHeight+'px');
        });
    </script>
</body>
</html>