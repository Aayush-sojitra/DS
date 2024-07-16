
import java.util.Scanner;

class LinkedListDemo{
    class Node{
        int info;
        Node link; 

        public Node(int data){
            info=data;
            link=null;
        }
    }
    Node first=null;

    public void push(int x){
        Node newNode = new Node(x);
		if(first == null){
			first = newNode;
		}
		else{
			newNode.link = first;
			first = newNode;
		}
	}

    public int pop(){
		if(first == null){
			System.out.println("Underflow");
            
		}
        else{
            first=first.link;
        }
        return first.info;
    }
    
    public void display(){
		Node temp=first;
			while(temp != null){
				System.out.print(" "+temp.info);
				temp = temp.link;
			}
			System.out.println();
	}
}

public class Prac60 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedListDemo l1=new LinkedListDemo();
        System.out.println("which method want you call");
        System.out.println("for push 1, for pop 2, for display 3");

        System.out.println("enter no for call method");
        int m = sc.nextInt();

        while(true){
            switch (m) {
                case 1:
                    System.out.println("enter element to add");
                    int p = sc.nextInt();
                    l1.push(p);
                    break;
                case 2: System.out.println("delete element from stack");
                        int x = l1.pop();
                        System.out.println(x+" is remove from stack");
                    
                    break;
                
                case 3: System.out.println("diplay all element of stack");
                        l1.display();
                    
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Not valid Number");
                    break;
                }
                System.out.println("Enter");
                m=sc.nextInt();
        }
                
    }
}
