/**
  * Created by dannymadell on 19/02/2017.
  */

package week05

class Director(val firstName: String,val lastname: String,val yearOfBirth: Int) {

  def name(): String = {
    firstName + " " + lastname
  }

}

object Director {

  def apply(firstName: String, lastname: String, yearOfBirth: Int): Director = {
    new Director(firstName, lastname, yearOfBirth)
  }

  def older(dir1: Director, dir2: Director): Director = {
    if (dir1.yearOfBirth < dir2.yearOfBirth) dir1 else dir2
  }
}




/*The Director companion object should contain:
– an apply method that accepts the same parameters as the constructor
of the class and returns a new Director;
– a method older that accepts two Directors and returns the oldest of
the two
*/