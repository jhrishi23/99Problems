package easy

/**
  * Flatten a nested list structure.
  */
object P07 {

  def flatten[A](list : List[List[A]]):List[A] = {

    def flatten(acc: List[A], list: List[List[A]]): List[A] = {
      list match {
        case Nil => acc
        case ::(head, tl) => flatten(acc ::: head, tl)
      }
    }
    flatten(Nil, list)
  }

}
