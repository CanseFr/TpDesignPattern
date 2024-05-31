## Problematique:

Vous avez plusieurs types d'étudiants : Le bon, le mauvais, le moyen. Chaque étudiant peut avoir un comportement sur la journée de cours : Rêvasser, Attentionné, Questionneur, Dormeur, Absent.
Vous devez faire en sorte de pouvoir composer entre n'importe quel type d'étudiant et n'importe quel comportement directement à la compilation. Donc il peut y avoir un étudiant fort qui rêvasse, un étudiant moyen qui dort, un étudiant mauvais qui questionne, etc... Tout ça sans multiplier les classes. (Attention, on parle d'ajout de comportement, ne vous trompez pas de pattern)

## Design Pattern correspondant :

- Strategy

## Raison : 

Cette solution utilise le pattern Strategy pour composer différents type d'étudiants avec différents comportements de maniere flexible et dynamique.
Il permet de definir une famille d'algorithme, de les encapsuler chacun dans une class séparé et de les rendre interchangeable. Permet aussi d'ajouter des comportements dynamiquement sans multiplier les class, en les composant avec différents types d'étudiant.