<%@include file="include/taglibs.jsp"%>

<!DOCTYPE html>
<html lang="en">
<%@include file="include/head.jsp"%>
<style>
body {
	background-color: #ebeef4;
}

.nav-tabs {
	border-bottom: 1px solid #c9d2e3;
}

.profile .profile-header {
	position: relative;
}

.profile .profile-header .profile-header-cover {
	background: url(https://bootdey.com/img/Content/bg1.jpg);
	background-size: cover;
	background-position: center;
	background-repeat: no-repeat;
	height: 10.625rem;
	position: relative;
}

@media ( max-width : 991.98px) {
	.profile .profile-header .profile-header-cover {
		height: 6.25rem;
	}
}

.profile .profile-header .profile-header-cover:before {
	content: "";
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
	background: rgba(33, 40, 55, 0.35);
}

.profile .profile-header .profile-header-content {
	position: relative;
	padding: 0 50px;
	display: -webkit-box;
	display: -ms-flexbox;
	display: flex;
	-ms-flex-align: flex-end;
	align-items: flex-end;
}

@media ( max-width : 991.98px) {
	.profile .profile-header .profile-header-content {
		display: block;
		padding: 0 20px;
	}
}

.profile .profile-header .profile-header-content .profile-header-img {
	width: 12.5rem;
	height: 12.5rem;
	overflow: hidden;
	z-index: 10;
	margin-top: -8.75rem;
	padding: 0.1875rem;
	background: #fff;
	-webkit-border-radius: 9px;
	border-radius: 9px;
}

@media ( max-width : 991.98px) {
	.profile .profile-header .profile-header-content .profile-header-img {
		width: 4.375rem;
		height: 4.375rem;
		margin: -3.75rem 0 0;
	}
}

.profile .profile-header .profile-header-content .profile-header-img img
	{
	max-width: 100%;
	width: 100%;
	-webkit-border-radius: 6px;
	border-radius: 6px;
}

.profile .profile-header .profile-header-content .profile-header-tab {
	position: relative;
	margin-left: 50px;
	-webkit-box-flex: 1;
	-ms-flex: 1;
	flex: 1;
}

@media ( max-width : 991.98px) {
	.profile .profile-header .profile-header-content .profile-header-tab {
		margin: -0.625rem -20px 0;
		padding: 0 20px;
		overflow: scroll;
		display: -webkit-box;
		display: -ms-flexbox;
		display: flex;
		-ms-flex-wrap: nowrap;
		flex-wrap: nowrap;
	}
}

.profile .profile-header .profile-header-content .profile-header-tab .nav-item .nav-link
	{
	padding: 0.8125rem 0.625rem 0.5625rem;
	text-align: center;
}

@media ( max-width : 991.98px) {
	.profile .profile-header .profile-header-content .profile-header-tab .nav-item .nav-link
		{
		padding: 0.9375rem 0.625rem 0.3125rem;
	}
}

.profile .profile-header .profile-header-content .profile-header-tab .nav-item .nav-link .nav-field
	{
	font-weight: 600;
	font-size: 0.8125rem;
}

@media ( max-width : 991.98px) {
	.profile .profile-header .profile-header-content .profile-header-tab .nav-item .nav-link .nav-field
		{
		font-size: 0.6875rem;
		margin-bottom: -0.125rem;
	}
}

.profile .profile-header .profile-header-content .profile-header-tab .nav-item .nav-link .nav-value
	{
	font-size: 1.25rem;
	font-weight: 400;
	letter-spacing: -0.5px;
}

@media ( max-width : 991.98px) {
	.profile .profile-header .profile-header-content .profile-header-tab .nav-item .nav-link .nav-value
		{
		font-size: 1.125rem;
	}
}

.profile .profile-header .profile-header-content .profile-header-tab .nav-item .nav-link.active
	{
	color: #212837;
	border-color: #212837;
}

@media ( max-width : 991.98px) {
	.profile .profile-header .profile-header-content .profile-header-tab .nav-item .nav-link.active
		{
		background: 0 0;
	}
}

.profile .profile-header .profile-header-content .profile-header-tab .nav-item+.nav-item
	{
	margin-left: 0.9375rem;
}

.profile .profile-container {
	padding: 30px 50px;
	display: -webkit-box;
	display: -ms-flexbox;
	display: flex;
}

@media ( max-width : 991.98px) {
	.profile .profile-container {
		padding: 20px 20px;
	}
}

.profile .profile-container .profile-sidebar {
	width: 13.75rem;
}

@media ( max-width : 991.98px) {
	.profile .profile-container .profile-sidebar {
		display: none;
	}
}

.profile .profile-container .profile-content {
	padding-left: 30px;
	-webkit-box-flex: 1;
	-ms-flex: 1;
	flex: 1;
}

@media ( max-width : 991.98px) {
	.profile .profile-container .profile-content {
		padding-left: 0;
	}
}

.profile .profile-img-list {
	list-style-type: none;
	margin: -0.0625rem -1.3125rem;
	padding: 0;
}

.profile .profile-img-list:after, .profile .profile-img-list:before {
	content: "";
	display: table;
	clear: both;
}

.profile .profile-img-list .profile-img-list-item {
	float: left;
	width: 25%;
	padding: 0.0625rem;
}

.profile .profile-img-list .profile-img-list-item.main {
	width: 50%;
}

.profile .profile-img-list .profile-img-list-item .profile-img-list-link
	{
	display: block;
	padding-top: 75%;
	overflow: hidden;
	position: relative;
}

.profile .profile-img-list .profile-img-list-item .profile-img-list-link .profile-img-content,
	.profile .profile-img-list .profile-img-list-item .profile-img-list-link img
	{
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
	max-width: 100%;
	background-size: cover;
	background-position: center;
	background-repeat: no-repeat;
}

.profile .profile-img-list .profile-img-list-item .profile-img-list-link .profile-img-content:before,
	.profile .profile-img-list .profile-img-list-item .profile-img-list-link img:before
	{
	content: "";
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
	border: 1px solid rgba(60, 78, 113, 0.15);
}

.profile .profile-img-list .profile-img-list-item.with-number .profile-img-number
	{
	position: absolute;
	top: 50%;
	left: 0;
	right: 0;
	color: #fff;
	font-size: 1.625rem;
	font-weight: 500;
	line-height: 1.625rem;
	margin-top: -0.8125rem;
	text-align: center;
}
</style>

<%
		//In case, if Editor session is not set, redirect to Login page
	if ((request.getSession(false).getAttribute("Apprenant") == null)) {
	%>
	<jsp:forward page="login.jsp"></jsp:forward> 
	<%
		}
	%>
<body>



	<div class="container">
		<div class="profile">
			<div class="profile-header">
				<div class="profile-header-cover"></div>
				<div class="profile-header-content">
					<div class="profile-header-img">
						<img src="https://bootdey.com/img/Content/avatar/avatar7.png"
							alt="" />
					</div>
					<ul class="profile-header-tab nav nav-tabs nav-tabs-v2">
						<li class="nav-item"><a href="offreliste" id="Offres"
							class="nav-link active" data-toggle="tab">
								<div class="nav-field">Liste des offres disponibles</div>
								<div class="nav-value">.</div>
						</a></li>
						 
						 
					 

					</ul>
				</div>
			</div>

			<div class="profile-container">
				<div class="profile-sidebar">
					<div class="desktop-sticky-top">
						<h4>John Smith</h4>
						<div class="font-weight-600 mb-3 text-muted mt-n2">@johnsmith</div>
						<p>Apprenant Youcode Safi</p>

						
							<form class="form-signin" action="logout" method="post">

							<div class="button mt-2 d-flex flex-row align-items-center">
 							<button class="btn btn-sm btn-danger w-100"
								type="submit">Deconnexion</button> 
 							</div>
							
						</form>

					</div>
				</div>


				<!-- liste d'offres -->
				<div class="profile-content  ">
				




				<c:forEach items="${offreliste}" var="offres">
			
 						<div class="card p-3">
							<div class="d-flex align-items-center">
								<div class="spinner-grow text-primary" role="status">
									<span class="sr-only">Loading...</span>
								</div>
								<div class="ml-3 w-100">
									<h4 class="mb-0 mt-0">Offre</h4>
									<span>Offre d'acces a YouCode Safi</span>
									<div
										class="p-2 mt-2 bg-info d-flex justify-content-between rounded text-white stats">
										<div class="d-flex flex-column">
											<span class="articles">Date debut</span> 
											<span class="number1"><c:out value="${offres.dateDebut}" /></span>
										</div>
										<div class="d-flex flex-column">
											<span class="followers">Date fin</span> <span
												class="number2"><c:out value="${offres.dateFin}" /></span>
										</div>
										<div class="d-flex flex-column">
											<span class="rating">Nombre d'apprenant</span> 
											<span class="number3"><c:out value="${offres.nombreApprenant}" /></span>
										</div>
										<div class="d-flex flex-column">
											<span class="rating">Description</span> 
											<span class="number3"><c:out value="${offres.description}" /></span>
										</div>
									</div>
									<div class="button mt-2 d-flex flex-row align-items-center"> 
										<a class="btn btn-sm btn-success w-50 "   href="<c:url value='#'/> ">R?server</a> 
 									</div>
								</div>
							</div>
						</div>
						
						
                 <br/>
						
 						</c:forEach>
					
					
					
					
					
					
					
				</div>

			</div>
		</div>

	</div>

</body>


</html>