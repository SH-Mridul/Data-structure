package Stack;

public class Main {
	public static int stack[] = new int[5];
	public static int index = -1;
	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		push(60);
	    Traverse();
	}
	
	public static void Traverse()
	{
		if(!isEmpty()) {
			for(int a = 0; a<=index; a++)
			{
				System.out.print(stack[a]+" ");
			}
		}
		else
		{
			System.out.println("stack is empty!");
		}
	}
	
	
	public static void push(int data)
	{
		if(!isFull())
		{
			index++;
			stack[index] = data;
		}else {
			System.out.println("sorry,no space for contain new data!");		
		}
	}
	
	public static void pop()
	{
		if (!isEmpty()) {
			stack[index] = -1;
			index--;
		}
		else
		{
			System.out.println("upps! stack is empty!");
		}
	}
	
	public static void peek()
	{
		if (!isEmpty()) {
		  System.out.println(stack[index]); 	
		}
		else
		{
			System.out.println("upps! stack is empty!");
		}
	}

	
	public static boolean isFull()
	{
		if (index == stack.length-1) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isEmpty()
	{
		if (index == -1) {
			return true;
		}
		else
		{
			return false;
		}
	}
}
