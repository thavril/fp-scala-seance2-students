# Séance 2 - Collections immuables et Fonctions d'Ordre Supérieur

## 📚 Objectifs d'apprentissage

- Manipuler les collections immuables (List, Map, Set)
- Maîtriser les fonctions d'ordre supérieur : map, flatMap, filter, fold, reduce, groupBy
- Comprendre la composition de fonctions
- Utiliser les fonctions anonymes et la curryification
- Construire un mini-projet : Système de Gestion de Bibliothèque

## 🚀 Mise en route

### Prérequis

- Java JDK 11 ou supérieur
- SBT (Scala Build Tool) installé
- Avoir complété la Séance 1 (recommandé)

### Installation

1. Clonez ou téléchargez ce projet
2. Ouvrez un terminal dans le dossier du projet
3. Lancez SBT avec la commande :
   ```bash
   sbt
   ```

### Commandes utiles

Dans le terminal SBT :

- `compile` - Compile le code
- `test` - Lance tous les tests
- `testOnly seance2.ExercicesSpec` - Lance uniquement les tests des exercices
- `console` - Ouvre le REPL Scala pour tester du code interactivement
- `~test` - Mode watch : relance les tests automatiquement à chaque modification

Ou utilisez le script fourni :
```bash
./verifier.sh
```

## 📝 Structure du projet

```
seance-2/
├── src/
│   ├── main/scala/
│   │   └── Exercices.scala    # ⚠️ Fichier à compléter (vos solutions)
│   └── test/scala/
│       └── ExercicesSpec.scala # 🧪 Tests pour valider vos solutions
├── build.sbt                   # Configuration du projet
└── README.md                   # Ce fichier
```

## 🎯 Instructions pour les exercices

### Étape 1 : Comprendre les exercices

