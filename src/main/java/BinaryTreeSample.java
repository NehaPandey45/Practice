import java.io.PrintStream;

class Node{
    int data;
    Node left, right, parent;


    public Node(int data) {
        this.data = data;
        this.left = this.right = this.parent = null;
    }
}

public class BinaryTreeSample{

    Node head;

    private Node insert(Node node, int data){
        Node temp = null;

        if(node == null){
            return new Node(data);
        }else{

            if(data <= node.data){
                temp = insert(node.left, data);
                node.left = temp;
                temp.parent = node;
            }else{
                temp = insert(node.right, data);
                node.right = temp;
                temp.parent = node;
            }
        }

        return node;
    }

    private static void traverseTree(StringBuilder sb, Node node){
        if(node != null){
            sb.append(node.data);
            sb.append("\n");
            traverseTree(sb, node.left);
            traverseTree(sb, node.right);
        }
    }

    private static void print( Node root){
        StringBuilder sb = new StringBuilder();
        traverseTree(sb,root);
        System.out.println(sb.toString());
    }

    private  Node inOrderSuccessor(Node node){
        if(node.right != null){
            return minValue(node.right);
        }

        Node parent = node.parent;

        while(parent != null && node == parent.right){
            node = parent;
            parent = parent.parent;
        }
        return parent;
    }

    private static Node minValue(Node n){
        Node current = n;

        while(current.left != null){
            current = current.left;
        }

        return current;
    }

    public static void main(String args[]){
        BinaryTreeSample binaryTreeSample = new BinaryTreeSample();
        Node root =null;
        root = binaryTreeSample.insert(root, 20);
        root = binaryTreeSample.insert(root, 8);
        root = binaryTreeSample.insert(root, 22);
        root = binaryTreeSample.insert(root, 4);
        root = binaryTreeSample.insert(root, 12);
        root = binaryTreeSample.insert(root, 10);
        root = binaryTreeSample.insert(root, 14);

        print(root);
        Node temp =null;
        Node suc = null;

        temp = root.left.right.left;
        suc = binaryTreeSample.inOrderSuccessor(temp);
        if (suc != null) {
            System.out.println(
                    "Inorder successor of "
                            + temp.data + " is " + suc.data);
        }
        else {
            System.out.println(
                    "Inorder successor does not exist");
        }
    }
}