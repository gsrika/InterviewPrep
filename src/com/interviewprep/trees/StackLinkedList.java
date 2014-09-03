package com.interviewprep.trees;
import javax.management.RuntimeErrorException;


public class StackLinkedList <T>{
	
	private class Node {
		private T  data;
		private Node nextNode;		
	}
	
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void push(T data)  {
		if(head == null) {
			head = new Node();
			head.data = data;
			head.nextNode = null;

		}
		else {
			Node tempNode = new Node();
			tempNode.data = data;
			tempNode.nextNode = head;
			head = tempNode;
		}
	}
	
	public T pop() {
		if (head == null) {
			throw new RuntimeException("Stack is Empty");
		}
		else {
			T value = head.data;
			head = head.nextNode;
			return value;
		}
	}
	

	public T  peek() {
		if(head == null) {
			throw new RuntimeException("Stack is Empty");
		}
		else {
			return head.data;
		}
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void main (String args[]) {
		StackLinkedList<Integer> st = new StackLinkedList<Integer>();	
		st.push(1);
		st.push(2);
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		st.push(4);
	}
	

}
