<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: 程
  Date: 2016/11/23
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="application/javascript" src="<c:url value="/static/js/jquery-3.1.1.min.js"/>"></script>
<html class=" js flexbox canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths">
<head>
    <title>阿程，雨下一整夜</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Cache-Control" content="no-transform">
    <meta http-equiv="Cache-Control" content="no-siteapp">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="description" content="">
    <meta name="keywords" content="Vtrois,Tencent,QCloud,Kratos,Developer,Web,Html5,Css3,Java,JavaScript,PHP,C#">
    <link rel="dns-prefetch" href="https://s.w.org/">
    <link rel="stylesheet" id="crayon-css" href="<c:url value="/static/css/crayon.min.css"/>" type="text/css"
          media="all">
    <link rel="stylesheet" id="crayon-theme-tomorrow-css" href="<c:url value="/static/css/tomorrow.css"/>"
          type="text/css" media="all">
    <link rel="stylesheet" id="crayon-font-monaco-css" href="<c:url value="/static/css/monaco.css"/>" type="text/css"
          media="all">
    <link rel="stylesheet" id="animate-style-css" href="<c:url value="/static/css/animate.min.css"/>" type="text/css"
          media="all">
    <link rel="stylesheet" id="awesome-style-css" href="<c:url value="/static/css/font-awesome.min.css"/>"
          type="text/css" media="all">
    <link rel="stylesheet" id="bootstrap-style-css" href="<c:url value="/static/css/bootstrap.min.css"/>"
          type="text/css" media="all">
    <link rel="stylesheet" id="superfish-style-css" href="<c:url value="/static/css/superfish.min.css"/>"
          type="text/css" media="all">
    <link rel="stylesheet" id="kratos-style-css" href="<c:url value="/static/css/kratos.min.css"/>"
          type="text/css" media="all">
