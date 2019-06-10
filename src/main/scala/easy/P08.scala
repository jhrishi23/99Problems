package easy

/**
* If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
**/
object P08 {
 
 private[this] def comp(list:List[Char], acc : List[Char]):List[Char] = {
    list match {
      case h :: tl => if (h == acc.head) comp(tl, acc) else comp(tl, h :: acc)
      case Nil =>  acc
    }
 }

 def compress[A](list:List[A]) = {
    //Using Tail Recursion
    //comp(list.tail, List(list.head)).reverse
    
    //Functional
    list.foldRight(List[A]()) {
      (h, r) =>  if (r.isEmpty || h != r.head) h :: r else r
    }
 }

}