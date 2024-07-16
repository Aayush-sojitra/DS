
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
        l1.push(25);
        l1.push(12);
        l1.push(36);
        l1.display();
        l1.pop();
        l1.pop();
        l1.display();
    }
}