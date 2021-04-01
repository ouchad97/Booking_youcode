<%@include file="./include/taglibs.jsp"%>

<!DOCTYPE html>
<html lang="en">
<%@include file="./include/head.jsp"%>

<body>

	<form class="form-signin" action="login" method="post">
		<div class="text-center mb-4">

			 <div class="text-center mb-4">
      <img class="mb-4 logo"  alt="logo" width="100" height="100" src="resources/images/logo.png"  >
       				 
      </div>
			<h1 class="h3 mb-3 font-weight-normal">Réservation YCD</h1>
			
			 <p>Une plateforme de gestion simple et performante,vous permet de gérer vos offres d'acces a l'etablissement.</p>
			
		</div>

		<div class="form-label-group">
			<input type="email" id="inputEmail" class="form-control"
				name="emailUtilisateur" placeholder="Email address" required
				autofocus>

		</div>

		<div class="form-label-group">
			<input type="password" id="inputPassword" class="form-control"
				name="mdpsUtilisateur" placeholder="Password" required>

		</div>

		<div class="checkbox mb-3">
			<label><a class="linkInsc"
				href="inscription">Inscription</a></label>
		</div>
		<button class="btn btn-lg btn-info btn-block btnLogin"
			type="submit"  >Connexion</button>
		<p class="mt-5 mb-3 text-muted text-center">&copy; 2021</p>
	</form>
</body>
</html>