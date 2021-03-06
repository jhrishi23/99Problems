package easy

import easy.P10._
import org.scalatest.FunSuite

class P10Tests extends FunSuite {

  test("List is encoded") {
    assert(//
      encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
        List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

}
