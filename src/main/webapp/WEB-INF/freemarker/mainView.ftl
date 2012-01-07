<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <script src="/js/jquery-1.6.2.js" type="text/javascript"></script>
    <script src="/js/common.js" type="text/javascript"></script>
    <script src="/js/jquery.window.js" type="text/javascript"></script>
    <script src="/js/jquery-ui-1.8.15.custom.min.js" type="text/javascript"></script>
    <script src="/js/accordionImageMenu.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="/css/main.css"/>
    <link rel="stylesheet" type="text/css" href="/css/jquery.window.css" />
    <link rel="stylesheet" type="text/css" href="/css/jquery-ui-1.8.15.custom.css" />
    <link rel="stylesheet" type="text/css" href="/css/accordionImageMenu.css" />
    <title>Beadshop</title>
</head>
<body>
<div style="height: 50px">

</div>
<div id="accordionMenu" style="margin-left: auto; margin-right: auto;">
    <#list categories as category>
        <a href="#" onclick="loadCategory(${category.id})"><span>${category.name}</span><img src="${category.imageLocation}"/></a>
    </#list>
</div>

<div id="content">

</div>
</body>