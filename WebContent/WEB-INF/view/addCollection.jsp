<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Add to collection</title>
  <link rel="icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon"> 
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon">
  <link rel="preconnect" href="https://fonts.gstatic.com" />
   <link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/addCollection.css">
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
            <a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/mainUser">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}">Logout</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <div class="pageBackground">
    <img class="pageImg"src="${pageContext.request.contextPath}/resources/images/TrackThat.png" alt="logo" width="300" height="300">
    <div class="formCard">
      <h1>Add Record to collection</h1>
      <form:form action="saveUserRecord" modelAttribute="userRecord" method="Post" id="userRecord">

			<!-- need to associate this data with record id -->
<%-- 			<form:hidden path="id" /> --%>
					
			
        <div class="mb-3">
          <label for="artist" class="form-label">Artist</label>
          <form:input path="artist" class="form-control" id="artist"/>
        </div>
        <div class="mb-3">
          <label for="album_title" class="form-label">Album Name</label>
          <form:input path="album_title" class="form-control" id="album_title"/>
        </div>
        <div class="mb-3">
          <label for="condition" class="form-label">Album Condition</label>
          <br>
          <form:select path="condition" name ="Condition" id="Condition"> 
              <option value ="Used">Used</option>
              <option value ="Unopened"> Unopened</option>
              <option value ="New">New</option>
           </form:select>
        </div>
        <div class="mb-3">
          <label for="url" class="form-label">Album cover URL</label>
          <form:input path="url" class="form-control" id="url"/>
        </div>
        <input type="submit" value="Save" class="btn btn-danger" />
      </form:form>
    </div>
  </div>
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
    crossorigin="anonymous"></script>
</body>
</html>