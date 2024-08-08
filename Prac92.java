
import java.util.Scanner;

public class Prac92{

    public static void bubbleSort(int[] a, int n){
        int index=0;         
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    index++;
                }
            }
            if(index==0){
                System.out.println("Array already sorted");
                break;
            }
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

        bubbleSort(a,n);
    }
}