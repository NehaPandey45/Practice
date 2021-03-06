// Java program to find minimum
// value node in Binary Search Tree

// A binary tree node
class Node1 {

    int data;
    Node1 left, right, parent;

    Node1(int d)
    {
        data = d;
        left = right = parent = null;
    }
}

class BinaryTree {

    static Node1 head;

    /* Given a binary search tree and a number, 
     inserts a new node with the given number in 
     the correct place in the tree. Returns the new 
     root pointer which the caller should then use 
     (the standard trick to avoid using reference 
     parameters). */
    Node1 insert(Node1 node, int data)
    {
 
        /* 1. If the tree is empty, return a new,     
         single node */
        if (node == null) {
            return (new Node1(data));
        }
        else {

            Node1 temp = null;

            /* 2. Otherwise, recur down the tree */
            if (data <= node.data) {
                temp = insert(node.left, data);
                node.left = temp;
                temp.parent = node;
            }
            else {
                temp = insert(node.right, data);
                node.right = temp;
                temp.parent = node;
            }

            /* return the (unchanged) node pointer */
            return node;
        }
    }

    Node1 inOrderSuccessor(Node1 root, Node1 n)
    {

        // step 1 of the above algorithm
        if (n.right != null) {
            return minValue(n.right);
        }

        // step 2 of the above algorithm
        Node1 p = n.parent;
        while (p != null && n == p.right) {
            n = p;
            p = p.parent;
        }
        return p;
    }

    /* Given a non-empty binary search 
       tree, return the minimum data  
       value found in that tree. Note that 
       the entire tree does not need
       to be searched. */
    Node1 minValue(Node1 node)
    {
        Node1 current = node;

        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }



    // Driver program to test above functions
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        Node1 root = null, temp = null, suc = null, min = null;
        root = tree.insert(root, 20);
        root = tree.insert(root, 8);
        root = tree.insert(root, 22);
        root = tree.insert(root, 4);
        root = tree.insert(root, 12);
        root = tree.insert(root, 10);
        root = tree.insert(root, 14);

        temp = root.left.right.right;

        suc = tree.inOrderSuccessor(root, temp);
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

// This code has been contributed by Mayank Jaiswal