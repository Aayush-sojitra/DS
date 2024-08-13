
import java.util.Scanner;

public class Prac93{

    public static void InsertionSort(int[] a, int n){        
        int m=0;
        
        while (m<n) { 
           int key=a[m];
           int j=m-1; 

           while(j>=0 && a[j]>key){
            a[j+1]=a[j];
            j--;
           }

           a[j+1]=key;
           m++;
        }

        for(int i=0;i<n;i++){
            System.out.println("a["+i+"] = "+ a[i]);
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

        InsertionSort(a,n);
    }
}
