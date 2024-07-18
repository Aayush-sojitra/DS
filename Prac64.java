import java.util.Scanner;

class LinkedListDemo{
    class Node{
        int info;
        Node link;
        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
	Node first = null;
	public void insertAtFirst(int data){
		Node newNode = new Node(data);
		if(first == null){
			first = newNode;
		}
		else{
			newNode.link = first;
			first = newNode;
		}
	}

    public void insertAtLast(int data){
		Node newNode = new Node(data);
		if(first == null){
			first = newNode;
		}
		else{
			Node temp = first;
			while(temp.link!=null){
				temp = temp.link;
			}
			temp.link = newNode;
		}
	}

    public void display(){
		Node temp=first;
			while(temp != null){
				System.out.print(" "+temp.info);
				temp = temp.link;
			}
			System.out.println();
	}

    public void  ReverceLL(LinkedListDemo l2){
        if (first==null) {
            System.out.println("LinkedList is Null");
            return;
        }
 
        l2.insertAtLast(first.info);
        Node save=first;

        while (save.link!=null) {
            save=save.link;
            // l2.insertAtFirst(data);
            l2.insertAtFirst(save.info);
        }
        System.out.println("reverce LinkedList :");
        l2.display();
    }
}
public class Prac64 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedListDemo l1=new LinkedListDemo();
        LinkedListDemo l2=new LinkedListDemo();

        l1.insertAtFirst(30);
        l1.insertAtFirst(20);
        l1.insertAtFirst(10);
        l1.insertAtFirst(5);
        l1.display();
        l1.ReverceLL(l2);
        
         
    }
}
