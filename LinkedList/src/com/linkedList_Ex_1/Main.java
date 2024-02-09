package com.linkedList_Ex_1;

import java.util.Set;

public class Main {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList(1);

		linkedList.appendInList(2);
		linkedList.appendInList(3);
		linkedList.appendInList(4);

//		linkedList.getHead();
//		linkedList.getTail();
//		linkedList.getLength();

//		System.out.println("Print The list");
//		linkedList.printList();
		
//		System.out.println("The Removed Value is : " + linkedList.removeLast().value); // 2
//		linkedList.printList(); // 1 ->value
//		linkedList.getLength(); // 1
//
//		System.out.println("The Removed Value is : " + linkedList.removeLast().value); // 1
//		linkedList.printList(); // nothing
//		linkedList.getLength(); // 0
		
//		linkedList.prepend(3);
//		linkedList.printList(); // 3 -> 1 -> 2
//		
//		System.out.println("Remove first Item from list : " + linkedList.removeFirst().value);
//		System.out.println("Remove first Item from list : " + linkedList.removeFirst().value);
//		System.out.println("Remove first Item from list : " + linkedList.removeFirst().value);
//		System.out.println("Remove first Item from list : " + linkedList.removeFirst());

		linkedList.printList(); //1->2->3->4
		
//		System.out.println(linkedList.get(2).value);
//		linkedList.printList(); //1->2->3->4
		
//		linkedList.set(1, 5);
//		linkedList.printList(); //1->5->3->4

//		linkedList.insert(1, 7);
//		System.out.println();
//		linkedList.printList(); //1->7->2->3->4
		
		
//		System.out.println();
//		linkedList.remove(2); //1->2->3->4
//		System.out.println(linkedList.remove(1).value);
		
		System.out.println();
		linkedList.reverse();
		linkedList.printList(); //4->4->3->1


	}

}
