<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>

    <link rel="stylesheet" type="text/css"
          href="webjars/bootstrap/3.3.7/css/bootstrap.min.css"/>

    <link href="${jstlCss}" rel="stylesheet"/>

</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">David Sells: I like Rodney Strong Pinot Noir...</a>
        </div>
    </div>
</nav>

<div class="container">


    <form method="post">
        <label>User</label>
        <input name="user" type="text" value=${user}>
        <div>
            <h1>${wine.name}</h1>
            <br/>
            <p2>${wine.country}</p2>
            <br/>
            <p2>${wine.producer}</p2>
            <br/>
            <p2>${wine.vintage}</p2>
            <p2>${wine.varietal}</p2>
            <p2>(${wine.type})</p2>
            <br/>
            <p2>${wine.showPrice}</p2>
        </div>
        <input type="submit" value="Request Wine Recommendation">
    </form>


</div>
<!-- /.container -->

<script type="text/javascript"
        src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
