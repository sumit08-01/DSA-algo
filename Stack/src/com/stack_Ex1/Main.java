package com.stack_Ex1;

public class Main {

	public static void main(String[] args) {

		Stack s1 = new Stack(2);
//		s1.getTop();
//		s1.getHeight();
//		s1.printStack();

//		--------------------- Push ------
		s1.push(3);
		s1.push(5);
		s1.push(7);

		s1.getTop();
		s1.getHeight();
		s1.printStack();
		System.out.println("----------------");

//------------------------------POP----------
		s1.pop();
//		s1.getTop();
//		s1.getHeight();
		s1.printStack();
	}

}
