## Problematique:

- Gestion de la présence d'une et une seule responsable de promotion, cette responsable de promotion reste le même objet toute la durée de vie de l'application. Il doit tout de même être possible de modifier le nom de la responsable sans instancier un nouvel objet.

## Design Pattern correspondant :

- Singleton

## Raison : 

- S'assurer qu'il n'y a qu'une seule instance de responsable de promotion tout au long de la durée de vie de l'application, tout en permettant la modification des informations de la responsable.