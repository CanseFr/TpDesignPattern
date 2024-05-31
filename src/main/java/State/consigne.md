## Problematique:

Gestion du status d'une commande MacDo (drive) :
- En attente de prise en compte de commande
- Commande prise en compte
- Commande payée
- Commande non payée
- Commande préparée
- Commande livrée
- Commande terminée
==> A vous de définir les actions (avancer au prochain guichet, paiement, etc...) qui permettent de passer d'un état à l'autre. N'hésitez pas à réaliser un diagramme UML (diagramme états-transitions) adapté pour vous assurer que votre flow est cohérent par rapport à votre implémentation.

## Design Pattern correspondant :

- State

## Raison : 

Le pattern State permet à un objet de changer son comportement lorsque son état change.