package sorting

object HeapSortScala {

  def heapSort(la: Array[Int]): Array[Int] = {
    val len = la.length
    for (i <- len / 2 - 1 to 0 by -1) {
      heapify(la, len, i)
    }
    for (i <- len - 1 to 0 by -1) {
      val temp = la.head
      la(0) = la(i)
      la(i) = temp
      heapify(la, i, 0)
    }
    la
  }

  def heapify(la: Array[Int], len: Int, i: Int): Unit = {
    var largest = i
    val l = 2 * i + 1
    val r = 2 * i + 2
    if (l < len && la(l) > la(largest)) {
      largest = l
    }
    if (r < len && la(r) > la(largest)) {
      largest = r
    }
    if (largest != i) {
      val swap = la(i)
      la(i) = la(largest)
      la(largest) = swap
      heapify(la, len, largest)
    }
  }

}
