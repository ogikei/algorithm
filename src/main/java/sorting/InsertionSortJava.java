package sorting;

public class InsertionSortJava {

  public static void main(String[] args) {
    Integer[] x = {10, 20, 5, 30, 25, 0, 15};
    doInsertionSort(x);
  }

  static Integer[] doInsertionSort(Integer[] input) {
    int temp;
    for (int i = 1; i < input.length; i++) {
      for (int j = i; j > 0; j--) {
        if (input[j] < input[j - 1]) {
          temp = input[j];
          input[j] = input[j - 1];
          input[j - 1] = temp;
        }
      }
    }
    return input;
  }

}
