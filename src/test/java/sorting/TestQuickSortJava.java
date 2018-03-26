package sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestQuickSortJava {

  @Test
  public void testQuickSort() {
    int[] x = {10, 20, 5, 40, 35, 30};
    int[] expected = {5, 10, 20, 30, 35, 40};
    int[] actual = new QuickSortJava().doQuickSort(x, 0, x.length - 1);
    assertArrayEquals(expected, actual);
  }

}
