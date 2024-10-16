package org.example.tree;

public class TreeMain {
    public static void main(String[] args) {
        Node root = null;
        for (int i = 1; i < 10; i++) {
             root = insertElement((int) (Math.random() * 10), root);
        }
        inorder(root);
    }

    private static Node insertElement(int value, Node node) {
        if (node == null)
            return new Node(value, null, null);
        else {
            if (node.value < value) {
                if (node.rightNode == null)
                    node.rightNode = new Node(value, null, null);
                else
                    insertElement(value, node.rightNode);
            } else {
                if (node.leftNode == null)
                    node.leftNode = new Node(value, null, null);
                else
                    insertElement(value, node.leftNode);
            }
        }
        return node;
    }

    private static void inorder(Node node) {
        if (node != null) {
            inorder(node.leftNode);
            System.out.println(node.value);
            inorder(node.rightNode);
        }
    }
}
