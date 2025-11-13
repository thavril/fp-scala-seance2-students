package seance2

/**
 * Séance 2 - Collections immuables et Fonctions d'Ordre Supérieur
 * 
 * Objectifs :
 * - Manipuler les collections immuables (List, Map, Set)
 * - Maîtriser map, flatMap, filter, fold, reduce, groupBy
 * - Composer des fonctions
 * - Construire un mini-projet : Système de Gestion de Bibliothèque
 *
 * Instructions :
 * - Remplacez les ??? par votre code
 * - N'utilisez PAS var (variables mutables)
 * - Privilégiez les fonctions pures
 * - Utilisez les fonctions d'ordre supérieur de Scala
 * - Lancez les tests avec : sbt test
 */

object Exercices {

  // ============================================================================
  // PARTIE 1 : Collections de Base - List (4 exercices)
  // ============================================================================

  /**
   * 1.1 - Créer une liste à partir de valeurs
   * Créez une liste contenant les nombres de 1 à 5
   * 
   * Exemple : creerListe() => List(1, 2, 3, 4, 5)
   */
  def creerListe(): List[Int] = ???

  /**
   * 1.2 - Obtenir la taille d'une liste
   * 
   * Exemple : tailleListe(List(1, 2, 3)) => 3
   */
  def tailleListe(liste: List[Int]): Int = ???

  /**
   * 1.3 - Obtenir le premier élément d'une liste (head)
   * Vous pouvez supposer que la liste n'est jamais vide
   * 
   * Exemple : premierElement(List(1, 2, 3)) => 1
   */
  def premierElement(liste: List[Int]): Int = ???

  /**
   * 1.4 - Vérifier si une liste contient un élément
   * 
   * Exemple : contient(List(1, 2, 3), 2) => true
   *           contient(List(1, 2, 3), 5) => false
   */
  def contient(liste: List[Int], element: Int): Boolean = ???


  // ============================================================================
  // PARTIE 2 : map et filter (4 exercices)
  // ============================================================================

  /**
   * 2.1 - Doubler tous les éléments d'une liste (map)
   * 
   * Exemple : doubler(List(1, 2, 3)) => List(2, 4, 6)
   */
  def doubler(liste: List[Int]): List[Int] = ???

  /**
   * 2.2 - Convertir des nombres en chaînes (map)
   * 
   * Exemple : nombresEnChaines(List(1, 2, 3)) => List("1", "2", "3")
   */
  def nombresEnChaines(liste: List[Int]): List[String] = ???

  /**
   * 2.3 - Filtrer les nombres pairs (filter)
   * 
   * Exemple : filtrerPairs(List(1, 2, 3, 4, 5)) => List(2, 4)
   */
  def filtrerPairs(liste: List[Int]): List[Int] = ???

  /**
   * 2.4 - Doubler uniquement les nombres pairs (map + filter)
   * 
   * Exemple : doublerPairs(List(1, 2, 3, 4, 5)) => List(4, 8)
   */
  def doublerPairs(liste: List[Int]): List[Int] = ???


  // ============================================================================
  // PARTIE 3 : flatMap et for-comprehensions (3 exercices)
  // ============================================================================

  /**
   * 3.1 - Aplatir une liste de listes (flatten)
   * 
   * Exemple : aplatir(List(List(1, 2), List(3, 4), List(5))) 
   *           => List(1, 2, 3, 4, 5)
   */
  def aplatir(listes: List[List[Int]]): List[Int] = ???

  /**
   * 3.2 - Dupliquer chaque élément (flatMap)
   * Chaque élément doit apparaître deux fois de suite
   * 
   * Exemple : dupliquer(List(1, 2, 3)) => List(1, 1, 2, 2, 3, 3)
   */
  def dupliquer(liste: List[Int]): List[Int] = ???

  /**
   * 3.3 - Générer des paires (flatMap)
   * Générez toutes les paires (i, j) où i vient de la première liste
   * et j de la deuxième liste
   * Utilisez flatMap et map
   * 
   * Exemple : genererPaires(List(1, 2), List("a", "b")) 
   *           => List((1, "a"), (1, "b"), (2, "a"), (2, "b"))
   */
  def genererPaires(liste1: List[Int], liste2: List[String]): List[(Int, String)] = ???


