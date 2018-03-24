package sorting;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestInsertionSortJava {

  @Test
  public void testInsertionSort() {
    int[] x = {10, 20, 5, 40, 35, 30};
    int[] expected = {5, 10, 20, 30, 35, 40};
    int[] actual = new InsertionSortJava().doInsertionSort(x);
    assertArrayEquals(expected, actual);
  }

}
