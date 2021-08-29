package set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> ts=new TreeSet<Integer>(); //implements SortedSet Interface which also inherits Set Interface
		//ascending ordered, no duplicates,not even one null value is accepted
		//
//		lhs.add(4);
//		lhs.add(3);
//		lhs.add(9);
//		lhs.add(2);
//		lhs.add(4);
//		lhs.add(3);
//		lhs.add(5);
	//	
	    ts.addAll(Arrays.asList(new Integer[]{3,2,4,3,5,2,4}));
		System.out.println(ts);

	}

}