  // ============================================================================
  // PARTIE 4 : fold et reduce (4 exercices)
  // ============================================================================

  /**
   * 4.1 - Somme des éléments (foldLeft)
   * 
   * Exemple : somme(List(1, 2, 3, 4)) => 10
   *           somme(List()) => 0
   *
   * /!\ liste.sum interdit
   */
  def somme(liste: List[Int]): Int = ???

  /**
   * 4.2 - Produit des éléments (foldLeft)
   * 
   * Exemple : produit(List(2, 3, 4)) => 24
   *           produit(List()) => 1
   *
   * /!\ liste.product interdit
   */
  def produit(liste: List[Int]): Int = ???

  /**
   * 4.3 - Concaténer des chaînes (foldLeft)
   * Concaténez toutes les chaînes avec un séparateur
   * 
   * Exemple : concatener(List("a", "b", "c"), ", ") => "a, b, c"
   *           concatener(List(), ", ") => ""
   *
   * /!\ liste.mkString interdit
   */
  def concatener(liste: List[String], separateur: String): String = ???

  /**
   * 4.4 - Trouver le maximum (reduce)
   * Utilisez reduce avec une fonction qui compare deux éléments
   * Vous pouvez supposer que la liste n'est jamais vide
   * 
   * Exemple : maximum(List(3, 1, 4, 1, 5)) => 5
   * 
   * /!\ liste.max interdit
   */
  def maximum(liste: List[Int]): Int = ???


  // ============================================================================
  // PARTIE 5 : Opérations avancées (4 exercices)
  // ============================================================================

  /**
   * 5.1 - Grouper par parité (groupBy)
   * Groupez les nombres en deux groupes : pairs et impairs
   * 
   * Exemple : grouperParParite(List(1, 2, 3, 4, 5)) 
   *           => Map("pair" -> List(2, 4), "impair" -> List(1, 3, 5))
   */
  def grouperParParite(liste: List[Int]): Map[String, List[Int]] = ???

  /**
   * 5.2 - Compter les occurrences (groupBy + map)
   * Comptez le nombre d'occurrences de chaque élément
   * 
   * Exemple : compterOccurrences(List("a", "b", "a", "c", "b", "a")) 
   *           => Map("a" -> 3, "b" -> 2, "c" -> 1)
   */
  def compterOccurrences(liste: List[String]): Map[String, Int] = ???

  /**
   * 5.3 - Trier par longueur de chaîne (sortBy)
   * 
   * Exemple : trierParLongueur(List("scala", "is", "awesome")) 
   *           => List("is", "scala", "awesome")
   */
  def trierParLongueur(liste: List[String]): List[String] = ???

  /**
   * 5.4 - Éliminer les doublons (distinct)
   * 
   * Exemple : eliminerDoublons(List(1, 2, 2, 3, 1, 4)) => List(1, 2, 3, 4)
   */
  def eliminerDoublons(liste: List[Int]): List[Int] = ???


  // ============================================================================
  // PARTIE 5.5 : Introduction aux Case Classes (15-20 min)
  // ============================================================================

  /**
   * Case Classes pour représenter des données immuables
   * 
   * Syntaxe : case class Point(x: Int, y: Int)
   * Création : val p = Point(3, 4)
   * Accès : p.x, p.y
   */

  case class Point(x: Int, y: Int)

  /**
   * 5.5.1 - Créer un point
   * Créez un point avec les coordonnées x et y
   * 
   * Exemple : creerPoint(3, 4) => Point(3, 4)
   */
  def creerPoint(x: Int, y: Int): Point = ???

  /**
   * 5.5.2 - Distance à l'origine
   * Calculez la distance d'un point à l'origine (0, 0)
   * Formule : sqrt(x² + y²)
   * 
   * Conseil : Utilisez Math.sqrt() et Math.pow()
   * 
   * Exemple : distanceOrigine(Point(3, 4)) => 5.0
   */
  def distanceOrigine(point: Point): Double = ???

