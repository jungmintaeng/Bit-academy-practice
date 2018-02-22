package prob05;

public class MyStack {
	private static final int INIT_SIZE = 3;
	private String[] buffer;
	private int capacity;
	private int top = -1;
	
	public MyStack() {
		buffer = new String[INIT_SIZE];
	}
	
	public MyStack(int bufSize) {
		buffer = new String[bufSize];
		this.capacity = bufSize;
	}
	
	public void push(String element) {
		if(capacity <= top+1) { //stack full
			String[] newBuffer = new String[capacity + 1];
			System.arraycopy(buffer, 0, newBuffer, 0, capacity);
			newBuffer[capacity++] = element;
			buffer = newBuffer;
		}else { //enough space
			buffer[top + 1] = element;
		}
		top++;
	}
	
	public String pop() throws MyStackException{
		if(top < 0)
			throw new MyStackException();
		String returnObj = buffer[top];
		buffer[top--] = null;
		return returnObj;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
}