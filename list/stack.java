package list;
import java.util.*;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Stack<Integer> st=new Stack<>();//Last in first out
  st.push(3);
  st.push(6);
  st.push(1);
  st.push(7);
  st.push(3);
  st.push(2);
  st.push(9);
   st.pop();
  
	 System.out.println(st.peek());
//  

	}

}
