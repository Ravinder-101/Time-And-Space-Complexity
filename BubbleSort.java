import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scn.nextInt();
        }
        BubbleSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void BubbleSort(int arr[]){
        for(int i=1;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j+1] < arr[j]){
                    swap(arr,j+1,j);
                }
            }
        }
        
    }
    public static void swap(int arr[],int j,int i){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}
