<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Loskutok</title>
    <meta name="description" content="Beadshop">
    <meta name="author" content="Vitaly Arbuzov">
    <script src="/js/jquery-1.6.2.js" type="text/javascript"></script>
    <script src="/js/jquery.validate.js" type="text/javascript"></script>
    <script src="/js/common.js" type="text/javascript"></script>
    <script src="/js/backbone.js" type="text/javascript"></script>

    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <link rel="stylesheet" href="http://twitter.github.com/bootstrap/1.4.0/bootstrap.min.css"/>
    <style type="text/css">
        body {
            padding-top: 60px;
        }
    </style>
</head>

<body>
<div class="topbar">
    <div class="topbar-inner">
        <div class="container-fluid">
            <a class="brand" href="#">Loskutok</a>
            <ul class="nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#orders" onclick="app.loadPageContent('orders')"></a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
            <p class="pull-right">Logged in as <span id="userName">'Anonymous'</span></p>
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="sidebar">
    <#include "/sidebar.ftl">
    </div>
    <div class="content">
        <div id="noticeMessage"></div>
        <div id="pageContent"></div>

        <footer>
            <p>&copy; Loskutok 2011</p>
        </footer>
    </div>
</div>

</body>
</html>