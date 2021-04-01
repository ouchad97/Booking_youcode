<%@include file="include/taglibs.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formm" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<%@include file="include/head.jsp"%>

<body>

	<form:form class="form-signin" method="post" action="create"
		modelAttribute="utilisateur"  >
		
		<div class="text-center mb-4">

			 <div class="text-center mb-4">
      <img class="mb-4 logo"  alt="logo" width="100" height="100" src="resources/images/logo.png"  >
       				 
      </div>
			<h1 class="h3 mb-3 font-weight-normal">Réservation YCD</h1>
			
			 <p>Une plateforme de gestion simple et performante,vous permet de gérer vos offres d'acces a l'etablissement.</p>
			
		</div>
		<div class="row">
			<div class="col-md-6 mb-3">
				<label for="firstName">Nom</label>
				<form:input class="form-control" path="nomUtilisateur" />

			</div>
			<div class="col-md-6 mb-3">
				<label for="lastName">Prénom</label>
				<form:input class="form-control" path="prenomUtilisateur" />

			</div>
		</div>


		<div class="form-label-group">
			<label for="firstName">Tel</label> <br /> <br />
			<form:input type="text" class="form-control" path="TelUtilisateur" />

		</div>

		<div class="form-label-group">
			<label for="inputEmail">Email address</label> <br /> <br />
			<form:input type="email"   class="form-control"
				path="emailUtilisateur" />

		</div>

		<div class="form-label-group">
			<label for="inputPassword">Password</label> <br /> <br />
			<form:input type="password"  class="form-control"
				path="mdpsUtilisateur" />
		</div>
			<form:input type="hidden" class="form-control" path="roleUtilisateur"  value="Apprenant"/>
			<form:input type="hidden" class="form-control" path="validationCompte" value="false"/>
	
	<div class="checkbox mb-3">
			<label><a class="linkInsc"
				href="<%=request.getContextPath()%>">Connexion</a></label>
		</div>
			<button class="btn btn-lg btn-info btn-block btnLogin btninscr"
				 
				type="submit">Inscrit</button>
			 
 	</form:form>

</body>
</html>