  /**
   * 5.5.3 - Déplacer un point (méthode copy)
   * Créez un nouveau point déplacé de dx et dy
   * Utilisez la méthode copy ou créez un nouveau Point
   * 
   * Exemple : deplacerPoint(Point(1, 2), 3, 4) => Point(4, 6)
   */
  def deplacerPoint(point: Point, dx: Int, dy: Int): Point = ???

  /**
   * 5.5.4 - Quadrant d'un point (pattern matching)
   * Retournez le quadrant où se trouve le point :
   * - "Q1" si x > 0 et y > 0
   * - "Q2" si x < 0 et y > 0
   * - "Q3" si x < 0 et y < 0
   * - "Q4" si x > 0 et y < 0
   * - "Origine" si x == 0 et y == 0
   * - "Axe" sinon
   * 
   * Utilisez pattern matching avec guards
   * 
   * Exemple : quadrant(Point(3, 4)) => "Q1"
   */
  def quadrant(point: Point): String = ???

  /**
   * 5.5.5 - Trouver le point le plus proche de l'origine
   * Dans une liste de points, trouvez celui le plus proche de l'origine
   * Utilisez la fonction distanceOrigine et minBy
   * Vous pouvez supposer que la liste n'est jamais vide
   * 
   * Exemple : pointLePlusProche(List(Point(1,1), Point(5,5), Point(2,2)))
   *           => Point(1, 1)
   */
  def pointLePlusProche(points: List[Point]): Point = ???


  // ============================================================================
  // PARTIE 6 : Mini-Projet - Système de Gestion de Bibliothèque
  // ============================================================================

  /**
   * Modèle de données : nous utilisons des case classes
   */

  case class Livre(
    titre: String,
    auteur: String,
    annee: Int,
    categorie: String
  )

  case class Emprunt(
    titre: String,
    emprunteur: String,
    estRendu: Boolean
  )

  /**
   * 6.1 - Créer un livre
   * 
   * Exemple : creerLivre("1984", "George Orwell", 1949, "Fiction")
   *           => Livre("1984", "George Orwell", 1949, "Fiction")
   */
  def creerLivre(titre: String, auteur: String, annee: Int, categorie: String): Livre = ???

  /**
   * 6.2 - Extraire les titres
   * Extrayez tous les titres de livres d'une liste
   * Utilisez map et accédez au champ .titre
   * 
   * Exemple : extraireTitres(List(
   *             Livre("1984", "Orwell", 1949, "Fiction"),
   *             Livre("Sapiens", "Harari", 2011, "Histoire")
   *           )) => List("1984", "Sapiens")
   */
  def extraireTitres(livres: List[Livre]): List[String] = ???

  /**
   * 6.3 - Filtrer par catégorie
   * Retournez tous les livres d'une catégorie donnée
   * Utilisez filter et accédez au champ .categorie
   * 
   * Exemple : filtrerParCategorie(livres, "Fiction") 
   *           => tous les livres de fiction
   */
  def filtrerParCategorie(livres: List[Livre], categorie: String): List[Livre] = ???

  /**
   * 6.4 - Filtrer par auteur
   * Retournez tous les livres d'un auteur donné
   * Utilisez filter et accédez au champ .auteur
   * 
   * Exemple : filtrerParAuteur(livres, "George Orwell") 
   *           => tous les livres d'Orwell
   */
  def filtrerParAuteur(livres: List[Livre], auteur: String): List[Livre] = ???

  /**
   * 6.5 - Livres récents
   * Retournez tous les livres publiés après une année donnée
   * Utilisez filter et accédez au champ .annee
   * 
   * Exemple : livresRecents(livres, 2000) 
   *           => tous les livres publiés après 2000
   */
  def livresRecents(livres: List[Livre], anneeMin: Int): List[Livre] = ???

  /**
   * 6.6 - Compter par catégorie
   * Comptez combien de livres il y a dans chaque catégorie
   * Utilisez groupBy sur .categorie puis transformez avec map
   * 
   * Exemple : compterParCategorie(livres) 
   *           => Map("Fiction" -> 5, "Histoire" -> 3, ...)
   */
  def compterParCategorie(livres: List[Livre]): Map[String, Int] = ???

