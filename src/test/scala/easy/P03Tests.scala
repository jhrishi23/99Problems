package easy

import P03._
import org.scalatest.FunSuite

class P03Tests extends FunSuite {

  test("Kth element for empty list") {
    assert(kth(1, List(1,2)) == 1)
    assert(kth(4, List(1,3,2,4)) == 4)
  }

  test("Exception is thrown when k is out of index") {
    assertThrows[IllegalArgumentException] {
      kth(10, List(1,2,4,1,2))
    }

    assertThrows[IllegalArgumentException] {
      kth(0, List(1,2,4,1,2))
    }
  }

}
