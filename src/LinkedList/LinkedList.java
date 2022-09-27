package LinkedList;

public class LinkedList {
	
	private class Node {
		private int value;
		private Node next;
		
		public Node(int item) {
			value = item;
		}
	}

   private Node first;
   private Node last;
   private int size;
   
   public void addLast(int item)
   {
	   var node  = new Node(item);
	   if(isEmpty()) 
	   {
		   first = last = node;   
	   }
	   else 
	   {
		   last.next = node;
		   last = node;
	   } 
	   
	   size++;
   }
   
   public void addFirst(int item)
   {
	   var node = new Node(item);
	   
	   if(isEmpty())
	   {
		   first = last = node;
	   }else
	   {
		   node.next = first;
		   first = node;
	   }
	   size++;
   }
   
   private boolean isEmpty()
   {
	   return first == null;
   }
   
   public int indexOf(int item)
   {
	   int index = 0;
	   var current  = first;
	   while(current != null)
	   {
		   if(current.value == item)
		   {
			  return index;
		   }
		   current  = current .next;
		   index++;
	   }
	   
	   return -1;
   }
   
   public boolean contains(int item)
   {
	   return indexOf(item) != -1;
   }
   
   
   public void removeFirst()
   {
	  //if list is null 
	  if(isEmpty()) 
	  {
		  System.out.println("list is null!");
		  return;
	  }
		 
	  
	  // if first and last is same
	  if(first == last)
	  {
		 first = last = null;
		 size = 0;
		 return;
	  }
		  
	  //if the list contains more than one
	  first =  first.next;
	  size--;
   }
   
   
   public void removeLast()
   {
	   if(isEmpty())
	   {
		   System.out.println("list is empty!");
		   return;
	   }
	   
	   if (first == last) 
	   {
		   first = last = null;
		   size = 0;
		   return;
	   }
		   
	   var previous = getPrevious(last);
	   last = previous;
	   last.next = null;
	   size--;
   }
   
   //get previous item for remove last
   private Node getPrevious(Node node)
   {
	   var current  =  first;
	   
	   while(current != null)
	   {
		   if (current.next == node)
			   return current;
		   current = current.next;
	   }
	   
	   return null;
   }
   
   
   public int size()
   {
	   return size;
   }
   
   
   public int[] toArray()
   {
	   int array[] =  new int[size];
	   int index = 0;
	   var current = first;
	   while(current != null)
	   {
		   array[index++] = current.value;
		   current = current.next;
	   }
	   
	   return array;
   }
   
   public void reverse()
   {   
	 //[10 -> 20 -> 30]  
	 var previous = first;  //10 
	 var current  =  first.next; //20
	 
	 while(current != null)
	 {
		 var next = current.next; //30
		 current.next = previous; //20->10
		 previous = current; // 20 -> 10
		 current = next; // 30
	 }
	 
	 //set last node
	 last = first;
	 last.next = null;
	 first = previous;
   }
}
