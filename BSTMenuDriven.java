import java.util.Scanner;

class BSTNode {
    int data;
    BSTNode left, right;

    public BSTNode(int item) {
        data = item;
        left = right = null;
    }
}

class BST {
    private BSTNode root;

  
    public BST() {
        root = null;
    }


    public void insert(int data) {
        BSTNode newNode = new BSTNode(data);
        if (root == null) {
            root = newNode;
            return;
        }

        BSTNode current = root;
        BSTNode parent = null;
        while (true) {
            parent = current;
            if (data < current.data) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    public boolean search(int key) {
        BSTNode current = root;
        while (current != null) {
            if (key == current.data) {
                return true;
            } else if (key < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

 
    public void delete(int key) {
        BSTNode parent = null;
        BSTNode current = root;

 
        while (current != null && current.data != key) {
            parent = current;
            if (key < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (current == null) {
            System.out.println("Node not found!");
            return;
        }

     
        if (current.left == null || current.right == null) {
            BSTNode newCurrent = (current.left != null) ? current.left : current.right;

            if (parent == null) {
                root = newCurrent;
            } else if (parent.left == current) {
                parent.left = newCurrent;
            } else {
                parent.right = newCurrent;
            }
        }

      
        else {
            BSTNode successor = getSuccessor(current);

            int temp = successor.data;
            delete(successor.data);
            current.data = temp; 
        }
    }

   
    private BSTNode getSuccessor(BSTNode node) {
        if (node == null || node.right == null) {
            return null;
        }
        BSTNode successor = node.right;
        while (successor.left != null) {
            successor = successor.left;
        }
        return successor;
    }


    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(BSTNode node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.data + " ");
            inorderRec(node.right);
        }
    }
}

public class BSTMenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        int choice, value;

        do {
            System.out.println("\nBinary Search Tree Operations Menu:");
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Search a node");
            System.out.println("4. Display in-order traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    bst.insert(value);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    bst.delete(value);
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    if (bst.search(value)) {
                        System.out.println("Node found!");
                    } else {
                        System.out.println("Node not found!");
                    }
                    break;
                case 4:
                    System.out.println("In-order traversal of the BST:");
                    bst.inorder();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        } while (choice != 5);

        sc.close();
    }
}