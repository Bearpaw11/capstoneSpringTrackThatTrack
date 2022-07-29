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
			<a href="${pageContext.request.contextPath}/addCollection"
				class="btn">Add record to collection</a> <a
				href="${pageContext.request.contextPath}/addWish" class="btn">Add
				record to wish list</a>
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

				<!-- loop over and print our customers -->
				<c:forEach var="tempUserRecord" items="${userRecords}">

					<!-- construct an "update" link with customer id -->
					<%-- <c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url> --%>

					<tr>
						<td>${tempUserRecord.artist}</td>
						<td>${tempUserRecord.album_title}</td>
						<td>${tempUserRecord.condition}</td>
						<td><img src="${tempUserRecord.url}" width="100" height="100"></td>

						<td>
							<!-- display the update link --> 
							
							<button type="button" class="btn btn-danger mybtn"><a class="button" href="${updateLink}">Update</a> </button>
							<button type="button" class="btn btn-danger"><a class="button" href="${updateLink}" >Delete</a></button>
							
							
						</td>

					</tr>

				</c:forEach>

			</table>







			<!-- 	<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">Artist</th>
						<th scope="col">Album Name</th>
						<th scope="col">Condition</th>
						<th scope="col">Album Picture</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Bruce Springsteen</td>
						<td>Born in the U.S.A</td>
						<td>Unopened</td>
						<td><img
							src="https://upload.wikimedia.org/wikipedia/en/3/31/BruceBorn1984.JPG"
							width="100" height="100"></td>
						<td><button type="button" class="btn btn-danger mybtn">Update</button>
							<button type="button" class="btn btn-danger">Delete</button></td>
					</tr>
					<tr>
						<td>Led Zepplin</td>
						<td>Four</td>
						<td>Used</td>
						<td><img
							src="https://upload.wikimedia.org/wikipedia/en/thumb/2/26/Led_Zeppelin_-_Led_Zeppelin_IV.jpg/220px-Led_Zeppelin_-_Led_Zeppelin_IV.jpg"
							width="100" height="100"></td>
						<td><button type="button" class="btn btn-danger mybtn">Update</button>
							<button type="button" class="btn btn-danger">Delete</button></td>
					</tr>
					<tr>
						<td>Pink Floyd</td>
						<td>Dark Side of the Moon</td>
						<td>Used</td>
						<td><img
							src="https://upload.wikimedia.org/wikipedia/en/thumb/3/3b/Dark_Side_of_the_Moon.png/220px-Dark_Side_of_the_Moon.png"
							width="100" height="100"></td>
						<td><button type="button" class="btn btn-danger mybtn">Update</button>
							<button type="button" class="btn btn-danger">Delete</button></td>
					</tr>
				</tbody>
			</table> -->
		</div>
		<h1 class="wish">My Wish List</h1>
		<div class="tableDiv2">
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">Artist</th>
						<th scope="col">Album Name</th>
						<th scope="col">Estimated price</th>
						<th scope="col">Album Picture</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Eric Clapton</td>
						<td>Unplugged</td>
						<td>$55</td>
						<td><img
							src="https://upload.wikimedia.org/wikipedia/en/9/99/Eric_Clapton_Unplugged.jpg"
							width="100" height="100"></td>
						<td><button type="button" class="btn btn-danger mybtn">Update</button>
							<button type="button" class="btn btn-danger">Delete</button></td>
					</tr>
					<tr>
						<td>Johnny Cash</td>
						<td>At Folsom Prison</td>
						<td>$35</td>
						<td><img
							src="https://upload.wikimedia.org/wikipedia/en/b/bf/Johnny_Cash_At_Folsom_Prison.jpg"
							width="100" height="100"></td>
						<td><button type="button" class="btn btn-danger mybtn">Update</button>
							<button type="button" class="btn btn-danger">Delete</button></td>
					</tr>
					<tr>
						<td>The Beatles</td>
						<td>White Album</td>
						<td>$60</td>
						<td><img
							src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/TheBeatles68LP.jpg/440px-TheBeatles68LP.jpg"
							width="100" height="100"></td>
						<td><button type="button" class="btn btn-danger mybtn">Update</button>
							<button type="button" class="btn btn-danger">Delete</button></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>
</body>
</html>