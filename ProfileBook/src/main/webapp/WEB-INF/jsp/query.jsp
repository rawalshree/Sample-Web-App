<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>
        <meta charset="UTF-8" />
        <title>Dashboard</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/demo.css" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/component.css" />
        <script src="${pageContext.request.contextPath}/resources/js/modernizr.custom.js"></script>
    </head>
    <body>
        <div class="container">
            <ul id="gn-menu" class="gn-menu-main">
                <li class="gn-trigger">
                    <a class="gn-icon gn-icon-menu"><span>Menu</span></a>
                    <nav class="gn-menu-wrapper">
                        <div class="gn-scroller">
                            <ul class="gn-menu">
                                <li class="gn-search-item">
                                    <form method="GET" action="/ProfileBook/web/dashboard/search?search=${search.id}">
                                    <input placeholder="Search" type="input" name="search" value="${search.id}" class="gn-search">
                                    <a class="gn-icon gn-icon-search"><span>Search</span></a></form>
                                </li>
                                <li><a class="gn-icon gn-icon-article" onclick="window.location.href = '#';">Query</a></li>
                                <li><a class="gn-icon gn-icon-pictures" onclick="window.location.href = '/ProfileBook/web/dashboard/images';">Images</a></li>
                                <li>
                                <ul class="gn-submenu">
                                    <li><a class="gn-icon gn-icon-videos" onclick="window.location.href = '/ProfileBook/web/dashboard/videos';">Videos</a></li>
                                </ul>
                                <li><a class="gn-icon gn-icon-cog" onclick="window.location.href = '/ProfileBook/web/dashboard/settings';">Settings</a></li>
                                <li><a class="gn-icon gn-icon-help" onclick="window.location.href = '/ProfileBook/web/dashboard/help';">Help</a></li>
                                </li>
                            </ul>
                        </div><!-- /gn-scroller -->
                    </nav>
                    <li><a onclick="window.location.href = '/ProfileBook/web/dashboard';">Home</a></li>
                </li>
                <li></li>
            </ul>
            <header>
                <h1>Query</span></h1><br>
                <h3> Here you can retrieve a user based on id</h3>
                <h2>
                     <form action="/ProfileBook/web/dashboard/query?id=${queryid}" method="get">
                        Search ID : <input type="input" name="id" value="${queryid}">
                        <input type="submit" value="Submit">
                      </form> 
                </h2><br>
                <h2>${message}</h2>
            </header> 
        </div><!-- /container -->
        <script src="${pageContext.request.contextPath}/resources/js/classie.js"></script>
        <script src="${pageContext.request.contextPath}/resources/js/gnmenu.js"></script>
        <script>
                new gnMenu( document.getElementById( 'gn-menu' ) );
        </script>
    </body>
</html>
