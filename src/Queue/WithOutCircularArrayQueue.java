package Queue;

public class WithOutCircularArrayQueue {

	public static int size = 5;
	public static int front = 0,rear = -1;
	public static int queue[] = new int[size];
	
	
	public static void main(String[] args) {
		Enqueue(10);
		Enqueue(20);
		Enqueue(30);
		Enqueue(40);
		Enqueue(50);
		Dequeue();
		Dequeue();
		Dequeue();
		Traverse();
	}

	public static void Enqueue(int data)
	{
		if(rear != size)
		{   
			rear++;
			queue[rear] = data; 
		}
		else
		{
			System.out.println("sorry! no space for contain new data!");
		}
	}
	
	public static void Dequeue()
	{
		if(front != rear)
		{
			queue[front] = -1;
			front++;
		}
		else
		{
			System.out.println("ups! it's empty!");
		}
	}
	
	public static void Traverse()
	{
		if (front != size) {
			
			for(int a  = front; a<size; a++)
			{
				System.out.print(queue[a]+"  ");
			}
		}else
		{
			System.out.println("ups! queue is empty!");
		}
	}
	
	
}
