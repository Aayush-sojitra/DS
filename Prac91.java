import java.util.Scanner;
public class Prac91 {

    public static int BinarySearch(int[] arr,int ele,int n){
        int start=0;
        int end=n-1;
        int mid;

        while (start<=end) {
            mid=(start+end)/2;
            if (mid==ele) {
                return 0;
            }
            else if (ele<mid) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println("Not found");
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of Array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("ENter element in Array["+i+"]");
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to search");
        int ele=sc.nextInt();

        int ans=BinarySearch(arr,ele,n);

        if (ans==0) {
            System.out.println("Found");
        }
    }
}
