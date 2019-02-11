package easy

import P04._
import org.scalatest.FunSuite

class P04Tests extends FunSuite {

  test("Verify lengths of empty and non-empty lists") {
    assert(length(List(1,2,3,4,5)) == 5)
    assert(length(List(1)) == 1)
    assert(length(List()) == 0)
    assert(length(null) == 0)
  }

}
