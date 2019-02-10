package easy

import scala.annotation.tailrec

/**
  * Find the last but one element of a list.
  */
object P02 {

  @tailrec
  def penultimate[A](list:List[A]):A = {

    if (list == null)
      throw new IllegalArgumentException

    list match {
      case Nil => throw new IllegalArgumentException
      case _ :: Nil =>
        throw new IllegalArgumentException("Expected list to have more than 1 element ")
      case pn :: _ :: Nil => pn
      case _ :: tail => penultimate(tail)
    }
  }

}
