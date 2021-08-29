package map;


import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<Character,String> tm=new TreeMap<>(); //TreeMap implements SortedMap Interface which also implements Map Interface
		//keys are -> ascending ordered, no duplicate keys,accept not even a single null key.
	
		tm.put('e',"Eye");
		tm.put('f',"Fish");
		tm.put('d',"Dog");
		//tm.put(null,"i m null");
		tm.put('b',"Ball");
		tm.put('a',"Apple");
		tm.put('c',"Cat");
		tm.put('g',"Goat");
		System.out.println(tm);
//		for(Character c:tm.keySet()) //tm.valueSet() -> for value set 
//			System.out.println(c);
		for(Entry<Character, String> e:tm.entrySet())
			System.out.println(e);
	}

}
