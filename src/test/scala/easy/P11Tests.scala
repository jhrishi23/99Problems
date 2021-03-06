package easy

import easy.P11._
import org.scalatest.FunSuite

class P11Tests extends FunSuite {

  test("List is encoded") {
    assert( //
      encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
        ==
        List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e))
    )
  }

}
