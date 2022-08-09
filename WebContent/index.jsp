<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Track That Track</title>
  <link rel="icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon"> 
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon"> 
  <link rel="preconnect" href="https://fonts.gstatic.com" />
  	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/index.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>

<body>
  
  <nav class="navbar navbar-expand-sm navClass">
    <div class="container-fluid">
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon "></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link disabled" aria-current="page" href="#">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/about">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/signup">Signup</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/signin">Sign In</a>
          </li>
           <li class="nav-item">
            <a class="nav-link" href="http://localhost:8080/spring-crm-rest/api/customers">B2B</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="http://localhost:8081">Admin</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  
    <header>
      <div class="row">
        <div class="col-sm-6">
          <h1 class="header-text">A way to manage your record collection</h1>
          <p class="par-text">
            Tired of looking at pile of records and having no idea what you really have?
            With Track That Track just login to view your collection in alphabetical order,
            add to your collection, update your collection and even remove from your collection.
          </p>
          <a href="${pageContext.request.contextPath}/signup" class="btn btn1" >Signup</a>
          <a href="${pageContext.request.contextPath}/signin" class="btn btn2" >Sign In</a>
        </div>
        <div class="col-sm-6 logo"><img width="100%" src="${pageContext.request.contextPath}/resources/images/TrackThat.png" alt="TrackThatLogo"></div>
      </div>  
  </header>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>