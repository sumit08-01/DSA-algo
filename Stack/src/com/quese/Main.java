package com.quese;

public class Main {

	public static void main(String[] args) {

		Quese myquese = new Quese(3);

//		myquese.getFirst();
//		myquese.getLast();
//		myquese.getLength();
//
		myquese.enQueue(5);
//
//		myquese.getFirst();
//		myquese.getLast();
//		myquese.getLength();

		myquese.printQueue();

//--------------------------
		myquese.deQueue();
		myquese.printQueue();

	}

}
