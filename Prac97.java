import java.util.Scanner;

public class Prac97 {

    public static void QuickSort(int[] arr,int lb,int ub){
        boolean flag=true;

        if (lb<ub) {
            int i=lb;
            int j=ub+1;
            int key=arr[lb];

            while (flag) {
                i++;
                while (i<arr.length && arr[i]<key) {
                    i++;
                }
                j--;
                while (j>=0 && arr[j]>key) {
                    j--;
                }

                if(i<j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }else{
                    flag=false;
                }

            }
            int temp=arr[lb];
            arr[lb]=arr[j];
            arr[j]=temp;
            QuickSort(arr, lb, j-1);
            QuickSort(arr, j+1, ub);
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size :");
        int n=sc.nextInt();
        int []a=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter element in a["+i+"]");
            a[i]=sc.nextInt();
        }
        int lb=0;
        int ub=a.length-1;

        QuickSort(a, lb, ub);
    }
}
