import java.util.Scanner;
public class Prac90 {

    public static int LinearSearch(int[] arr,int ele,int n){
        for(int i=0;i<n;i++){
            if (arr[i]==ele) {
                System.out.println("Element found");
                return i;
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

        int ans=LinearSearch(arr,ele,n);

        System.out.println(ans);
    }
}