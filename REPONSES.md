# REPONSES

## Question Ex1

Une méthode `default` dans une interface ne peut pas accéder aux champs privés de la classe qui l'implémente. `isDefective()` dans `Qualifiable` ne lit pas directement le champ `qualityScore` de `Duck` car elle ne peut pas. Elle passe par `getQualityScore()`. C'est le principe de l'encapsulation.

## Question Ex2

`Machine` est un objet qui a besoin d'attributs instanciés et on ne peut pas en instancier dans une interface.

On choisit une interface quand on veut définir un contrat comportemental  avec les classes qui l'implémentent. On choisit une classe abstraite quand on veut partager du code et de l'état commun entre des classes d'une même famille, tout en forçant l'implémentation de certaines méthodes dans les sous-classes.

