package com.sachin;


public class LinkedList{
	private Node head;
	private Node tail;
	private int size;
	public LinkedList(){
		this.size = 0;
	}

	//this will insert new element at first
	public void insertAtFirst(int value){
		Node node = new Node(value);
		node.next = head ;
		head = node;

		if(tail == null){
			tail = head ;
		}
		 size++ ;
	}

	//to display the linkedList
	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.value + "->");
			temp = temp.next;
		}
		System.out.println("END");
	}

	//for each node below are the things we need
	private class Node{
		private int value;
		private Node next;
		public Node(int value){
			this.value = value;
		}
		public Node(int value , Node next){
			this.value = value ;
			this.next = next ;
		}
	}
}


