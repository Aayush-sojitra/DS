class LinkedListDemo {
    class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    public Node first = null;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);

        Node temp = first;
        first = newNode;
        first.link = temp;
        System.out.println("Ater inserted at First ->");
        displayLinkedList();
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            System.out.println("After inserted at End ->");
            displayLinkedList();
            return;
        }
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link = newNode;
        System.out.println("After inserted at End ->");
        displayLinkedList();
    }

    public void insertInOrdr(int data) {
        Node newNode = new Node(data);

        if (first == null || newNode.info <= first.info) {
            newNode.link = first;
            first = newNode;
            displayLinkedList();
            System.out.println("After inserted in order ->");
            return;
        }
        Node save = first;
        while (save.link != null && newNode.info >= save.link.info) {
            save = save.link;
        }
        newNode.link = save.link;
        save.link = newNode;
        System.out.println("After inserted in order ->");
        displayLinkedList();
    }

    public void deleteElement(int key) {
        if (first == null) {
            System.out.println("Empty");
            return;
        }
        Node save = first;
        if (first.info == key) {
            first = first.link;
            System.out.println("After deleting a node ->");
            displayLinkedList();
            return;
        }
        while (save.link != null && save.link.info != key) {
            save = save.link;
        }
        if (save.link == null) {
            System.out.println("Node Not Found");
            return;
        }
        save.link = save.link.link;
        System.out.println("After deleting a node ->");
        displayLinkedList();
    }

    public LinkedListDemo copyLinkedList() {
        if (first == null) {
            System.out.println("Linked List is Empty");
            return null;
        }
        Node save = first;
        LinkedListDemo copyLL = new LinkedListDemo();
        copyLL.first = new Node(save.info);
        Node saveCopy = copyLL.first;

        save = save.link;
        while (save != null) {
            saveCopy.link = new Node(save.info);
            saveCopy = saveCopy.link;
            save = save.link;
        }
        return copyLL;
    }

    public int countNode() {
        int count = 0;
        if (first == null) {
            count = 0;
            return count;
        }
        Node save = first;
        while (save != null) {
            count++;
            save = save.link;
        }
        return count;
    }

    public void displayLinkedList() {
        if (first == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node save = first;
        while (save != null) {
            System.out.print(save.info);
            if (save.link != null) {
                System.out.print("->");
            }
            save = save.link;
        }
        System.out.println();
    }
}
public class A_56_57_58 {
    public static void main(String[] args) {
        LinkedListDemo l1 = new LinkedListDemo();
        System.out.println("Number Of Nodes = "+l1.countNode());
        Scanner sc = new Scanner(System.in);
        int userChoice;
        System.out.println("Enter => \n1 to insertNode at first\n" + //
                    "2 to insertNode at last\n" + //
                    "3 to insertNode in order\n" + //
                    "4 to delete a Node\n" + //
                    "5 to copy LinkedList\n" + //
                    "6 to display LinkedList\n" + //
                    "-1 to Exit\n");
        do {
            System.out.print("Choice : ");
            userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.print("Enter Element To Insert : ");
                    int n=sc.nextInt();
                    l1.insertAtFirst(n);
                    break;
                case 2:
                    System.out.print("Enter Element To Insert : ");
                    int m=sc.nextInt();
                    l1.insertAtEnd(m);
                    break;
                case 3:
                    System.out.print("Enter Element To Insert : ");
                    int x=sc.nextInt();
                    l1.insertInOrdr(x);
                    break;
                case 4:
                    System.out.print("Enter Element To Delete : ");
                    int delete=sc.nextInt();
                    l1.deleteElement(delete);
                    break;
                case 5:
                    LinkedListDemo copy=l1.copyLinkedList();
                    System.out.println("Copy Of LinkedList : ");
                    copy.displayLinkedList();  
                    break;
                case 6:
                    l1.displayLinkedList();
                    break;
                default:
                    break;
            }
        } while (userChoice >= 1 && userChoice <= 6);
    }

}
