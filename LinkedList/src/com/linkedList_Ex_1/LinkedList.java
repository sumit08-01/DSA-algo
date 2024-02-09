package com.linkedList_Ex_1;

public class LinkedList {

	private Node head;
	private Node tail;
	private int length;

//Node class --> Inner
	class Node {
		int value;
		Node next;

		// Constructor of Node Class
		Node(int value) {
			this.value = value;
		}
	}

//constructor of the LinkedList Class
	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

//Print Method in LinkedList
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

//Append Method in Linked List
	public void appendInList(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

//Remove Item from the linked List 
	public Node removeLast() {
		if (length == 0) {
			return null;
		}
		Node temp = head;
		Node pre = head;
		while (temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		tail = pre;
		tail.next = null;
		length--;
		if (length == 0) { // this "if" checks after the decrement, the length of LL in become is zero or
							// not
			head = null;
			tail = null;
		}
		return temp;

	}

//PrePend item in the list
	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

//Remove First item in the list
	public Node removeFirst() {
		if (length == 0) {
			return null;
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			length--;
			if (length == 0) {
				tail = null;
			}
			return temp;
		}
	}
	
// Get a node of a particular index, but not remove the node
	public Node get(int index) {
		if(index < 0 || index >= length) {
			return null;
		}
		Node temp = head;
		for(int i=0; i<index ; i ++) {
			temp = temp.next;
		}
		return temp;
		
	}
	
// Set value at a particular index
	public boolean set(int index, int value) {
		Node temp = get(index);
		if(temp != null) {
			temp.value = value;
			return true;
		}
		return false;
		
	}
	
// Insert a Node at a particular index with value
	public boolean insert(int index, int value) {
		if(index < 0 || index > length) {
			return false;
		}
		if(index == 0) {
			prepend(value);
			return true;
		}
		if(index == length) {
			appendInList(value);
			return true;
		}
		Node newNode = new Node(value);
		Node temp = get(index-1);
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
		return true;
	}
	
// remove Node at a particular index
	public Node remove(int index) {
		if(index < 0 || index > length) {
			return null;
		}
		if(index == 0) {
			removeFirst();
		}
		if(index ==length -1) {
			removeLast();
		}
		Node prev = get(index -1);
		Node temp = prev.next;
		prev.next = temp.next;
		temp.next = null;
		length--;
		return temp;
		
	}

//Reverser a linked List 
	public void reverse(){
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.next;
		Node before = null;
		for(int i=0; i<length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}
	
	
	public void getHead() {
		System.out.println("Head : " + head.value);
	}

	public void getTail() {
		System.out.println("Tail : " + tail.value);
	}

	public void getLength() {
		System.out.println("Length : " + length);
	}

}
