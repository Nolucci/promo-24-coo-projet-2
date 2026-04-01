# REPONSES

## Question Ex1

Une méthode `default` dans une interface ne peut pas accéder aux champs privés de la classe qui l'implémente. `isDefective()` dans `Qualifiable` ne lit pas directement le champ `qualityScore` de `Duck` car elle ne peut pas. Elle passe par `getQualityScore()`. C'est le principe de l'encapsulation.
