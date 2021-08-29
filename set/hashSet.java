package set;
import java.util.*;
public class hashSet {
  public static void main(String[] args) {
	Set<Integer> hs=new HashSet<Integer>(); //implements Set Interface only
	//unordered, no duplicates, accept only one null value
//
//	hs.add(4);
//	hs.add(3);
//	hs.add(9);
//	hs.add(2);
//	hs.add(4);
//	hs.add(3);
//	hs.add(5);
//	
    hs.addAll(Arrays.asList(new Integer[]{3,2,4,null,3,5,2,4}));
	System.out.println(hs);
} 
  
}
