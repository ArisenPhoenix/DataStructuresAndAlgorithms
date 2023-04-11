package org.example;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class BinarySearchTree {
//    I am unashamed to say that this BinarySearchTree Was essentially copy and pasted from the class
//    It was necessary to repurpose it to fit the requirements given. It's not a simple list of integers that we're
//    working with.
    static class Node {
        Map.Entry<String, String> data;
        Node leftChild;
        Node rightChild;
        Node(Map.Entry<String, String> data) {
            this.data = data;
            leftChild = rightChild = null;
        }
    }

    Node root;
    public void insert(Map.Entry<String, String> data) {
        root = insertNode(root, data);
    }

    public Node insertNode(Node node, Map.Entry<String, String> data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }
        String key = data.getKey();
        if (key.compareToIgnoreCase(node.data.getKey()) < 0) {
            node.leftChild = insertNode(node.leftChild, data);
        } else if (key.compareToIgnoreCase(node.data.getKey()) >= 0) {
            node.rightChild = insertNode(node.rightChild, data);
        }
        return node;
    }
    public void display() {
//      This was used for testing the Binary Tree. When I realized that the Tree Map was already sorted therefore
//      unnecessary to even have a left side as the tree is not self-balancing.
        Node current = root;
        int count = 0;
        while (current.rightChild != null) {
            System.out.print(count);
            System.out.println(" " + current.data.getValue());
            current = current.rightChild;
            count++;
        }
    }
    public Node find(String key) {
        if (Objects.equals(key, "" ) || key == null){
            return null;
        }
        return findNode(root, key);
    }
    public Node findNode(Node node, String key) {
        if (key.compareToIgnoreCase(node.data.getKey()) == 0) {
            return node;
        }
        if (key.compareToIgnoreCase(node.data.getKey()) < 0) {
            return findNode(node.leftChild, key);
        } else if (key.compareToIgnoreCase(node.data.getKey()) >= 0) {
            return findNode(node.rightChild, key);
        } else {
            return null;
        }
    }
    public static BinarySearchTree create(TreeMap<String, String> map) {
        System.out.println(map);
        return new BinarySearchTree();
    }
}

