## Problematique:

Une station météo donne le temps qu'il fait "Pluie", "Beau temps", "Neige", "Chaleur extrême", ... Plusieurs appareils différents doivent communiquer avec la station météo afin de pouvoir afficher le temps qu'il fait sur leur écran :
- Téléphone
- Ordinateur portable
- Tablette
- Voiture  
Chaque changement de météo doit être pris en compte pour tous les appareils et s'afficher sur l'appareil.

## Design Pattern correspondant :

- Observer

## Raison : 

Le pattern Observer est ideal pour les situations ou l'objet change d'état ou il est nécessaire de notifier plusieurs autres objets d'un changement.