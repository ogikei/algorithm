package sorting

import org.scalatest.FunSuite

class SelectionSortScalaSuite extends FunSuite {

  test("selection sort") {
    val la = List(40, 30, 15, 35, 50, 5)
    val expected = List(5, 15, 30, 35, 40, 50)
    val actual = SelectionSortScala.selectionSort(la)
    assert(expected == actual)
  }

}
