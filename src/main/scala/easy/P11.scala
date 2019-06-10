package easy

/**
  * Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
  */
object P11 {

  def encodeModified(list: List[Symbol]):List[Any] = P09.pack(list).map(x => {
    if (x.size == 1) x.head else (x.length, x.head)
  })

}
