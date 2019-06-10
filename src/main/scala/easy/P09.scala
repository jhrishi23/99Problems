package easy

/**
  * If a list contains repeated elements they should be placed in separate sublists.
  */
object P09 {

  def pack(list : List[Symbol]):List[List[Symbol]] = {
    val l = list.foldLeft(List[List[Symbol]]()) {
      (lst, x) => {
        lst match {
          case Nil => List(List(x))
          case ::(h, tl) => if (x == h.head)  (x :: h) :: tl else List(x) :: h :: tl
        }
      }
    }
    l.reverse
  }
}
