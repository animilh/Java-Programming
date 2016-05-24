package com.softacad.homework;

public class SequenceDemo {

	public static void main(String[] args) {
		ISequence<Integer> stack = new Stack<>();
		// stack.pop();
		stack.push(3);
		stack.push(4);
		stack.push(65);
		stack.push(123);
		stack.push(35);
		System.out.println(stack);
		System.out.println("Stack size : " + stack.getSize());
		System.out.println("element at index 3 : " + stack.get(3));
		System.out.println("First pop() : " + stack.pop());
		System.out.println("Second pop() : " + stack.pop());
		System.out.println(stack);

		ISequence<String> queue = new Queue<>();
		queue.push("Shweps");
		queue.push("Fanta");
		queue.push("Tonik");
		queue.push("Tea");
		System.out.println(queue);
		System.out.println("Queue size : " + queue.getSize());
		System.out.println("element at index 2 : " + queue.get(2));
		System.out.println("First pop() : " + queue.pop());
		System.out.println("Second pop() : " + queue.pop());
		System.out.println(queue);
		queue.push("Soda");
		queue.push("Cola");
		System.out.println(queue);
		System.out.println("Third pop() : " + queue.pop());
	}

}
