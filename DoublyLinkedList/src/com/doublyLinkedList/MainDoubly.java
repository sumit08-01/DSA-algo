package com.doublyLinkedList;

public class MainDoubly {

	public static void main(String[] args) {

		DoublyLinkedList doublyLL = new DoublyLinkedList(7);
		doublyLL.append(4);
		doublyLL.append(2);
		doublyLL.append(9);
		doublyLL.append(45);

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
//		doublyLL.prepend(5);
//		doublyLL.printList();

// Remove First Node from the DLL
//		System.out.println("First Node from the Doubly Linked List is : " + doublyLL.removeFirst().value);
//		System.out.println("First Node from the Doubly Linked List is : " + doublyLL.removeFirst().value);

//Get Node at a particular index
//		System.out.println("Node at a particular index : " + doublyLL.get(3).value);

// Set a Node value to a particular index
//		doublyLL.set(2, 3);
//		doublyLL.printList();
//		System.out.println();

//Set a Node at a Particular index
//		doublyLL.insert(3, 65);
//		doublyLL.getHead();
//		doublyLL.getTail();
//		doublyLL.getLength();
//		doublyLL.printList();

//Remove a Node at a particular Index
		System.out.println("Removing Node at a particular index and value is : " + doublyLL.remove(2).value);
		doublyLL.getLength();
		doublyLL.printList();

	}

}
