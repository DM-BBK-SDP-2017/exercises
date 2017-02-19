/**
  * Created by dannymadell on 19/02/2017.
  */

import org.scalatest.{BeforeAndAfter, FunSpec}
import week05._


class CounterSpec extends FunSpec with BeforeAndAfter {

  var counter: Counter = _
  var adder: Adder = _

  before {
    counter = new Counter(10)
    adder = new Adder(5)
  }

  describe("A Counter") {

    it("Should inc by 1") {
      assert(counter.inc().count == 11)
    }

    it("Should dec by 1") {
      assert((counter.dec().count == 9))
    }

    it("Should let user increment by any number") {
      assert(counter.inc(10).count == 20)
    }

    it("Should let user decrement by any number") {
      assert(counter.dec(5).count == 5)
    }

    it("Should work with adder") {
      assert(counter.adjust(adder).count == 15)
    }
  }



}
