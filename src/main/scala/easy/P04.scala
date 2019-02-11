package easy

import scala.annotation.tailrec

/**
  * Find the number of elements of a list.
  */
object P04 {

  def length[A](list: List[A]):Int = {

    if (list == null) return 0

    @tailrec
    def length(i : Int, list: List[A]):Int = {
      list match {
        case Nil => i
        case ::(_, tl) => length(i + 1, tl)
      }
    }

    length(0, list)
  }

}
