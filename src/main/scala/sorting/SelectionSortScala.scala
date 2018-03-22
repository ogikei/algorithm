package sorting

import scala.annotation.tailrec

object SelectionSortScala {

  def maximum(xs: List[Int]): List[Int] = {
    (List(xs.head) /: xs.tail) {
      (ys, x) =>
        if (x > ys.head) x :: ys
        else ys.head :: x :: ys.tail
    }
  }

  def selectionSort(xs: List[Int]): List[Int] = {
    @tailrec
    def loop(xs: List[Int], acc: List[Int]): List[Int] = {
      if (xs.isEmpty) acc
      else {
        val ys = maximum(xs)
        loop(ys.tail, ys.head :: acc)
      }
    }
    loop(xs, Nil)
  }

}
