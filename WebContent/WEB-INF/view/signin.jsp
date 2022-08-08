<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Sign In</title>
  <link rel="icon" href="../Images/favicon.ico" type="image/x-icon"> 
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon">
  <link rel="preconnect" href="https://fonts.gstatic.com" />
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
  <link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/signin.css">
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
            <a class="nav-link " aria-current="page" href="${pageContext.request.contextPath}">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/about">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/signup">Signup</a>
          </li>
          <li class="nav-item">
            <a class="nav-link disabled" href="#">Sign In</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <div class="pageBackground">
  <div class="error">${loginError}</div>
    <img class="pageImg"src="${pageContext.request.contextPath}/resources/images/TrackThat.png" alt="logg" width="300" height="300">
    <div class="formCard">
      <h1 class="signInHeader">Sign In</h1>
        <form:form action="loginUser" modelAttribute="loginHelper" method="Post" id="signin">
        <div class="mb-3">
          <label for="userName" class="form-label">User Name</label>
          <form:input path="userName" class="form-control" id="userName"/>
        </div>
        <div class="mb-3">
          <label for="password" class="form-label">Password</label>
          <form:input path="password" type="password" class="form-control" id="password"/>
        </div>
        <input type="submit" value="Sign In"  class="btn btn-danger btn" />
<!-- 				   onclick="window.location.href='mainUser'; return false;" -->
				  
				
        <!-- <button id="login" type="submit" class="btn btn-danger">Sign In</button> -->
      </form:form>
    </div>
  </div>


  
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
    crossorigin="anonymous"></script>
<script src="../Scripts/userlogin.js"></script>
</body>
</html>