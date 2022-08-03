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
						href="${pageContext.request.contextPath}">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="pageBackground">
		<h1 class="welcome">Welcome, ILuvRecords!</h1>
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
		<div class="tableDiv">
			<table class="table table-striped">
				<tr>
					<th>Artist</th>
					<th>Album Title</th>
					<th>Condition</th>
					<th>Album Cover</th>
				</tr>
				<!-- loop over and print our records -->
				<c:forEach var="tempUserRecord" items="${userRecords}">
					<tr>
						<td>${tempUserRecord.artist}</td>
						<td>${tempUserRecord.album_title}</td>
						<td>${tempUserRecord.condition}</td>
						<td><img src="${tempUserRecord.url}" width="100" height="100"></td>
						<td>
							<!-- display the update and delete --> 
							<button type="button" class="btn btn-danger mybtn"><a class="button" href="${updateLink}">Update</a> </button>
							<button type="button" class="btn btn-danger"><a class="button" href="${deleteLink}" >Delete</a></button>	
						</td>
					</tr>

				</c:forEach>
			</table>
		</div>
		
		<h1 class="wish">My Wish List</h1>
		<div class="tableDiv2">
			<table class="table table-striped">
					<tr>
						<th scope="col">Artist</th>
						<th scope="col">Album Title</th>
						<th scope="col">Estimated price</th>
						<th scope="col">Album Cover</th>
					</tr>
			<c:forEach var="tempUserWishRecord" items="${userWishRecords}">
					<tr>
						<td>${tempUserWishRecord.artist}</td>
						<td>${tempUserWishRecord.album_title}</td>
						<td>${tempUserWishRecord.price}$</td>
						<td><img src="${tempUserWishRecord.url}" width="100" height="100"></td>
						<td>
							<!-- display the update and delete --> 
							<button type="button" class="btn btn-danger mybtn"><a class="button" href="${updateLink}">Update</a> </button>
							<button type="button" class="btn btn-danger"><a class="button" href="${deleteLink}" >Delete</a></button>	
						</td>
					</tr>

				</c:forEach>
				
			
			</table>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>
</body>
</html>