package seance2

import munit.FunSuite

class ExercicesSpec extends FunSuite {

  // Import de la solution à tester (changez en Solutions pour tester les solutions)
  import Exercices.*

  // ============================================================================
  // PARTIE 1 : Collections de Base - List
  // ============================================================================

  test("1.1 - creerListe: crée une liste de 1 à 5") {
    assertEquals(creerListe(), List(1, 2, 3, 4, 5))
  }

  test("1.2 - tailleListe: retourne la taille d'une liste") {
    assertEquals(tailleListe(List(1, 2, 3)), 3)
    assertEquals(tailleListe(List()), 0)
    assertEquals(tailleListe(List(42)), 1)
  }

  test("1.3 - premierElement: retourne le premier élément ou None") {
    assertEquals(premierElement(List(1, 2, 3)), Some(1))
    assertEquals(premierElement(List()), None)
    assertEquals(premierElement(List(42)), Some(42))
  }

  test("1.4 - contient: vérifie si un élément est présent") {
    assertEquals(contient(List(1, 2, 3), 2), true)
    assertEquals(contient(List(1, 2, 3), 5), false)
    assertEquals(contient(List(), 1), false)
  }


  // ============================================================================
  // PARTIE 2 : map et filter
  // ============================================================================

  test("2.1 - doubler: double tous les éléments") {
    assertEquals(doubler(List(1, 2, 3)), List(2, 4, 6))
    assertEquals(doubler(List()), List())
    assertEquals(doubler(List(0, -1, 5)), List(0, -2, 10))
  }

  test("2.2 - nombresEnChaines: convertit les nombres en chaînes") {
    assertEquals(nombresEnChaines(List(1, 2, 3)), List("1", "2", "3"))
    assertEquals(nombresEnChaines(List()), List())
    assertEquals(nombresEnChaines(List(42)), List("42"))
  }

  test("2.3 - filtrerPairs: garde uniquement les pairs") {
    assertEquals(filtrerPairs(List(1, 2, 3, 4, 5)), List(2, 4))
    assertEquals(filtrerPairs(List()), List())
    assertEquals(filtrerPairs(List(1, 3, 5)), List())
    assertEquals(filtrerPairs(List(2, 4, 6)), List(2, 4, 6))
  }

  test("2.4 - doublerPairs: double uniquement les pairs") {
    assertEquals(doublerPairs(List(1, 2, 3, 4, 5)), List(4, 8))
    assertEquals(doublerPairs(List(1, 3, 5)), List())
    assertEquals(doublerPairs(List(2, 4)), List(4, 8))
  }


  // ============================================================================
  // PARTIE 3 : flatMap et for-comprehensions
  // ============================================================================

  test("3.1 - aplatir: aplatit une liste de listes") {
    assertEquals(aplatir(List(List(1, 2), List(3, 4), List(5))), List(1, 2, 3, 4, 5))
    assertEquals(aplatir(List()), List())
    assertEquals(aplatir(List(List(), List(1), List())), List(1))
  }

  test("3.2 - dupliquer: duplique chaque élément") {
    assertEquals(dupliquer(List(1, 2, 3)), List(1, 1, 2, 2, 3, 3))
    assertEquals(dupliquer(List()), List())
    assertEquals(dupliquer(List(42)), List(42, 42))
  }

  test("3.3 - genererPaires: génère toutes les paires") {
    assertEquals(
      genererPaires(List(1, 2), List("a", "b")),
      List((1, "a"), (1, "b"), (2, "a"), (2, "b"))
    )
    assertEquals(genererPaires(List(), List("a")), List())
    assertEquals(genererPaires(List(1), List()), List())
  }


  // ============================================================================
  // PARTIE 4 : fold et reduce
  // ============================================================================

  test("4.1 - somme: calcule la somme des éléments") {
    assertEquals(somme(List(1, 2, 3, 4)), 10)
    assertEquals(somme(List()), 0)
    assertEquals(somme(List(-1, -2, -3)), -6)
  }

  test("4.2 - produit: calcule le produit des éléments") {
    assertEquals(produit(List(2, 3, 4)), 24)
    assertEquals(produit(List()), 1)
    assertEquals(produit(List(5)), 5)
  }

  test("4.3 - concatener: concatène des chaînes avec un séparateur") {
    assertEquals(concatener(List("a", "b", "c"), ", "), "a, b, c")
    assertEquals(concatener(List(), ", "), "")
    assertEquals(concatener(List("seul"), ", "), "seul")
  }

  test("4.4 - maximum: trouve le maximum") {
    assertEquals(maximum(List(3, 1, 4, 1, 5)), Some(5))
    assertEquals(maximum(List()), None)
    assertEquals(maximum(List(42)), Some(42))
  }


  // ============================================================================
  // PARTIE 5 : Opérations avancées
  // ============================================================================

