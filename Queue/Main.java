package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		//初始化队列
		Queue<Integer> q = new LinkedList();
		System.out.println("the first element is " +q.peek());
		q.offer(5);
		q.offer(13);
		q.offer(8);
		q.offer(6);
		
		q.poll();
		System.out.println("the is elment is " + q.peek());
		System.out.println("the size is :"+ q.size());
	}
}
