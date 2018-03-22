package sorting

object InsertionSortScala {

  def insertionSort[A](la: List[A])(implicit ord: Ordering[A]): List[A] = {
    // first, la is empty list
    def insert(la: List[A], a: A) = {
      val (h, t) = la.span(ord.lt(_, a))
      // List(10)
      // List(10, 20)
      // List(10, 20, 30)
      // List(5, 10, 20, 30)
      // List(5, 10, 20, 30, 50) => List(5, 10), List(20, 30, 50)
      // List(5, 10, 15, 20, 30, 50)
      // List(5, 10, 15, 20, 30, 50)
      h ::: (a :: t)
    }

    // add empty list each elements
    la.foldLeft(List[A]()){(acc, a) => insert(acc, a)}
  }

  def main(args: Array[String]): Unit = {
    val la = List(10, 20, 30, 5, 50, 15)
    insertionSort(la)
  }

}
