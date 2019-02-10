package program1

/**
  * Find the last element of a list.
  */
object P01 extends App {
  println("Last element of a list")
  println(last(List(1,2,3,4)))
  println(last(List(1)))

  def last (list : List[Int]): Int = {
    list match {
      case h :: Nil => h
      case _ :: tail => last(tail)
      case Nil => throw new UnsupportedOperationException
    }
  }

}
