import org.scalatest.{BeforeAndAfter, FunSpec}
import week05._


class FilmSpec extends FunSpec with BeforeAndAfter {

  var director: Director = _
  var film: Film = _

  val eastwood = new Director("Clint", "Eastwood", 1930)
  val mcTiernan = new Director("John", "McTiernan", 1951)
  val nolan = new Director("Christopher", "Nolan", 1970)
  val someGuy = new Director("Just", "Some Guy", 1990)

  val memento = new Film("Memento", 2000, 8.5, nolan)
  val darkKnight = new Film("Dark Knight", 2008, 9.0, nolan)
  val inception = new Film("Inception", 2010, 8.8, nolan)

  val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood)
  val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
  val unforgiven = new Film("Unforgiven", 1992, 8.3, eastwood)
  val granTorino = new Film("Gran Torino", 2008, 8.2, eastwood)
  val invictus = new Film("Invictus", 2009, 7.4, eastwood)

  val predator = new Film("Predator", 1987, 7.9, mcTiernan)
  val dieHard = new Film("Die Hard", 1988, 8.3, mcTiernan)
  val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
  val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)


  dieHard.director.name
  invictus.isDirectedBy(nolan) // should be false

  before {

    //class Film(name:String, yearOfRelease: Int, imdbRating: Double, director: Director) {

    //person = Person.apply("John Smith")
   // director = new Director("John", "Smith", 1960)
    //film = new Film("Dead", 1989, 9.6, director)

  }

  describe("A Film or A Director") {

    it("Has a DOB") {
      assert(eastwood.yearOfBirth == 1930) // should be 1930)
    }

    it("Has a name") {
      assert(dieHard.director.name.equals("John McTiernan")) // should be "John McTiernan"
    }

    it("Has a director") {
      assert(invictus.isDirectedBy(nolan) == false)
    }
    it("Is copyable") {
      assert(highPlainsDrifter.copy(name = "abc").name.equals("abc"))
    }

    it("Is copyable2") {
      assert(inception.copy().copy().copy().name.equals("Inception"))
    }

    it("Is IMDB comparable") {
      assert(Film.highestRating(predator, dieHard).name.equals("Die Hard"))
    }

    it("Is age comparable") {
      assert(Director.older(eastwood, nolan).equals(eastwood))
    }


  }

}