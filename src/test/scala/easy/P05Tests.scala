package easy

import P05._
import org.scalatest.FunSuite

class P05Tests extends FunSuite {

  test("Reverse of a non-empty list") {
    assert(reverse(List(1,2,3))  ==  List(3,2,1))
  }

}
