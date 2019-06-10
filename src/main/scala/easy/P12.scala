package easy

/**
  * Decode a run-length encoded list.
  */
object P12 {

  def decode(list: List[(Int, Symbol)]):List[Symbol] = {
    for {
      l <- list
      times = l._1
      _ <- 1 to times
    } yield l._2
  }
}
