package easy

import easy.P09._
import org.scalatest.FunSuite

class P09Tests extends FunSuite {

  test("List is separated into sublists") {
    assert(//
      pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
        List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

}