Ouvrez le fichier `src/main/scala/Exercices.scala` et lisez attentivement :
- Les commentaires expliquant chaque exercice
- Les signatures de fonctions (types d'entrée et de sortie)
- Les exemples fournis

### Étape 2 : Compléter les fonctions

Remplacez les `???` par votre code. 

**Règles importantes :**
- ❌ N'utilisez PAS `var` (variables mutables)
- ✅ Utilisez uniquement `val` (valeurs immutables)
- ✅ Privilégiez les fonctions pures (sans effets de bord)
- ❌ Pas de `println` dans vos fonctions (sauf si explicitement demandé)
- ✅ Utilisez les fonctions d'ordre supérieur (map, filter, etc.)

### Étape 3 : Tester votre code

Lancez les tests avec :
```bash
sbt test
# ou
./verifier.sh
```

Les tests vous indiqueront :
- ✅ Les exercices réussis (en vert)
- ❌ Les exercices à corriger (en rouge avec détails)

### Étape 4 : Itérer

- Corrigez les erreurs
- Relancez les tests
- Répétez jusqu'à ce que tous les tests passent ! 🎉

## 📖 Organisation des exercices

### Partie 1 : Collections de Base - List (4 exercices)
**Concepts :** Création, taille, head, contains

**Exercices :**
- `creerListe` : Créer une liste
- `tailleListe` : Obtenir la taille
- `premierElement` : Premier élément avec Option
- `contient` : Vérifier la présence d'un élément

### Partie 2 : map et filter (4 exercices)
**Concepts :** Transformation, filtrage, composition

**Exercices :**
- `doubler` : Transformer avec map
- `nombresEnChaines` : Conversion de types
- `filtrerPairs` : Filtrage
- `doublerPairs` : Composition map + filter

### Partie 3 : flatMap et for-comprehensions (3 exercices)
**Concepts :** Aplatissement, cartesian product

**Exercices :**
- `aplatir` : Flatten une liste de listes
- `dupliquer` : flatMap pour dupliquer
- `genererPaires` : for-comprehension

### Partie 4 : fold et reduce (4 exercices)
**Concepts :** Agrégation, réduction

**Exercices :**
- `somme` : Somme avec foldLeft
- `produit` : Produit avec foldLeft
- `concatener` : Concaténation avec foldLeft
- `maximum` : Maximum avec reduceOption

### Partie 5 : Opérations avancées (4 exercices)
**Concepts :** groupBy, sortBy, distinct

**Exercices :**
- `grouperParParite` : Groupement
- `compterOccurrences` : Comptage avec groupBy
- `trierParLongueur` : Tri personnalisé
- `eliminerDoublons` : Dédoublonnage

### Partie 6 : Mini-Projet - Système de Gestion de Bibliothèque (10 exercices)
**Objectif :** Construire un système complet de gestion de bibliothèque

**Types utilisés :**
- `Livre` : Tuple (titre, auteur, année, catégorie)
- `Emprunt` : Tuple (titre, emprunteur, estRendu)

**Exercices progressifs :**
1. `creerLivre` : Créer un livre
2. `extraireTitres` : Extraire les titres
3. `filtrerParCategorie` : Filtrer par catégorie
4. `filtrerParAuteur` : Filtrer par auteur
5. `livresRecents` : Filtrer par année
6. `compterParCategorie` : Statistiques par catégorie
7. `grouperParAuteur` : Grouper par auteur
8. `livresNonRendus` : Gérer les emprunts
9. `livresParEmprunteur` : Historique d'emprunts
10. `statistiquesBibliotheque` : Statistiques globales

### BONUS : Exercices Avancés (3 exercices optionnels)
Pour aller plus loin :
- `rechercherLivres` : Recherche multi-critères
- `recommander` : Système de recommandation
- `emprunteurLePlusActif` : Analyse des emprunts

---

## 💡 Astuces

### Utiliser le REPL
Le REPL (Read-Eval-Print Loop) est excellent pour tester des idées :
```bash
sbt console
```

Puis testez vos expressions :
```scala
scala> val liste = List(1, 2, 3, 4, 5)
scala> liste.map(_ * 2)
// res0: List[Int] = List(2, 4, 6, 8, 10)

scala> liste.filter(_ % 2 == 0)
// res1: List[Int] = List(2, 4)

scala> liste.map(_ * 2).filter(_ > 5)
// res2: List[Int] = List(6, 8, 10)
```

### Syntaxes Importantes

**map - Transformation :**
```scala
val nombres = List(1, 2, 3)
nombres.map(x => x * 2)           // List(2, 4, 6)
nombres.map(_ * 2)                 // Syntaxe courte
nombres.map(_.toString)            // List("1", "2", "3")
```

**filter - Filtrage :**
```scala
val nombres = List(1, 2, 3, 4, 5)
nombres.filter(x => x % 2 == 0)   // List(2, 4)
nombres.filter(_ > 2)              // List(3, 4, 5)
```

**flatMap - Aplatissement :**
```scala
val listes = List(List(1, 2), List(3, 4))
listes.flatten                     // List(1, 2, 3, 4)

val nombres = List(1, 2, 3)
nombres.flatMap(x => List(x, x))   // List(1, 1, 2, 2, 3, 3)
```

**for-comprehension :**
```scala
// Équivalent à flatMap + map
for {
  i <- List(1, 2, 3)
  j <- List("a", "b")
} yield (i, j)
// List((1, "a"), (1, "b"), (2, "a"), (2, "b"), (3, "a"), (3, "b"))
```

**foldLeft - Agrégation :**
```scala
val nombres = List(1, 2, 3, 4)
nombres.foldLeft(0)(_ + _)         // 10 (somme)
nombres.foldLeft(1)(_ * _)         // 24 (produit)

// Forme explicite :
nombres.foldLeft(0)((acc, x) => acc + x)
```

**groupBy - Groupement :**
```scala
val nombres = List(1, 2, 3, 4, 5)
nombres.groupBy(_ % 2 == 0)
// Map(false -> List(1, 3, 5), true -> List(2, 4))

val mots = List("a", "ab", "abc", "abcd")
mots.groupBy(_.length)
// Map(1 -> List("a"), 2 -> List("ab"), 3 -> List("abc"), 4 -> List("abcd"))
```

### Concepts Clés

#### Fonctions d'Ordre Supérieur
Une fonction d'ordre supérieur est une fonction qui :
- Prend une ou plusieurs fonctions en paramètre
- Retourne une fonction

```scala
// map est une fonction d'ordre supérieur
def map[A, B](liste: List[A], f: A => B): List[B]

// Exemple d'utilisation
val double = (x: Int) => x * 2
List(1, 2, 3).map(double)  // List(2, 4, 6)
```

#### Fonctions Anonymes
```scala
// Forme complète
List(1, 2, 3).map(x => x * 2)

// Forme courte avec underscore
List(1, 2, 3).map(_ * 2)

// Avec plusieurs paramètres
List(1, 2, 3).foldLeft(0)((acc, x) => acc + x)
List(1, 2, 3).foldLeft(0)(_ + _)
```

#### Composition de Fonctions
```scala
val nombres = List(1, 2, 3, 4, 5, 6)

// Chaînage d'opérations
nombres
  .filter(_ % 2 == 0)    // List(2, 4, 6)
  .map(_ * 3)            // List(6, 12, 18)
  .map(_.toString)       // List("6", "12", "18")
```

#### Option pour gérer l'absence de valeur
```scala
val liste = List(1, 2, 3)
liste.headOption           // Some(1)

val vide = List()
vide.headOption            // None

// Pattern matching sur Option
liste.headOption match {
  case Some(x) => s"Premier: $x"
  case None => "Liste vide"
}
```

#### Immutabilité des Collections
```scala
val liste = List(1, 2, 3)
val nouvelle = liste.map(_ * 2)  // Nouvelle liste : List(2, 4, 6)
// liste reste inchangée : List(1, 2, 3)
```

## 🎓 Progression Suggérée

### Pour Débutants (2-3h)
1. Partie 1 (Collections de base)
2. Partie 2 (map et filter)
3. Partie 4 (fold et reduce - exercices simples)

### Pour Niveau Intermédiaire (3-4h)
Tout ce qui précède, plus :
- Partie 3 (flatMap)
- Partie 5 (Opérations avancées)
- Partie 6 (Mini-projet exercices 6.1 à 6.6)

### Pour Niveau Avancé (4-5h)
Tout, y compris :
- Partie 6 complète (Mini-projet)
- Exercices BONUS

## 📊 Validation

Votre objectif : **faire passer tous les tests** ! 

Lorsque vous verrez ceci, vous aurez réussi :
```
[info] ExercicesSpec:
[info] - 1.1 - creerListe: crée une liste de 1 à 5 ✓
[info] - 1.2 - tailleListe: retourne la taille d'une liste ✓
[info] ... (tous les tests) ✓
[info] All tests passed
```

## 🎯 Le Mini-Projet : Système de Gestion de Bibliothèque

Le point culminant de cette séance est la **Partie 6**, où vous construirez progressivement un système de gestion de bibliothèque.

### Architecture

```
Livre = (String, String, Int, String)
  ↓
Emprunt = (String, String, Boolean)
  ↓
Fonctions:
  - Créer et gérer des livres
  - Filtrer par catégorie, auteur, année
  - Calculer des statistiques
  - Gérer les emprunts
  - Recommander des livres
```

### Exemple d'Utilisation

```scala
// Créer une bibliothèque
val livres = List(
  ("1984", "George Orwell", 1949, "Fiction"),
  ("Sapiens", "Yuval Harari", 2011, "Histoire"),
  ("Dune", "Frank Herbert", 1965, "Science-Fiction")
)

// Filtrer par catégorie
val fiction = filtrerParCategorie(livres, "Fiction")

// Compter par catégorie
val stats = compterParCategorie(livres)
// Map("Fiction" -> 1, "Histoire" -> 1, "Science-Fiction" -> 1)

// Livres récents
val recents = livresRecents(livres, 2000)
// List(("Sapiens", "Yuval Harari", 2011, "Histoire"))
```

Ce mini-projet démontre :
- ✅ Manipulation intensive de collections
- ✅ Utilisation de map, filter, groupBy
- ✅ Composition de fonctions
- ✅ Pattern matching sur tuples
- ✅ Gestion de l'Option
- ✅ Immutabilité totale

## 🤝 Besoin d'aide ?

- Relisez les commentaires dans `Exercices.scala`
- Consultez les exemples dans la section "Astuces"
- Utilisez le REPL pour expérimenter : `sbt console`
- Lisez les messages d'erreur attentivement
- N'hésitez pas à demander de l'aide à votre enseignant

### Erreurs Courantes

**"not found: value ???"**
→ Vous n'avez pas encore remplacé le `???` par votre code

**"value map is not a member of..."**
→ Vérifiez que vous travaillez bien avec une collection (List, etc.)

**"missing parameter type"**
→ Parfois Scala a besoin du type explicite : `(x: Int) => x * 2`

**"type mismatch"**
→ Vérifiez que votre fonction retourne le bon type

**"reduceLeftOption on empty: List"**
→ Utilisez `reduceOption` ou `foldLeft` avec une valeur initiale

## 📚 Ressources

- [Documentation officielle Scala 3](https://docs.scala-lang.org/scala3/)
- [Collections Scala](https://docs.scala-lang.org/overviews/collections-2.13/introduction.html)
- [Tour de Scala - Collections](https://docs.scala-lang.org/tour/unified-types.html)
- [Scala Exercises](https://www.scala-exercises.org/)

## 🎉 Bon courage !

Amusez-vous bien avec les collections et les fonctions d'ordre supérieur ! 🚀

---

*Ce projet a été créé pour la Séance 2 du cours de Programmation Fonctionnelle avec Scala.*




















