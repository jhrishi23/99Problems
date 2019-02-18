package easy

import scala.annotation.tailrec

/**
  * Reverse a list.
  */
object P05 {

  def reverse[A](list: List[A]):List[A] = {
    list match {
      case Nil => Nil
      case h :: tail => reverse(tail) ::: List(h)
    }
  }

}
