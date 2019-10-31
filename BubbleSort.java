public class BubbleSort{
  public static void bubbleSort(int arr[], int n){
    int temp;
    boolean swap = false;
    for(int i = 0; i < n-1; i++){
      for(int j = 0; j < n-i-1; j++){
        if(arr[j] > arr[j+1]){
          swap = true;
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
      if(swap == false){
        break;
      }
    }
  }

public static void main(String[] args) {
  int[] arr = {4,7,3,2,9,1};
  System.out.print("Array before Sorting: ");
  for(int i = 0; i<arr.length; i++){
    System.out.print(arr[i]+" ");
  }
  System.out.print("\n");
  bubbleSort(arr, arr.length);
  System.out.print("Array after Sorting: ");
  for(int i = 0; i<arr.length; i++){
    System.out.print(arr[i]+" ");
  }
 }
}
