import java.util.Scanner;

public class Prac96{

    public static void MergeSort(int[] a, int low,int high){
        
        while(low<high){
            int mid=(low+high)/2;
            System.out.println("low : "+low+"  high : "+mid);
            MergeSort(a, low, mid);
            MergeSort(a, mid+1, high);
            Merge(a, low, mid, high);
        }
    }

    public static void Merge(int[] a,int low,int mid,int high){
        int b[]=new int[a.length];
        int h=low;
        int i=low;
        int j=mid+1;
        
        while(h<=mid && j<=high){
            if(a[h]<=a[j]){
                b[i]=a[h];
                h++;
            }
            else{
                b[i]=a[j];
                j++;
            }
            i++;
            System.out.println(h+" "+i+" "+j);
        }

        if(h>mid){
            for(int k=j;k<=high;k++){
                b[i]=a[k];
                i++;
            }
        }
        else{
            for(int k=h;k<=mid;k++){
                b[i]=a[k];
                i++;
            }
        }

        for(int k=low;k<=high;k++){
            a[k]=b[k];
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

        int low=0;
        int high=n;

        MergeSort(a,low,high);
        for(int m=0;m<a.length;m++){
            System.out.println("a["+m+"] = "+ a[m]);
        }
    }
}