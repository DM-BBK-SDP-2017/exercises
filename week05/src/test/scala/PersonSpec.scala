import org.scalatest.{BeforeAndAfter, FunSpec}
import week05._


class PersonSpec extends FunSpec with BeforeAndAfter {

  var person: Person = _
  //var person2: Person = _

  before {

    //person = Person.apply("John Smith")
    person = Person("John", "Smith")

  }

  describe("A Person") {

   it("Dummy") {
   assert(person.first.equals("John"))
   }
  }
  }