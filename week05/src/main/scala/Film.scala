/**
  * Created by dannymadell on 19/02/2017.
  */

package week05


class Film(val  name:String,
           val yearOfRelease: Int,
           val imdbRating: Double,
           val director: Director) {

  def directorsAge(): Int = {
    yearOfRelease - director.yearOfBirth
  }

  def isDirectedBy(director: Director): Boolean = {
    director.equals(this.director)
  }

  def copy(name: String = this.name,
           yearOfRelease: Int = this.yearOfRelease,
           imdbRating: Double = this.imdbRating,
           director: Director = this.director): Film = {
    new Film(name, yearOfRelease, imdbRating, director)
  }


}

object Film {

  def apply(name: String,
            yearOfRelease: Int,
            imdbRating: Double,
            director: Director): Film = {

    new Film(name, yearOfRelease,imdbRating,director)

  }

  def highestRating(film1: Film, film2: Film): Film = {
    if (film1.imdbRating > film2.imdbRating) film1 else film2
  }
          }

/*The Film companion object should contain:
– an apply method that accepts the same parameters as the constructor
of the class and returns a new Film;
– a method highestRating that accepts two Films and returns the highest
imdbRating of the two;
– a method oldestDirectorAtTheTime that accepts two Films and returns
the Director who was oldest at the respective time of filming.*/