/**
  * Created by dannymadell on 19/02/2017.
  */

package week05


case class Film(
           val  name:String,
           val yearOfRelease: Int,
           val imdbRating: Double,
           val director: Director) {

  def directorsAge(): Int = {
    yearOfRelease - director.yearOfBirth
  }

  def isDirectedBy(director: Director): Boolean = {
    director.equals(this.director)
  }




}

object Film {



  def highestRating(film1: Film, film2: Film): Film = {
    if (film1.imdbRating > film2.imdbRating) film1 else film2
  }
          }

/*BOILER PLATE REMOVED
*
*
* def copy(name: String = this.name,
           yearOfRelease: Int = this.yearOfRelease,
           imdbRating: Double = this.imdbRating,
           director: Director = this.director): Film = {
    new Film(name, yearOfRelease, imdbRating, director)
  }
*
*
*  def apply(name: String,
            yearOfRelease: Int,
            imdbRating: Double,
            director: Director): Film = {

    new Film(name, yearOfRelease,imdbRating,director)

  }
*
*
*
* */