</head>
<body data-spy="scroll" data-target=".scrollspy">
<div id="kratos-wrapper">
    <div id="kratos-page">
        <nav id="offcanvas-menu" class="menu-menu-container" style="height: 925px;">
            <ul id="" class="" style="touch-action: pan-y;">
                <li><a href="#">About Me</a></li>
                <li><a href="#">Blog</a></li>
                <li><a href="#">Download</a></li>
                <li><a href="#">Guestbook</a></li>
            </ul>
        </nav>
        <div id="kratos-header">
            <header id="kratos-header-section">
                <div class="container">
                    <div class="nav-header">
                        <a href="#" class="js-kratos-nav-toggle kratos-nav-toggle"><i></i></a>
                        <h1 id="kratos-logo"><a href="<c:url value="/front/main"/>">雨下一整夜</a></h1>
                        <nav id="kratos-menu-wrap" class="menu-menu-container">
                            <ul id="kratos-primary-menu" class="sf-menu sf-js-enabled sf-arrows"
                                style="touch-action: pan-y;">
                                <li><a href="#">关于我</a></li>
                                <li><a href="#">日志</a></li>
                                <li><a href="#">工具</a></li>
                                <li><a href="#">友链</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </header>
        </div>
        <div class="kratos-start kratos-hero-2">
            <div class="kratos-overlay"></div>
            <div class="kratos-cover kratos-cover_2 text-center"
                 style="background-image: url(https://www.vtrois.com/wp-content/themes/Kratos/images/background.jpg);">
                <div class="desc desc2 animate-box fadeInUp animated">
                    <h2>雨下一整夜</h2>
                    <span>其实那天见到你，很想告诉你，你的笑真美。</span>
                </div>
            </div>
        </div>
        <div id="kratos-blog-post" style="background:#f9f9f9">
            <div class="container">
                <div class="row">
                    <section id="main" class="col-md-8">
                        <div id="blog-table-list">
                            <script id="pagetmpl" type="text/x-dot-template">
                                {{ for(var i=0; i < it.length ; i++){ }}
                                <a href="<c:url value="/front/post/{{=it[i].id}}"/>">
                                    <div style="width:100%;height: 2px"></div>
                                    <%--<div class="kratos-entry-thumb clearfix">--%>
                                    <%--<img class="kratos-entry-thumb"--%>
                                    <%--src="<c:url value="/static/images/kratos-update.png"/>">--%>
                                    <%--</div>--%>
                                    <div class="kratos-post-inner">
                                        <header class="kratos-entry-header clearfix">
                                            <h1 class="kratos-entry-title">{{=it[i].postTitle}}</h1>
                                        </header>
                                        <div class="kratos-entry-content clearfix">
                                            <p>{{=it[i].postTitle}}</p>
                                        </div>
                                    </div>
                                    <div style="background: #CCCCCC;width:100%;height: 2px"></div>
                                </a>
                                {{ } }}
                            </script>
                        </div>


                        <div class="text-center" id="page-footer">
                            <ul class="pagination">
                                <li class="active">
                                    <a onclick="goToLastPage()" style="width: 110px;">上一页</a>
                                </li>
                                <li class="am-disabled">
                                    <a id="log-controller-now">1</a>
                                </li>
                                <li>
                                    <a title="下一页" onclick="goToNextPage()" style="width: 110px;">下一页</a>
                                </li>
                            </ul>
                        </div>
                    </section>

                    <aside id="kratos-widget-area" class="col-md-4 hidden-xs hidden-sm scrollspy">
                        <div id="sidebar" class="affix-top">
                            <aside id="kratos_about-2" class="widget amadeus_about clearfix">
                                <div class="photo-background"
                                     style="background:url(https://www.vtrois.com/wp-content/themes/Kratos/images/about.jpg) no-repeat center center; -webkit-background-size: cover; -moz-background-size: cover; -o-background-size: cover; background-size: cover;"></div>
                                <div class="photo-wrapper clearfix">
                                    <a href="<c:url value="/main/login"/>">
                                        <div class="photo-wrapper-tip text-center">
                                            <img class="about-photo" src="<c:url value="/static/images/avatar.jpg"/>">
                                        </div>
                                    </a>
                                </div>
                                <div id="authorDescription">
                                </div>
                            </aside>
                            <aside class="widget widget_kratos_poststab">
                                <ul id="tabul" class="nav nav-tabs nav-justified visible-lg">
                                    <li><a href="https://www.vtrois.com/#newest" data-toggle="tab"> 最新文章</a></li>
                                    <li class="active"><a href="https://www.vtrois.com/#hot" data-toggle="tab"> 热点文章</a>
                                    </li>
                                    <li><a href="https://www.vtrois.com/#rand" data-toggle="tab">随机文章</a></li>
                                </ul>
                                <ul id="tabul" class="nav nav-tabs nav-justified visible-md">
                                    <li><a href="https://www.vtrois.com/#newest" data-toggle="tab"> 最新</a></li>
                                    <li class="active"><a href="https://www.vtrois.com/#hot" data-toggle="tab"> 热点</a>
                                    </li>
                                    <li><a href="https://www.vtrois.com/#rand" data-toggle="tab">随机</a></li>
                                </ul>
                                <div class="tab-content">
                                    <div class="tab-pane fade" id="newest">
                                        <ul class="list-group" id="newList">
                                            <script id="listNew" type="text/x-dot-template">
                                                {{ for(var i=0; i < it.length ; i++){ }}
                                                <a class="list-group-item visible-lg"
                                                   title="{{=it[i].postTitle}}"
                                                   href="<c:url value="/front/post/{{=it[i].id}}"/>" rel="bookmark"><i
                                                        class="fa fa-book"> {{=it[i].postTitle}}</i> </a>
                                                {{ } }}</script>
                                        </ul>
                                    </div>
                                    <div class="tab-pane fade  in active" id="hot">
                                        <ul class="list-group" id="hotList">
                                            <script id="listHot" type="text/x-dot-template">
                                                {{ for(var i=0; i < it.length ; i++){ }}
                                                <a class="list-group-item visible-lg"
                                                   title="{{=it[i].postTitle}}"
                                                   href="<c:url value="/front/post/{{=it[i].id}}"/>" rel="bookmark"><i
                                                        class="fa fa-book"> {{=it[i].postTitle}}</i> </a>
                                                {{ } }}</script>
                                        </ul>
                                    </div>
                                    <div class="tab-pane fade" id="rand">
                                        <ul class="list-group" id="randList">
                                            <script id="listRand" type="text/x-dot-template">
                                                {{ for(var i=0; i < it.length ; i++){ }}
                                                <a class="list-group-item visible-lg"
                                                   title="{{=it[i].postTitle}}"
                                                   href="<c:url value="/front/post/{{=it[i].id}}"/>" rel="bookmark"><i
                                                        class="fa fa-book"> {{=it[i].postTitle}}</i> </a>
                                                {{ } }}</script>
                                        </ul>
                                    </div>
                                </div>
                            </aside>
                            <aside id="kratos_tags-2" class="widget widget_kratos_tags clearfix"><h4
                                    class="widget-title">标签聚合</h4>
                                <div class="tag_clouds">
                                    <a href="#" class="tag-link-111 tag-link-position-1" title="1个话题"
                                       style="font-size: 14px;">屌丝</a>
                                    <a href="#" class="tag-link-107 tag-link-position-2" title="1个话题"
                                       style="font-size: 14px;">多拨</a>
                                    <a href="#" class="tag-link-101 tag-link-position-3" title="3个话题"
                                       style="font-size: 14px;">博客</a>
                                    <a href="#" class="tag-link-147 tag-link-position-4" title="3个话题"
                                       style="font-size: 14px;">简洁</a>
                                    <a href="#" class="tag-link-95 tag-link-position-5" title="3个话题"
                                       style="font-size: 14px;">使用</a>
                                    <a href="#" class="tag-link-96 tag-link-position-6" title="1个话题"
                                       style="font-size: 14px;">修复</a>
                                    <a href="#" class="tag-link-90 tag-link-position-7" title="1个话题"
                                       style="font-size: 14px;">上网</a>
                                    <a href="#" class="tag-link-126 tag-link-position-8" title="3个话题"
                                       style="font-size: 14px;">更新</a>
                                    <a href="#" class="tag-link-109 tag-link-position-9" title="1个话题"
                                       style="font-size: 14px;">小米</a>
                                    <a href="#" class="tag-link-92 tag-link-position-10" title="10个话题"
                                       style="font-size: 14px;">主题</a>
                                    <a href="#" class="tag-link-106 tag-link-position-11" title="1个话题"
                                       style="font-size: 14px;">在线</a>
                                    <a href="#" class="tag-link-156 tag-link-position-12" title="9个话题"
                                       style="font-size: 14px;">说明</a>
                                    <a href="#" class="tag-link-116 tag-link-position-13" title="1个话题"
                                       style="font-size: 14px;">康盛</a>
                                    <a href="#" class="tag-link-115 tag-link-position-14" title="3个话题"
                                       style="font-size: 14px;">帮助</a>
                                    <a href="#" class="tag-link-98 tag-link-position-15" title="1个话题"
                                       style="font-size: 14px;">单线</a>
                                    <a href="#" class="tag-link-128 tag-link-position-16" title="3个话题"
                                       style="font-size: 14px;">样式</a>
                                    <a href="#" class="tag-link-105 tag-link-position-17" title="1个话题"
                                       style="font-size: 14px;">回复</a>
                                    <a href="#" class="tag-link-117 tag-link-position-18" title="1个话题"
                                       style="font-size: 14px;">影梭</a>
                                    <a href="#" class="tag-link-112 tag-link-position-19" title="1个话题"
                                       style="font-size: 14px;">山东</a>
                                    <a href="#" class="tag-link-123 tag-link-position-20" title="3个话题"
                                       style="font-size: 14px;">文章</a></div>
                            </aside>
                        </div>
                    </aside>
                </div>
            </div>
        </div>
        <footer>
            <div id="footer">
                <a class="cd-top visible-lg text-center"><span class="fa fa-chevron-up"></span></a>
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 col-md-offset-3 text-center">
                            <p class="kratos-social-icons">
                                <a target="_blank" rel="nofollow" href="http://weibo.com/Vtrois"><i
                                        class="fa fa-weibo"></i></a>
                                <a target="_blank" rel="nofollow" href="https://twitter.com/Vtrois"><i
                                        class="fa fa-twitter"></i></a>
                                <a target="_blank" rel="nofollow" href="https://www.facebook.com/SeatonJiang"><i
                                        class="fa fa-facebook-official"></i></a>
                                <a target="_blank" rel="nofollow" href="https://github.com/Vtrois"><i
                                        class="fa fa-github"></i></a>
                            </p>
                            <p>Copyright 2016
                                <a href="https://www.vtrois.com/">Vtrois's Blog</a>. All Rights Reserved.
                                <br>Theme:
                                <a href="https://github.com/vtrois/kratos" target="_blank" rel="nofollow">Kratos</a>
                                made by <a href="https://www.vtrois.com/" target="_blank" rel="nofollow">Vtrois</a>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
    </div>
