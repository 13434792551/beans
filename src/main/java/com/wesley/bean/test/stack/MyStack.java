package com.wesley.bean.test.stack;

	public class MyStack {
		private int maxSize;//栈的最大容量
		private char[] ch;	//栈的数据
		private int top;	//栈头标记

		public MyStack(int s) {
			maxSize = s;
			ch = new char[s];
			top = -1;
		}

		public void push(char c) {//入栈
			ch[++top] = c;
		}

		public char pop() {//出栈
			return ch[top--];
		}

		public char peek() {
			return ch[top];
		}

		public boolean isEmpty() {
			return top == -1;
		}

		public boolean isFull() {
			return top == (maxSize - 1);
		}

		public int size() {
			return top + 1;
		}

		public char get(int index) {
			return ch[index];
		}

		public void display(String str) {
			System.out.print(str);
			System.out.print(" Stack (bottom-->top): ");
			for (int i = 0; i < size(); i++) {
				System.out.print(get(i)+" ");
			}
			System.out.println();
		}
}
