package prob05;

public class MyStack <T> {
	private static final int INIT_SIZE = 3;
	private T[] buffer;
	private int capacity;
	private int top = -1;
	
	@SuppressWarnings("unchecked")
	public MyStack() {
		buffer = ( T[] )new Object[INIT_SIZE];
		capacity = INIT_SIZE;
	}
	
	@SuppressWarnings("unchecked")
	public MyStack(int bufSize) {
		buffer = ( T[] )new Object[bufSize];
		this.capacity = bufSize;
	}
	
	@SuppressWarnings("unchecked")
	public void push(T element) {
		if(capacity <= top+1) { //stack full
			T[] newBuffer = ( T[] )new Object[capacity + 1];
			System.arraycopy(buffer, 0, newBuffer, 0, capacity);
			newBuffer[capacity++] = element;
			buffer = newBuffer;
		}else { //enough space
			buffer[top + 1] = element;
		}
		top++;
	}
	
	public T pop() throws MyStackException{
		if(top < 0)
			throw new MyStackException();
		T returnObj = buffer[top];
		buffer[top--] = null;
		return returnObj;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
}