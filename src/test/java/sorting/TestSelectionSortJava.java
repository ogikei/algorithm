package sorting;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSelectionSortJava {

  @Test
  public void testSelectionSort() {
    Integer[] x = {10, 20, 5, 40, 35, 30};
    Integer[] expected = {5, 10, 20, 30, 35, 40};
    Integer[] actual = SelectionSortJava.doSelectionSort(x);
    System.out.println(Arrays.toString(actual));
    assertEquals(expected, actual);
  }

}
