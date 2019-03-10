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
                                <li><a class="gn-icon gn-icon-article" onclick="window.location.href = '/ProfileBook/web/dashboard/query';">Query</a></li>
                                <li><a class="gn-icon gn-icon-pictures" onclick="window.location.href = '#';">Images</a></li>
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
                    <h1>Images</span></h1>
                    <h2>Here you can upload and save your pictures</h2>
                    <h2><form action="images" method="post" enctype="multipart/form-data">
                        <br>
                        <h3> Add Your Profile Picture </h3>
                        <br>
                        Select image to upload:
                        <input type="file" name="file" id="fileToUpload" accept="image/*" required>
                        <input type="submit" value="Upload Image" name="submit">
                        <br>
                        <input type="text" name="filename"  placeholder="Filename" required/> 
                        <h3 style="color: red; font-style: italic;">${message}</h3>
                    </form>
                    
                    </h2>
            </header> 
        </div><!-- /container -->
        <script src="${pageContext.request.contextPath}/resources/js/classie.js"></script>
        <script src="${pageContext.request.contextPath}/resources/js/gnmenu.js"></script>
        <script>
                new gnMenu( document.getElementById( 'gn-menu' ) );
        </script>
    </body>
</html>
