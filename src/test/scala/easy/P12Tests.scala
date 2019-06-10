package easy

import easy.P12._
import org.scalatest.FunSuite

class P12Tests extends FunSuite {

  test("List is decoded") {
    assert( //
      decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
        ==
        List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

}
