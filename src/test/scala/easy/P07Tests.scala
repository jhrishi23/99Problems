package easy

import P07._
import org.scalatest.FunSuite

class P07Tests extends FunSuite {

  test("map is flattened") {
    val a = List(List(1), List(2,3), List(4))
    val b = List(1,2,3,4)
    assert(flatten(a) == b)
  }

}
