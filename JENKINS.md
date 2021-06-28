Pour déployer ce projet, utilisez JENKINS

Configuration
 
-> Ajouter un nouvel élément 
-> choisissez le nom de l'élément 
-> sélectionnez le projet Maven 
-> sélectionnez Git comme gestion du code source 
-> ajoutez l'URL du référentiel et le nom de la branche 
-> tapez Clean project as Goals in Build 
-> sélectionnez Deploy war/ear in post build action 
-> tapez **/*.war 
-> sélectionnez la version de Tomcat 
-> et ajoutez les informations d'identification 
-> et n'oubliez pas d'ajouter l'URL de Tomcat
-> Cliquez sur enregistrer, nous avons maintenant un élément dans le tableau de bord

-> Sélectionnez votre élément et exécutez Tomcat avant de cliquer sur Build now
Build now.
