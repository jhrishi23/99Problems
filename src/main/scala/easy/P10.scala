package easy

/**
  * Run-length encoding of a list.
  */
object P10 {

  def encode(list:List[Symbol]):List[(Int, Symbol)] = P09.pack(list).map(x => (x.length, x.head))
}
