package easy

import P01._
import org.scalatest.FunSuite

class P01Tests extends FunSuite {

  test("List element for non-empty list") {
    last(List(1,2,3,4)) == 4
    last(List(1)) == 1
  }

  test("IllegalArgumentException is thrown for empty list") {
    assertThrows[IllegalArgumentException] {
      last(Nil)
    }

    assertThrows[IllegalArgumentException] {
      last(null)
    }
  }
}
