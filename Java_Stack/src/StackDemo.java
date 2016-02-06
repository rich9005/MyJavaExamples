class Stack {
	int[] items;
	int top;
	int default_capacity = 10;
	
	Stack() {
		top =-1;
		items = new int[default_capacity];
		
	}
	Stack( int capacity){
		top = -1;
		items = new int[capacity];
	}
	
	void push (int x){
		if (isFull())
			System.out.println("Stack is full");
		else {
			top = top + 1;
			items[top] = x;
			System.out.println(x +"has been pushed");
		}
	}
	
	boolean isFull(){
		if(top==items.length-1)
			return true;
		else return false;
	}
	
	int pop(){
		int x= -99;
		if (isEmpty())
			System.out.println("Stack is empty");
		else
		{
			x = items[top];
			top-- ;
			System.out.println(x +"has been popped");
		}
		return x;
	}
	
	boolean isEmpty(){
		if (top==-1)
			return true;
		else
			return false;
	}
	
	void printStack(){
		System.out.println("printing the stack array");
		
		for (int i =top ; i>=0; i--){
			System.out.println(items[i]);
		}
	}
}


class StackDemo {

public static void main (String[] args) {
	
	Stack s = new Stack();
	s.push(100);
	s.push(300);
	s.printStack();
	s.push(400);
	s.printStack();
	s.pop();
	s.printStack();
	s.pop();
	s.printStack();
	s.pop();
	s.pop();
}
}