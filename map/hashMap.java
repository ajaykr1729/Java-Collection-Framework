package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,String> hm=new HashMap<>(); //HashMap implements only Map Interface
		//keys are -> unordered, no duplicate keys,accept only one null key.
		hm.put('e',"Eye");
		hm.put('f',"Fish");
		hm.put('d',"Dog");
		hm.put(null,null);
		hm.put('b',"Ball");
		hm.put('a',"Apple");
		hm.put('c',"Cat");
		hm.put('g',"Goat");
		System.out.println(hm);
//		for(Character c:hm.keySet()) //hm.valueSet() -> for value set 
//			System.out.println(c);
		for(Entry<Character, String> e:hm.entrySet())
			System.out.println(e);

	}

}
