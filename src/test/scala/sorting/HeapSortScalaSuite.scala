package sorting

import org.scalatest.FunSuite

class HeapSortScalaSuite extends FunSuite {

  test("heap sort") {
    val la = Array(40, 30, 15, 35, 50, 5)
    val expected = Array(5, 15, 30, 35, 40, 50)
    val actual = HeapSortScala.heapSort(la)
    assert(expected sameElements actual)
  }

}
