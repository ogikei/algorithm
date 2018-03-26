package sorting

object QuickSortScala {

  def quickSort(la: Array[Int]): Array[Int] = {
    if (la.length <= 1) la
    else {
      // pivot of this pattern take a center element
      val pivot = la(la.length / 2)
      Array.concat(
        quickSort(la filter (pivot >)),
        la filter (pivot ==),
        quickSort(la filter (pivot <))
      )
    }
  }

}