  test("5.1 - grouperParParite: groupe pairs et impairs") {
    val resultat = grouperParParite(List(1, 2, 3, 4, 5))
    assertEquals(resultat("pair"), List(2, 4))
    assertEquals(resultat("impair"), List(1, 3, 5))
  }

  test("5.2 - compterOccurrences: compte les occurrences") {
    val resultat = compterOccurrences(List("a", "b", "a", "c", "b", "a"))
    assertEquals(resultat("a"), 3)
    assertEquals(resultat("b"), 2)
    assertEquals(resultat("c"), 1)
  }

  test("5.3 - trierParLongueur: trie par longueur") {
    assertEquals(trierParLongueur(List("scala", "is", "awesome")), List("is", "scala", "awesome"))
    assertEquals(trierParLongueur(List()), List())
  }

  test("5.4 - eliminerDoublons: élimine les doublons") {
    assertEquals(eliminerDoublons(List(1, 2, 2, 3, 1, 4)), List(1, 2, 3, 4))
    assertEquals(eliminerDoublons(List()), List())
  }


  // ============================================================================
  // PARTIE 5.5 : Introduction aux Case Classes
  // ============================================================================

  test("5.5.1 - creerPoint: crée un point") {
    val point = creerPoint(3, 4)
    assertEquals(point.x, 3)
    assertEquals(point.y, 4)
  }

  test("5.5.2 - distanceOrigine: calcule la distance à l'origine") {
    assertEquals(distanceOrigine(Point(3, 4)), 5.0)
    assertEquals(distanceOrigine(Point(0, 0)), 0.0)
    assert(Math.abs(distanceOrigine(Point(1, 1)) - 1.414) < 0.01)
  }

  test("5.5.3 - deplacerPoint: déplace un point") {
    assertEquals(deplacerPoint(Point(1, 2), 3, 4), Point(4, 6))
    assertEquals(deplacerPoint(Point(0, 0), 5, -3), Point(5, -3))
  }

  test("5.5.4 - quadrant: détermine le quadrant d'un point") {
    assertEquals(quadrant(Point(3, 4)), "Q1")
    assertEquals(quadrant(Point(-3, 4)), "Q2")
    assertEquals(quadrant(Point(-3, -4)), "Q3")
    assertEquals(quadrant(Point(3, -4)), "Q4")
    assertEquals(quadrant(Point(0, 0)), "Origine")
    assertEquals(quadrant(Point(0, 5)), "Axe")
    assertEquals(quadrant(Point(5, 0)), "Axe")
  }

  test("5.5.5 - pointLePlusProche: trouve le point le plus proche de l'origine") {
    val points = List(Point(5, 5), Point(1, 1), Point(3, 4))
    assertEquals(pointLePlusProche(points), Some(Point(1, 1)))
    assertEquals(pointLePlusProche(List()), None)
  }


  // ============================================================================
  // PARTIE 6 : Mini-Projet - Système de Gestion de Bibliothèque
  // ============================================================================

  // Données de test
  val livres = List(
    Livre("1984", "George Orwell", 1949, "Fiction"),
    Livre("Animal Farm", "George Orwell", 1945, "Fiction"),
    Livre("Sapiens", "Yuval Noah Harari", 2011, "Histoire"),
    Livre("Homo Deus", "Yuval Noah Harari", 2015, "Histoire"),
    Livre("Dune", "Frank Herbert", 1965, "Science-Fiction"),
    Livre("Foundation", "Isaac Asimov", 1951, "Science-Fiction"),
    Livre("The Hobbit", "J.R.R. Tolkien", 1937, "Fantasy"),
    Livre("Clean Code", "Robert C. Martin", 2008, "Informatique")
  )

  val emprunts = List(
    Emprunt("1984", "Alice", false),
    Emprunt("Sapiens", "Bob", true),
    Emprunt("Dune", "Alice", false),
    Emprunt("The Hobbit", "Charlie", true),
    Emprunt("Foundation", "Alice", true),
    Emprunt("Clean Code", "Bob", false)
  )

  test("6.1 - creerLivre: crée un livre") {
    assertEquals(
      creerLivre("1984", "George Orwell", 1949, "Fiction"),
      Livre("1984", "George Orwell", 1949, "Fiction")
    )
  }

  test("6.2 - extraireTitres: extrait les titres") {
    val resultat = extraireTitres(livres)
    assert(resultat.contains("1984"))
    assert(resultat.contains("Sapiens"))
    assertEquals(resultat.size, 8)
  }

  test("6.3 - filtrerParCategorie: filtre par catégorie") {
    val fiction = filtrerParCategorie(livres, "Fiction")
    assertEquals(fiction.size, 2)
    assert(fiction.exists(_.titre == "1984"))
    assert(fiction.exists(_.titre == "Animal Farm"))
  }

