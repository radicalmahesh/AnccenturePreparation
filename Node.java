public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class TreeTraversal {

    public static void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left); // left child
        System.out.print(node.data + " "); // node
        inorder(node.right); // right child
    }

    public static void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " "); // node
        preorder(node.left); // left child
        preorder(node.right); // right child
    }

    public static void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left); // left child
        postorder(node.right); // right child
        System.out.print(node.data + " "); // node
    }

    public static int sumnode(Node node) {
        if (node == null) {
            return 0;
        }
        int leftSum = sumnode(node.left);
        int rightSum = sumnode(node.right); // Corrected from node.left to node.right
        return leftSum + rightSum + node.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Inorder Traversal:");
        inorder(root);
        System.out.println("");

        System.out.println("Preorder Traversal:");
        preorder(root);
        System.out.println("");

        System.out.println("Postorder Traversal:");
        postorder(root);
        System.out.println("");

        System.out.println("Sum of all nodes:");
        System.out.println(sumnode(root));
    }
}
