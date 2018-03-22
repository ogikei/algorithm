package sorting;

public class SelectionSortJava {

  public static void main(String... args) {
    Integer[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
    Integer[] arr2 = doSelectionSort(arr1);
    for (Integer i : arr2) {
      System.out.print(i);
      System.out.print(", ");
    }
  }

  public static Integer[] doSelectionSort(Integer arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[index]) {
          index = j;
        }
      }
      // index is smallest number
      int smallNumber = arr[index];
      arr[index] = arr[i];
      arr[i] = smallNumber;
    }
    return arr;
  }

}
