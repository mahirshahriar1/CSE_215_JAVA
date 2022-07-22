package Stack;

public class Stack {
	
	private int stackSize;
	private char[] stackArr;
	private int top;
	
	public Stack(int size) {
		stackSize = size;
		stackArr = new char[stackSize];
		top = -1;
	}
	
	public void push(char item) 
	{
		if(top==stackSize-1)
			System.out.println("Stack is full");		
		else
			stackArr[++top] = item;
	}
	public char pop() 
	{
		char item = stackArr[top];
		//stackArr[top] = '\0';
		top--;
		return item;
	}
	
	public char peek() {
		return stackArr[top];
	}
	
	public boolean isStackEmpty() {
		return (top == -1);
	}
	
	public boolean isStackFull() {
		return (top == stackSize - 1);
	}
}
