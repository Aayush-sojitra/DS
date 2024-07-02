
import java.util.Scanner;

class StackDemo{
    int top=-1;
    int a[];

    public StackDemo(int n) {
        a=new int[n];
    }

    void push(int x){
        if(top>=a.length-1){
            System.out.println("Stack overflow");
        }else{
            top++;
            a[top]=x;
        }
    }

    int peep(int i){
        if(top-i+1==-1){
            System.out.println("Stack underflow");
            
        }
            return a[top-i+1];
        
    }
    
    int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            
        }
            top--;
            return a[top+1];
        
    }

    void change(int x,int i){
        if(top-i+1==-1){
            System.out.println("Stack overflow");
        }
            a[top-i+1]=x;
            return;
        
    }


    void display(){
        for(int i=top;i>=0;i--){
            System.out.println(a[i]);
        }
    }


    
}
public class Prac38 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int n=sc.nextInt();
        StackDemo s=new StackDemo(n);
        int num=0;
        
        while (true) { 
            System.out.println("Enter 1 for push, 2 for pop, 3 for peep, 4 for change, 5 for display, 6 for end of program ");
            num=sc.nextInt();
            switch (num) {
                case 1:
                    int x=sc.nextInt();
                    s.push(x);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    System.out.println("Enter index");
                    int i=sc.nextInt();
                    s.peep(i);
                    break;

                case 4:
                    System.out.println("Enter index");
                    int in=sc.nextInt();
                    System.out.println("Enter newNum");
                    int newNum=sc.nextInt();
                    s.change(newNum, in);
                    break;

                case 5:
                    s.display();
                    break;

                case 6:
                    return;
                    

                default:
                    System.out.println("Invalid Number");
                    break;
            }
        }
    }
}