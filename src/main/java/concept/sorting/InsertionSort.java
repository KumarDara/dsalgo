//Inertion Sort

package concept.sorting;
public class InsertionSort {
  /*
  Start with second element till n elements of the input
  Compare the current element with before elements till 0th element
  Keep right shift the elements incase the current element is less than the before elements.
  Place the current element at correct index
  */
  /*
    for i <- 2 to n
      ele <- input[i]
      j <- i-1
      while j >= 0 and ele < a[j]
        a[j+1] <- a[j]
        j--
      a[j+1] <- ele
  */
  public void sort(int[] input) {
    for(int i=1; i<input.length; i++) {
      int ele = input[i];
      int j=i-1;
      while(j >= 0 && ele < input[j]) {
        input[j+1] = input[j];
        j--;
      }
      input[j+1] = ele;
    }
  }
}
