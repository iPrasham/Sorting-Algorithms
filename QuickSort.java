class QuickSort{

  public static void quickSort(int[] arr, int low, int high){
    if(low < high){
      int pi = partition(arr, low, high);
      quickSort(arr, low, pi-1);
      quickSort(arr, pi+1, high);
    }
  }

  public static int partition(int[] arr, int low, int high){
    int pivot = arr[high];
    int i = low - 1;
    int temp;
    for(int j = low; j < high - 1; j++){
      if(arr[j] < pivot){
        i++;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;
    return i+1;
  }

  public static void main(String[] args) {
    int[] arr = {4,7,3,2,9,1};
    System.out.print("Array before Sorting: ");
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.print("\n");
    quickSort(arr, 0, arr.length-1);
    System.out.print("Array after Sorting: ");
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }
}
