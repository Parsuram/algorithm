package com.algo.array;

import java.util.Stack;

public class Quack {
	int size;
	Stack<Integer> s1, s2, s3;
	public Quack() {
		s1 = new Stack<>();
		s2 = new Stack<>();
		s3 = new Stack<>();
		size = 0;
	}
	public void push(int i) {
		s1.push(i);
		s2.push(i);
		size++;
	}
	public int pop() {
		if(size >0) {
			size--;
			if(!s2.isEmpty())
				s2.pop();
			return s1.pop();
		} else {
			s1.clear();
			s2.clear();
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public int pull() {
		if(size >0) {
			size--;
			if(s3.isEmpty()) 
				while(!s2.isEmpty())
					s3.push(s2.pop());
			return s3.pop();
		} else {
			s1.clear();
			s2.clear();
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public static void main(String[] args) {
		Quack q = new Quack();
		q.push(1);
		q.push(2);
		q.push(3);
		System.out.println(q.pop());
		System.out.println(q.pull());
	}
	

}
