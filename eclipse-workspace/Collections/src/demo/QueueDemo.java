package demo;
//import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> myQ=new PriorityQueue<Integer>();

		myQ.add(10);
		myQ.add(8);
		myQ.add(6);
		myQ.add(5);
		myQ.add(3);

		System.out.println(myQ);

	System.out.println(myQ.poll());
    System.out.println(myQ.poll());
    System.out.println(myQ.poll());
    System.out.println(myQ.poll());
    System.out.println(myQ.poll());
    System.out.println(myQ);
		
    myQ.offer(9);
	myQ.offer(12);
	myQ.offer(15);
	myQ.offer(14);
	myQ.offer(4);
		System.out.println(myQ.peek());
		System.out.println(myQ.peek());
		System.out.println(myQ);

		System.out.println(myQ.poll());

		System.out.println(myQ.poll());

		System.out.println(myQ);

		/*System.out.println(myQ.poll());

		System.out.println(myQ.poll());*/

 

 

	}

 

}

 
