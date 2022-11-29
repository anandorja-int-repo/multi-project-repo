package com.anandorja.learn.headfirstjava;

public class Tree {
        static class Node {
            int value;
            Node left, right;

            Node(int value){
                this.value = value;
                left = null;
                right = null;
            }
        }

        public int insert(Node node, int value) {
            if (value < node.value) {
                if (node.left != null) { insert(node.left, value);
                } else
                {
                    node.left = new Node(value);
                }
            } else if (value > node.value) {
                if (node.right != null) {
                    insert(node.right, value);
                } else {
                    node.right = new Node(value);
                }
            }
            return value;
        }
        public Node traverseInOrder(Node node) {
            if (node != null) {
                traverseInOrder(node.left);
                traverseInOrder(node.right);
            }
            return node;
        }
}
