package priorityqueue;

import java.util.PriorityQueue;

public class Priorityqueues {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		pq.add(6);
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());

	}
}
