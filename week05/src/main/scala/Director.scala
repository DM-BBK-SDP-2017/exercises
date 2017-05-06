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



  def older(dir1: Director, dir2: Director): Director = {
    if (dir1.yearOfBirth < dir2.yearOfBirth) dir1 else dir2
  }
}




/*BOILERPLATE


def apply(firstName: String, lastname: String, yearOfBirth: Int): Director = {
    new Director(firstName, lastname, yearOfBirth)
  }

*/