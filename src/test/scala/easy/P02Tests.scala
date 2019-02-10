package easy

import P02._
import org.scalatest.FunSuite

class P02Tests extends FunSuite {

  test("Penultimate element for list") {
    assert(penultimate(List(1,2,3,4,5)) == 4)
    assert(penultimate(List(1,2)) == 1)
  }

  test("Exception is thrown for empty list") {
    assertThrows[IllegalArgumentException] {
      penultimate(Nil)
    }

    assertThrows[IllegalArgumentException] {
      penultimate(null)
    }
  }

}
