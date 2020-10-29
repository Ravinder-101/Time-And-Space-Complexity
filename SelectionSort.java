import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scn.nextInt();
        }
        selectionSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int small = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] <arr[small] ){
                    small = j;
                }
            }
            swap(arr,i,small);
        }
    }
    public static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}
