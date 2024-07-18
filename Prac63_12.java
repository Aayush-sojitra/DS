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

    public void display(){
		Node temp=first;
			while(temp != null){
				System.out.print(" "+temp.info);
				temp = temp.link;
			}
			System.out.println();
	}

    public void  copyLL(){
        if (first==null) {
            System.out.println("LinkedList is Null");
            return;
        }
        Node newNode=new Node(first.info);

        Node begin=newNode;
        Node save=first;
        Node n1=new Node(save.info);

        while (save.link!=null) {
            Node pred=newNode;
            save=save.link;

            
            pred.link=n1;
        }

        if (n1.link==null) {
            return ;
        }
    }
}
public class Prac63 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedListDemo l1=new LinkedListDemo();

        l1.insertAtFirst(30);
        l1.insertAtFirst(20);
        l1.insertAtFirst(10);
        l1.insertAtFirst(5);
        l1.display();

        LinkedListDemo l2=new LinkedListDemo();
        l2.copyLL();
        
         
    }
}
