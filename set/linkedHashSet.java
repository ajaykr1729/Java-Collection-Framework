package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> lhs=new LinkedHashSet<Integer>(); //implements Set Interface only
		//ordered, no duplicates, accept only one null value
		//
//		lhs.add(4);
//		lhs.add(3);
//		lhs.add(9);
//		lhs.add(2);
//		lhs.add(4);
//		lhs.add(3);
//		lhs.add(5);
	//	
	    lhs.addAll(Arrays.asList(new Integer[]{3,2,4,null,3,5,2,4}));
		System.out.println(lhs);
	}

}
