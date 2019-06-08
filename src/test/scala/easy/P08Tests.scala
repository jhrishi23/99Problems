package easy

import P08._
import org.scalatest.FunSuite

class P08Tests extends FunSuite {

  test("List is compressed") {
    assert(compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) == List('a', 'b', 'c', 'a', 'd', 'e'))
  }

}
