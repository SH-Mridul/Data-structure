package Queue;

public class Main {

	public static int size = 5;
	public static int queue[] = new int[size];
	public static int front = 0;
	public static int rear = -1;
	public static int totalItem = 0;
	
	public static void main(String[] args) {
		
		Enqueue(10);
		Enqueue(11);
		Enqueue(12);
		Enqueue(13);
		Enqueue(14);
		Dequeue();
		Enqueue(15);
		Dequeue();
		Dequeue();
		Dequeue();
		Traverse();
	}
	
	public static void Enqueue(int data)
	{
		if (isFull()) {
			System.out.println("sorry! no space for contain "+data+".");
			return;
		}
		
		rear = (rear+1)%size;
		queue[rear] = data;
		totalItem++;
	}
	
	
	public static void Dequeue()
	{
		if (isEmpty()) {
			System.out.println("ups! queue is empty!");
			return;
		}else
		{
			queue[front] = -1;
			front = (front+1)%size;
			totalItem--;
		}
	}
	
	public static void Peek()
	{
		System.out.println("value:"+queue[front]);
	}
	
	public static boolean isFull()
	{
		if (totalItem == size) {
			return true;
		}
	
	    return false;
	}
	
	public static boolean  isEmpty()
	{
		if (totalItem == 0) {
			return true;
		}
		
		return false;
	}
	
	public static void Traverse()
	{
		if (!isEmpty()) 
		{
			for (int  a = 0; a<size; a++)
			{
				System.out.print(queue[a]+"  ");	
			}
		}
		else
		{
			System.out.println("ups! queue is empty!");
		}
		
		
	}
}
