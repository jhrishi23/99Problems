package easy

import scala.annotation.tailrec

/**
  * Find the Kth element of a list.
  */
object P03 {

  @tailrec
  def kth[A](k : Int, list: List[A]):A = {

    if (k < 1) throw new IllegalArgumentException

    list match {
      case Nil => throw new IllegalArgumentException
      case h :: tail =>
        if (k == 1)
          h
        else
          kth(k - 1, tail)
    }

  }

}
