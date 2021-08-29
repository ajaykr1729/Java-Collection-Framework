package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class arrayDeque {

	public static void main(String[] args) {
     Deque<Integer> ad=new ArrayDeque<>(); //ArrayDeque implements Deque Interface which also inherits Queue Interface
		
		ad.addFirst(1);
		ad.addFirst(2);
		ad.addFirst(3);
		ad.addFirst(4);
		ad.addFirst(5);
		ad.addFirst(6);
		ad.addLast(7);
		ad.addLast(8);
		
		ad.push(9);
		ad.push(10);
		ad.push(11);
		System.out.println(ad);
		System.out.println(ad.removeLast());
		System.out.println(ad.removeLast());
		System.out.println(ad.removeLast());
		System.out.println(ad.removeFirst());
		System.out.println(ad.removeFirst());
		System.out.println(ad.removeFirst());
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad);
	}
}

