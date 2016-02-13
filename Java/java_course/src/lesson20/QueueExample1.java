package lesson20;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {
	public static void main(String[] args) {
		Queue<String> que=new LinkedList<String>();
		que.offer("1.Aaaaa");
		que.offer("2.Bbbbb");
		que.offer("3.Ccccc");
		que.offer("4.Ddddd");
		
		System.out.println("Top : "+que.peek());
		while(que.size()>0){
			String num=que.poll();
			System.out.println(num);
		}
	}

}
