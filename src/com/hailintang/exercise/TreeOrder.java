package com.hailintang.exercise;

import java.util.Stack;

/**
 * @Description  树的前序，中序，后序遍历。递归和非递归
 * @Author Hailin.Tang
 * @Date 2020-02-11 16:45
 */
public class TreeOrder {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }
    public void preOrderRecur(Node head){
        if(head == null){
            return;
        }
        System.out.println(head.value);
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }
    public void inOrderRecur(Node head){
        if(head == null){
            return;
        }
        preOrderRecur(head.left);
        System.out.println(head.value);
        preOrderRecur(head.right);
    }
    public void posOrderRecur(Node head){
        if(head == null){
            return;
        }
        preOrderRecur(head.left);
        preOrderRecur(head.right);
        System.out.println(head.value);
    }

    public void preOrderTraversal(Node head){
        if(head == null){
            return;
        }
        Node cur = head;
        Stack<Node> stack = new Stack<>();
        stack.push(cur);
        while(!stack.isEmpty()){
            cur = stack.pop();
            System.out.println(cur.value);
            if(cur.right!=null){
                stack.push(cur.right);
            }
            if(cur.left!=null){
                stack.push(cur.left);
            }
        }
    }
    public void inOrderTraversal(Node head){
        if(head == null){
            return;
        }
        Node cur = head;
        Stack<Node> stack = new Stack<>();
        while(!stack.isEmpty()||cur!=null){
            if(cur !=null){
                stack.push(cur);
                cur = cur.left;
            }else{
                Node pop = stack.pop();
                System.out.println(pop.value);
                cur = cur.right;
            }
        }

    }
    public void posOrderTraversal(Node head){
        if(head == null){
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        Node cur = head;
        stack1.push(cur);
        while(!stack1.isEmpty()){
            cur = stack1.pop();
            stack2.push(cur);
            if(cur.left!=null){
                stack1.push(cur.left);
            }
            if(cur.right!=null){
                stack1.push(cur.right);
            }
        }

        while(!stack2.isEmpty()){
            Node pop = stack2.pop();
            System.out.println(pop.value);
        }

    }
}
