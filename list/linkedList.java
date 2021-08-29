package list;
import java.util.*;
public class linkedList {

	public static void main(String[] args) {
		
List<Integer> ll=new LinkedList<>();  //LinkedList implements both List and Deque(which implements Queue Interface) Interface
List<Integer> al=new ArrayList<>();   //ArrayList only implements List Interface
//getTimeDiff(ll);
//getTimeDiff(al);
// ..............................INSERTION...............................
System.out.println("INSERTION-:");
long start=System.currentTimeMillis();
	for(int i=0;i<50000;i++)
		ll.add(0,i);
long end=System.currentTimeMillis();
System.out.println("time taken by LinkedList-> "+(end-start));

long start1=System.currentTimeMillis();
	for(int i=0;i<50000;i++)
		al.add(0,i);
long end1=System.currentTimeMillis();
System.out.println("time taken by ArrayList-> "+(end1-start1));




	}
	
//			static void getTimeDiff(List<Integer> list)
//			{
//				long start=System.currentTimeMillis();
//				for(int i=0;i<100000;i++)
//					{
//					list.add(0,i);
//					}
//				long end=System.currentTimeMillis();
//					System.out.println(end-start);
//			}

}
