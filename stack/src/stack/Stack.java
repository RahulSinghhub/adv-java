package stack;

public class Stack<T> {
	//we want to retain order or not in collections we were retaining order or not
	T [] arr;
	int size;
	int top;
	
	public Stack() {
		this.size=arr.length;
		top=-1;
		arr = (T []) new Object[size];	
	}
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	}
	
	public boolean isFull() {
		return top==(size-1);
	}
	
	public T push(T data) {
		if(isFull()){
			return null;
		}
		return arr[++top]=data;
		
	}
	
	public T pop() {
		if(isEmpty()) {
			return null;
		}
		return arr[top--];
	}
	
	public T peek() {
		if(isEmpty()) {
			return null;
		}
		return arr[top];
	}
	
	public  void display() {
		for(T a:arr)
			System.out.print(a+"->");
	}
	
	
	
	

}