</div>
<script type="text/javascript" src="<c:url value="/static/js/jquery.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/jquery_min_2_1_4.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/jquery-migrate.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/crayon.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/jquery.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/jquery.easing.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/jquery.qrcode.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/modernizr.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/bootstrap.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/jquery.waypoints.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/jquery.stellar.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/hoverIntent.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/superfish.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/kratos.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/wp-embed.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/json2.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/js/doT.min.js"/>"></script>
<script type="text/javascript">
    if ($("#main").height() > $("#sidebar").height()) {
        var footerHeight = 0;
        if ($('#page-footer').length > 0) {
            footerHeight = $('#page-footer').outerHeight(true);
        }
        $('#sidebar').affix({
            offset: {
                top: $('#sidebar').offset().top - 30,
                bottom: $('#footer').outerHeight(true) + footerHeight + 6
            }
        });
    }


    var framJsonStr = JSON.stringify(${framJson});
    var framJsonObj = JSON.parse(framJsonStr);
    var postsJsonStr = JSON.stringify(${postsJson});
    var postsJsonObj = JSON.parse(postsJsonStr);
    var pageNum = postsJsonObj.pageNum;
    var pageSize = postsJsonObj.pageSize;
    var totalNum = postsJsonObj.totalNum;
    var authorDes = "<p class=\"text-center\">" + framJsonObj.data.author[0].meta_value + "<br/>" + framJsonObj.data.author[1].meta_value + "</p>";
    document.getElementById("authorDescription").innerHTML = authorDes;

    if (framJsonObj.code == 1) {
        pagefn = doT.template($("#listHot").html());   //初始化列表模板
        updateHotList(framJsonObj.data.hotPosts);   //更新数据
        updateNewList(framJsonObj.data.newPosts);   //更新数据
        updateRandList(framJsonObj.data.randomPosts);   //更新数据
    }

    function updateHotList(data) {
        $("#listHot").empty(); //清空模板数据
        $("#hotList").html(pagefn(data));   //加入数据到模板
    }

    function updateNewList(data) {
        $("#listNew").empty(); //清空模板数据
        $("#newList").html(pagefn(data));   //加入数据到模板
    }

    function updateRandList(data) {
        $("#listRand").empty(); //清空模板数据
        $("#randList").html(pagefn(data));   //加入数据到模板
    }

    //开始加载列表数据
    if (postsJsonObj.code == 1) {
        pagefn = doT.template($("#pagetmpl").html());   //初始化列表模板
        updateList(postsJsonObj.data);   //更新数据
    } else {
        alert("获取数据失败！请联系管理员");
    }

    function updateList(data) {
        $("#pagetmpl").empty(); //清空模板数据
        $("#blog-table-list").html(pagefn(data));   //加入数据到模板
    }
    function goToNextPage() {
        pageNum = parseInt(pageNum) + 1;
        $.ajax({
            type: "POST",
            url: '<c:url value="/front/findPublishPost"/>',
            data: {pageNum: pageNum, pageSize: pageSize},
            dataType: 'json', //当这里指定为json的时候，获取到了数据后会自己解析的，只需要 返回值.字段名称 就能使用了
            cache: false,
            success: function (data) {
                if (data.code == 1) {
                    updateList(data.data);
                    pageNum = data.pageNum;
                    $("#log-controller-now").html(pageNum);
                }
            }
        });
    }

    function goToLastPage() {
        pageNum = parseInt(pageNum) - 1;
        $.ajax({
            type: "POST",
            url: '<c:url value="/front/findPublishPost"/>',
            data: {pageNum: pageNum, pageSize: pageSize},
            dataType: 'json', //当这里指定为json的时候，获取到了数据后会自己解析的，只需要 返回值.字段名称 就能使用了
            cache: false,
            success: function (data) {
                if (data.code == 1) {
                    updateList(data.data);
                    pageNum = data.pageNum;
                    $("#log-controller-now").html(pageNum);
                }
            }
        });
    }


</script>
</body>
</html>