  test("6.4 - filtrerParAuteur: filtre par auteur") {
    val orwell = filtrerParAuteur(livres, "George Orwell")
    assertEquals(orwell.size, 2)
    assert(orwell.exists(_.titre == "1984"))
    assert(orwell.exists(_.titre == "Animal Farm"))
  }

  test("6.5 - livresRecents: filtre les livres récents") {
    val recents = livresRecents(livres, 2000)
    assertEquals(recents.size, 3)
    assert(recents.exists(_.titre == "Sapiens"))
    assert(recents.exists(_.titre == "Homo Deus"))
    assert(recents.exists(_.titre == "Clean Code"))
  }

  test("6.6 - compterParCategorie: compte par catégorie") {
    val compte = compterParCategorie(livres)
    assertEquals(compte("Fiction"), 2)
    assertEquals(compte("Histoire"), 2)
    assertEquals(compte("Science-Fiction"), 2)
    assertEquals(compte("Fantasy"), 1)
    assertEquals(compte("Informatique"), 1)
  }

  test("6.7 - grouperParAuteur: groupe par auteur") {
    val groupes = grouperParAuteur(livres)
    assertEquals(groupes("George Orwell").size, 2)
    assertEquals(groupes("Yuval Noah Harari").size, 2)
  }

  test("6.8 - livresNonRendus: liste les livres non rendus") {
    val nonRendus = livresNonRendus(emprunts)
    assertEquals(nonRendus.size, 3)
    assert(nonRendus.contains("1984"))
    assert(nonRendus.contains("Dune"))
    assert(nonRendus.contains("Clean Code"))
  }

  test("6.9 - livresParEmprunteur: liste les livres d'un emprunteur") {
    val livresAlice = livresParEmprunteur(emprunts, "Alice")
    assertEquals(livresAlice.size, 3)
    assert(livresAlice.contains("1984"))
    assert(livresAlice.contains("Dune"))
    assert(livresAlice.contains("Foundation"))
  }

  test("6.10 - livreLePlusAncienParCategorie: trouve le livre le plus ancien par catégorie") {
    val plusAnciens = livreLePlusAncienParCategorie(livres)
    assertEquals(plusAnciens("Fiction").titre, "Animal Farm")
    assertEquals(plusAnciens("Fiction").annee, 1945)
    assertEquals(plusAnciens("Histoire").titre, "Sapiens")
    assertEquals(plusAnciens("Science-Fiction").titre, "Foundation")
  }

  test("6.11 - statistiquesBibliotheque: calcule les statistiques") {
    val stats = statistiquesBibliotheque(livres)
    assert(stats.isDefined)
    val Some(s) = stats
    assertEquals(s.totalLivres, 8)
    assertEquals(s.nombreCategories, 5)
    assertEquals(s.anneePlusAncien, 1937)
    assertEquals(s.anneePlusRecent, 2015)
  }

  test("6.11 - statistiquesBibliotheque: retourne None pour liste vide") {
    assertEquals(statistiquesBibliotheque(List()), None)
  }


  // ============================================================================
  // BONUS : Exercices Avancés
  // ============================================================================

  test("BONUS 1 - rechercherLivres: recherche avec plusieurs critères") {
    // Recherche par catégorie uniquement
    val fiction = rechercherLivres(livres, Some("Fiction"), None, None)
    assertEquals(fiction.size, 2)

    // Recherche par auteur uniquement
    val harari = rechercherLivres(livres, None, Some("Yuval Noah Harari"), None)
    assertEquals(harari.size, 2)

    // Recherche par année uniquement
    val recents = rechercherLivres(livres, None, None, Some(2000))
    assertEquals(recents.size, 3)

    // Recherche combinée
    val fictionRecente = rechercherLivres(livres, Some("Histoire"), None, Some(2010))
    assertEquals(fictionRecente.size, 2)
    assert(fictionRecente.exists(_.titre == "Sapiens"))
    assert(fictionRecente.exists(_.titre == "Homo Deus"))
  }

  test("BONUS 2 - recommander: recommande des livres similaires") {
    val reco = recommander(livres, "1984")
    // Devrait inclure Animal Farm (même auteur) et être trié par année
    assert(reco.exists(_.titre == "Animal Farm"))
    // Ne devrait pas inclure 1984 lui-même
    assert(!reco.exists(_.titre == "1984"))
  }

  test("BONUS 3 - emprunteurLePlusActif: trouve l'emprunteur le plus actif") {
    val plusActif = emprunteurLePlusActif(emprunts)
    assertEquals(plusActif, Some(("Alice", 3)))
  }

  test("BONUS 3 - emprunteurLePlusActif: retourne None pour liste vide") {
    assertEquals(emprunteurLePlusActif(List()), None)
  }
}


