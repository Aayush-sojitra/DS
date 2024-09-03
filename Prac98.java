import java.util.Scanner;

class Heap{

    public static void Heapify(int[] arr,int n,int i){
        int LChild=2*i+1;
        int RChild=2*i+2;

        int maxIndex=i;

        if (LChild<n && arr[LChild]>arr[maxIndex]) {
            maxIndex=LChild;
        }
        if (RChild<n && arr[RChild]>arr[maxIndex]) {
            maxIndex=RChild;
        }

        if (i!=maxIndex) {

            int temp=arr[i];
            arr[i]=arr[maxIndex];
            arr[maxIndex]=temp;

            Heapify(arr, n, maxIndex);
            
        }

    }


    // public static int max(int n,int LChild,int RChild){
    //     if (n>LChild) {
    //         if (n>RChild) {
    //             return n;
    //         }
    //         else{
    //             return RChild;
    //         }
    //     }
    //     else{
    //         if (LChild>RChild) {
    //             return LChild;
    //         }
    //         else{
    //             return RChild;
    //         }
    //     }
    // }

    public static void BuildMaxHeap(int[] arr){
        int n=arr.length;
        for(int m=(n/2)-1;m>=0;m--){
            Heapify(arr, n, m);
        }
    }

    public static void HeapSort(int[] arr){
        BuildMaxHeap(arr);
        for(int i=arr.length-1;i>=0;i--){

            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            Heapify(arr, i, 0);
        }
        // display(arr);
        
    }

    
}

public class Prac98 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Heap h1=new Heap();

        System.out.println("Enter Size :");
        int n=sc.nextInt();
        int []a=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter element in a["+i+"]");
            a[i]=sc.nextInt();
        }
        
        h1.HeapSort(a);
       

        System.out.println("-------Sorted Array-------");
       for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
        
    }
}
