public class Kth_small_using_quicksort {
    public static int partition(int[] arr, int l, int h){
        int pivot = arr[l];
        int i = l;
        for(int j=l+1; j<=h; j++){
            if(arr[j] <= pivot){
                i = i + 1;
                // swap(arr[i], arr[j])
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }
        }
        // swap (arr[l], arr[i])
        // to get the correct position of the pivot element
        int tem = arr[l];
        arr[l] = arr[i];
        arr[i] = tem;

        return i;
    }
    public static int selectionProcedure(int[] arr,int l,int h,int k){
        
            int m=partition(arr, l, h);
            if(m==k-1){
                return arr[m];
            }
            else if(m<k-1){
                return selectionProcedure(arr,m+1, h, k);
            }
            else{
                return selectionProcedure(arr, l, m-1, k);
            }
        
    }
    public static void main(String[] args) {
       int arr[]={3,1,5,8,2};
       int k=4;
       int result=selectionProcedure(arr, 0, 4, k);
       System.out.println(result);
    }
}
