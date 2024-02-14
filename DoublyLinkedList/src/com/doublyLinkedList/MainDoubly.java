package com.doublyLinkedList;

public class MainDoubly {

	public static void main(String[] args) {

		DoublyLinkedList doublyLL = new DoublyLinkedList(7);
		doublyLL.append(4);
		doublyLL.append(2);
		doublyLL.append(9);

		doublyLL.getHead();
		doublyLL.getTail();
		doublyLL.getLength();

		doublyLL.printList();
		System.out.println();

//		System.out.println("Last Node from the Doubly Linked List is : " + doublyLL.removeLast().value);
//
//		doublyLL.printList();
//		doublyLL.getLength();
//		System.out.println("Last Node from the Doubly Linked List is : " + doublyLL.removeLast().value);
//		System.out.println("Last Node from the Doubly Linked List is : " + doublyLL.removeLast());

//Prepend
		doublyLL.prepend(5);
		doublyLL.printList();

		System.out.println("First Node from the Doubly Linked List is : " + doublyLL.removeFirst().value);
		System.out.println("First Node from the Doubly Linked List is : " + doublyLL.removeFirst().value);

	}

}
