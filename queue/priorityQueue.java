package queue;


import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {

	public static void main(String[] args) {
		
	    //making a comparator for assigning priority
		Comparator<String> strLenComp=new Comparator<>() {


			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				if(s1.length()==s2.length())
					return s1.compareTo(s2);
				else 
					return s1.length()-s2.length();
			}
		};
		
		Queue<String> pq=new PriorityQueue<>(strLenComp); //PriorityQueue only implements Queue Interface
	  //or
//		PriorityQueue<String> pq=new PriorityQueue<String>((s1,s2)->{
//			if(s1.length()==s2.length())
//				return s1.compareTo(s2);
//			else 
//				return s1.length()-s2.length();
//		});
		
		
		pq.add("Anuj");
		pq.add("Chrisissg");
		pq.add("Anu");
		pq.add("Rober");
		pq.add("Roy");	
	    pq.add("Bae");	
		pq.add("Lisa");
		pq.add("Ajay");
		
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq);
		
		
//		PriorityQueue<Integer> pqi=new PriorityQueue<>(Collections.reverseOrder());
//		pqi.add(4);
//		pqi.add(9);
//		pqi.add(0);
//		pqi.add(-3);
//		pqi.add(7);
//		pqi.add(2);
//		pqi.add(8);
//	
//		pqi.add(11);
//	
//		
//		System.out.println(pqi);
//		System.out.println(pqi.element());
//	
//		System.out.println(pqi.remove());
//		System.out.println(pqi.remove());
//		System.out.println(pqi.remove());
//		System.out.println(pqi.remove());
//		System.out.println(pqi.remove());
//		System.out.println(pqi.remove());
//		ArrayList<Integer> ans=new ArrayList<>(pqi);
//		Collections.sort(ans,Collections.reverseOrder());
//		System.out.println(ans );
//		
	}

}
