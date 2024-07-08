import java.util.Scanner;
class LinkedListDemo{
    class Node{
        int info;
        Node link;

        public Node(int info){
            this.info=info;
            link=null;
        }
    }
    public Node first=null;
    
    public void insertAtFirst(int data){
        Node newNode=new Node(data);

        if (first==null) {
            first=newNode;
            System.out.println("After Insert At First:");
            displayLinkedList();

        }

        Node temp=first;
        first=newNode;
        first.link=temp;
        System.out.println("After Insert At First:");
        displayLinkedList();
    }

    public void insertAtLast(int data){
        Node newNode=new Node(data);

        if (first==null) {
            first=newNode;
            System.out.println("After Insert At End:");
            displayLinkedList();

        }
        Node last=first;
        while (last.link!=null) {
            last=last.link;
        }
        last.link=newNode;
        System.out.println("After Insert At End:");
            displayLinkedList();

    }

    public void insertInOrdr(int data){
        Node newNode=new Node(data);
        if (first==null && newNode.info<=first.info) {
            newNode.link=first;
            first=newNode;
            System.out.println("After Insert in Order:");
            displayLinkedList();
            return;
        }
        Node save=first;
        while (save.link!=null && newNode.info>=save.link.info) {
            save=save.link;
        }
        newNode.link=save.link;
        save.link=newNode;
        System.out.println("After Insert in Order:");
        displayLinkedList();
    }

    public void deleteElement(int key){
        if (first==null) {
            System.out.println("Empty LinkedList");
            return;
        }
        Node save=first;
        while (save.link!=null && save.link.info!=key) {
            save=save.link;
        }
        if (save.link==null) {
            System.out.println("Not Found");
            return;
        }
        save.link=save.link.link;
        System.out.println("After Deleting a Node:");
        displayLinkedList();
    }

    public LinkedListDemo copyLinkedList(){
        if (first==null) {
            System.out.println("LinkedList is Empty");
            return null;
        }
        Node save=first;
        LinkedListDemo newList=new LinkedListDemo();
        newList.first=new Node(save.info);
        Node tempSave=newList.first;

        save=save.link;
        while (save!=null) {
            tempSave=new Node(save.info);
            tempSave=tempSave.link;
            save=save.link;
        }
        return newList;
    }

    public int countNode(){
        int count=0;
        if (first==null) {
            count++;
            return count;
        }
        Node temp=first;
        while (temp!=null) {
            count++;
            temp=temp.link;
        }
        return count;
    }

    public void displayLinkedList(){
        if (first == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp=first;
        while (temp!=null) {
            System.out.print(temp.info);
            if (temp.link!= null) {
                System.out.print("->");
            }
            temp=temp.link;
        }
        System.out.println();
    }
   
}
public class Prac {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedListDemo l1=new LinkedListDemo();
        System.out.println("Number of Nodes:"+l1.countNode());
        int choice;

        System.out.println("Enter => \n1 to insertNode at first\n" + //
        "2 to insertNode at last\n" + //
        "3 to insertNode in order\n" + //
        "4 to delete a Node\n" + //
        "5 to copy LinkedList\n" + //
        "6 to display LinkedList\n" + //
        "-1 to Exit\n");

        choice=sc.nextInt();

        do{
            
        
            switch (choice) {
            case 1:
                System.out.println("Enter Element to Insert");
                int n1=sc.nextInt();
                l1.insertAtFirst(n1);
                break;

            case 2:
                System.out.println("Enter Element to Insert");
                int n2=sc.nextInt();
                l1.insertAtLast(n2);
                break;

            case 3:
                System.out.println("Enter Element to Insert");
                int n3=sc.nextInt();
                l1.insertInOrdr(n3);
                break;
            
            case 4:
                System.out.println("Enter element to Delete");
                int d1=sc.nextInt();
                l1.deleteElement(d1);
                break;

            case 5:
                LinkedListDemo c1=l1.copyLinkedList();
                System.out.println("Copied LinkedList:");
                c1.displayLinkedList();
                break;

            case 6:
                l1.displayLinkedList();
                break;

            case -1:
                break;
        
            default:
                System.out.println("Enter valid Input:");
                break;
            }
        }while(choice>=1);
    }
}
