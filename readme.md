# TP Reingénierie de Code

Ce projet est un exercice de reingénierie de code qui vise à améliorer progressivement une base de code existante en appliquant différents patrons de conception.

## Exécution des tests

Pour exécuter les tests de chaque version du projet, utilisez les commandes suivantes :

```bash
# Pour tester la version 1 (base)
mvn test -Dtest=imt.fisa.reengineering.v1.CompanyTest

# Pour tester la version 2 (avec les succursales)
mvn test -Dtest=imt.fisa.reengineering.v2.CompanyTest

# Pour tester la version 3 (avec le patron Composite)
mvn test -Dtest=imt.fisa.reengineering.v3.CompanyTest

# Pour tester la version 4 (avec le patron Visiteur)
mvn test -Dtest=imt.fisa.reengineering.v4.CompanyTest
```

## Objectifs du TP

L'objectif de ce TP est d'améliorer du code existant en procédant par étapes. Il s'agit de se mettre en situation où on effectue des transformations du code (refactorisation, enrichissement, découplage, etc.) pour prendre en compte de nouveaux besoins ou faciliter son extensibilité.

## Structure du projet

Le projet est organisé en 4 versions successives, chacune représentant une étape de refactorisation :

### Version 1 : Code de base

Les classes principales :
- **Employee** : représente un employé avec son type et son salaire
- **Company** : représente une société avec sa liste d'employés
- **CompanyTest** : teste les fonctionnalités de la classe Company

Fonctionnalités de base :
- Calcul de salaires
- Comptage d'employés (total, staff, administratifs)

### Version 2 : Intégration des succursales

Améliorations apportées :
- Ajout de la notion de succursales (Subsidiary)
- Adaptation des méthodes pour inclure les données des succursales
- Factorisation du code commun entre Company et Subsidiary

### Version 3 : Application du patron Composite

Implémentation du patron Composite pour :
- Unifier l'interface des objets de la structure
- Permettre la composition récursive
- Faciliter l'extensibilité de l'architecture

Structure mise en place :
- Interface **CompanyItem**
- Sous-interface **CompanyComposite**
- Adaptation des classes existantes pour implémenter ces interfaces

![Patron Composite](https://bastienbrunel.fr/files/img/composite.png)

### Version 4 : Application du patron Visiteur

Implémentation du patron Visiteur pour :
- Permettre l'ajout de nouveaux traitements sans modifier les classes existantes
- Séparer les algorithmes des structures sur lesquelles ils opèrent

Structure mise en place :
- Interface **Visitor** avec des méthodes spécifiques à chaque type d'élément
- Méthode **accept()** dans chaque classe de la structure composite
- Implémentation des visiteurs pour chaque traitement requis

![Patron Visiteur](https://bastienbrunel.fr/files/img/visiteur.png)

## Conclusion

Grâce à l'intégration des patrons Composite et Visiteur, le code est devenu beaucoup plus extensible :
- Il est possible d'ajouter de nouveaux types d'entités dans la structure d'une société
- L'ajout de traitements sur la structure est simplifié via la création de nouveaux visiteurs

Une limitation persiste cependant : l'ajout de nouveaux types d'objets nécessite l'ajout d'une méthode visit à tous les visiteurs existants, ce qui peut limiter la facilité d'extension sans modification du code existant.