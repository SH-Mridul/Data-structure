package LinkedList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		var list = new LinkedList();
		list.addLast(10);
		list.addLast(30);
		list.addFirst(5);
		list.reverse();
		var a  = list.toArray();
		System.out.println(Arrays.toString(a));
	
	}

}
