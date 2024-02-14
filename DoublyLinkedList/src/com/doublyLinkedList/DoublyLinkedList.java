package com.doublyLinkedList;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	private int length;

	public DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	class Node {
		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
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

// Print Method in DoublyLinkedList
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

//Append Method in the Doubly linked List
	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	}

//Remove Last Node from the Doubly Linked List
	public Node removeLast() {
		if (length == 0) { // if lenght is 0,mean it has no node
			return null;
		}
		Node temp = tail;
		if (length == 1) { // mean list has only one element
			head = null;
			tail = null;
		} else { // more than one element
			tail = temp.prev;
			tail.next = null;
			temp.prev = null;
		}
		length--;
		return temp;
	}

//PrePend Node in the List(at Starting)
	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		length++;
	}

//Remove First Node form the list
	public Node removeFirst() {
		if (length == 0) {
			return null;
		}
		Node temp = head;
		if (length == 1) { // mean list has only one element
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.prev = null;
			temp.next = null;
		}
		length--;
		return temp;
	}

}