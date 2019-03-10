<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Welcome</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

    <div style="text-align:center" class="main">

        <!-- Sign up form -->
        <section class="signup">
            <div class="container">
                        <h2 class="form-title">Welcome To ProfileBook</h2>
                        <div class="form-group form-button">
                            <td><form action="web/login">
                            <input type="submit" style="margin:5px" name="signin" id="signin" class="form-submit" value="Login"/>
                            </form></td></br>
                            <td><form action="web/register">
                            <input type="submit" style="margin:5px" name="home" id="signin" class="form-submit" value="Register"/>
                            </form></td></br>
                        </div>
                </div>
            </div>
        </section>

    </div>
</body>
</html>
