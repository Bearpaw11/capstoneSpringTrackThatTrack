<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Home</title>
<link rel="icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon">
<link rel="shortcut icon"href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon">
<link rel="preconnect" href="https://fonts.gstatic.com" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/mainUser.css">
</head>
<body>
	<nav class="navbar navbar-expand-sm navClass">
		<div class="container-fluid">
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon "></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" aria-current="page"
						href="logout">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="pageBackground">
		<h1 class="welcome">Welcome, ${loggedInUser.userName}!</h1>
		<h3 class="greeting">What would you like to do today?</h3>
		<div class="buttonDiv">
			<input type="button" value="Add record to collection"
				   onclick="window.location.href='addCollection'; return false;"
				   class="add-button"
			/>
			<input type="button" value="Add record to wish list"
				   onclick="window.location.href='addWish'; return false;"
				   class="add-button"
			/>
		</div>
		
		<h1 class="current">Current Collection</h1>
		
		<div class="CardDiv">
        <%-- This Section creates a card for ever record in the user record collection--%>
			<c:forEach var="tempUserRecord" items="${userRecords}">
				
				<c:url var="updateLink" value="/showFormForUpdate"><c:param name="recordId" value="${tempUserRecord.id}" /></c:url>			
				<c:url var="deleteLink" value="/deleteRecord"><c:param name="userRecordId" value="${tempUserRecord.id}" /></c:url>	
				<%--This section defines the card info --%>
				<div class="card cardStyle" style="width: 22rem;">
  					<img src="${tempUserRecord.url}" class="card-img-top" alt="Record Img">
 					 <div class="card-body">
    					<h6 class="card-title cardInfo"><span class="title">Artist:</span> ${tempUserRecord.artist} </h6>
    					<h6 class="card-title cardInfo"><span class="title">Album Title:</span> ${tempUserRecord.album_title} </h6>
   						<h6 class="card-title cardInfo"><span class="title">Album Condition:</span> ${tempUserRecord.conditions} </h6>
    					<button type="button" class="btn btn-danger mybtn"><a class="button" href="${updateLink}">Update</a> </button>
						<button type="button" class="btn btn-danger mybtn2"><a class="button" href="${deleteLink}" >Delete</a></button>	
 					 </div>
				</div>
			</c:forEach>
		</div>
		
		<h1 class="wish">My Wish List</h1>
		<div class="CardDiv">
		 <%-- This Section creates a card for ever record in the user wish list--%>
			<c:forEach var="tempUserWishRecord" items="${userWishRecords}">
			
				<c:url var="updateWishLink" value="/showFormForWishUpdate"><c:param name="recordId" value="${tempUserWishRecord.id}" /></c:url>		
				<c:url var="deleteWishLink" value="/deleteWishRecord"><c:param name="userWishRecordId" value="${tempUserWishRecord.id}" /></c:url>
				<%--This section defines the card info --%>
				<div class="card cardStyle" style="width: 22rem;">
  					<img src="${tempUserWishRecord.url}" class="card-img-top" alt="Record img">
 					 <div class="card-body">
    					<h6 class="card-title cardInfo"><span class="title">Artist:</span> ${tempUserWishRecord.artist} </h6>
    					<h6 class="card-title cardInfo"><span class="title">Album Title:</span> ${tempUserWishRecord.album_title} </h6>
   						<h6 class="card-title cardInfo"><span class="title">Expected Price:</span> ${tempUserWishRecord.price}$ </h6>
    					<button type="button" class="btn btn-danger mybtn"><a class="button" href="${updateWishLink}">Update</a> </button>
						<button type="button" class="btn btn-danger mybtn2"><a class="button" href="${deleteWishLink}" >Delete</a></button>	
 					 </div>
				</div>		
			</c:forEach>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>
</body>
</html>