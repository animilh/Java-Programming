package lesson20;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("1.Ana");
		stack.push("2.Deni");
		stack.push("3.Ivo");
		stack.push("4.Kalincho");
		stack.push("5.Emo");

		System.out.println("Top : " + stack.peek());
		while (stack.size() > 0) {
			String person = stack.pop();
			System.out.println(person);
		}
	}
}