  /**
   * 6.7 - Grouper par auteur
   * Groupez les livres par auteur
   * Utilisez groupBy sur .auteur
   * 
   * Exemple : grouperParAuteur(livres) 
   *           => Map("George Orwell" -> List(...), "Yuval Harari" -> List(...))
   */
  def grouperParAuteur(livres: List[Livre]): Map[String, List[Livre]] = ???

  /**
   * 6.8 - Livres non rendus
   * Retournez la liste des titres de livres non encore rendus
   * Filtrez les emprunts où estRendu == false, puis extrayez les titres
   * 
   * Exemple : livresNonRendus(List(
   *             Emprunt("1984", "Alice", false),
   *             Emprunt("Sapiens", "Bob", true),
   *             Emprunt("Dune", "Charlie", false)
   *           )) => List("1984", "Dune")
   */
  def livresNonRendus(emprunts: List[Emprunt]): List[String] = ???

  /**
   * 6.9 - Livres par emprunteur
   * Pour un emprunteur donné, retournez tous les titres qu'il a empruntés
   * (rendus ou non)
   * Filtrez par emprunteur puis extrayez les titres
   * 
   * Exemple : livresParEmprunteur(emprunts, "Alice") 
   *           => List("1984", "Sapiens", ...)
   */
  def livresParEmprunteur(emprunts: List[Emprunt], emprunteur: String): List[String] = ???

  /**
   * 6.10 - Livre le plus ancien par catégorie
   * Pour chaque catégorie, trouvez le livre le plus ancien
   * Groupez par catégorie, puis pour chaque groupe trouvez le minimum par année
   * 
   * Exemple : livreLePlusAncienParCategorie(livres)
   *           => Map("Fiction" -> Livre("1984", ...), "Histoire" -> Livre(...))
   */
  def livreLePlusAncienParCategorie(livres: List[Livre]): Map[String, Livre] = ???

  /**
   * 6.11 - Statistiques de la bibliothèque
   * Créez une case class pour représenter les statistiques, puis calculez :
   * - le nombre total de livres
   * - le nombre de catégories différentes
   * - l'année du livre le plus ancien
   * - l'année du livre le plus récent
   * 
   * Vous pouvez supposer que la liste n'est jamais vide
   * Utilisez les fonctions map, distinct, minBy, maxBy
   * 
   * Exemple : statistiquesBibliotheque(livres) 
   *           => StatsBibliotheque(50, 8, 1949, 2023)
   */
  case class StatsBibliotheque(
    totalLivres: Int,
    nombreCategories: Int,
    anneePlusAncien: Int,
    anneePlusRecent: Int
  )

  def statistiquesBibliotheque(livres: List[Livre]): StatsBibliotheque = ???


  // ============================================================================
  // BONUS : Exercices Avancés (2 exercices optionnels)
  // ============================================================================

  /**
   * BONUS 1 - Recommandations
   * Pour un livre donné (par titre), recommandez d'autres livres :
   * - du même auteur OU de la même catégorie
   * - mais pas le livre lui-même
   * 
   * Triez par année (plus récent en premier)
   * Utilisez find pour trouver le livre, puis filter pour recommander
   * 
   * Exemple : recommander(livres, "1984") 
   *           => autres livres d'Orwell ou de fiction, triés par année
   */
  def recommander(livres: List[Livre], titreLivre: String): List[Livre] = ???

  /**
   * BONUS 2 - Emprunteur le plus actif
   * Trouvez l'emprunteur qui a emprunté le plus de livres
   * Groupez par emprunteur, comptez, puis trouvez le maximum avec maxBy
   * Retournez un tuple (nom, nombre de livres)
   * Vous pouvez supposer que la liste n'est jamais vide
   * 
   * Exemple : emprunteurLePlusActif(emprunts) 
   *           => ("Alice", 5)
   */
  def emprunteurLePlusActif(emprunts: List[Emprunt]): (String, Int) = ???
}


