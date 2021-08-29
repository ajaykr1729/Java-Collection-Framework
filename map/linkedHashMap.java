package map;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class linkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,String> lhm=new LinkedHashMap<>(); //LinkedHashMap implements only Map Interface
		//keys are -> ordered, no duplicate keys,accept only one null key.
	
		lhm.put('e',"Eye");
		lhm.put('f',"Fish");
		lhm.put('d',"Dog");
		lhm.put(null,"i m null");
		lhm.put('b',"Ball");
		lhm.put('a',"Apple");
		lhm.put('c',"Cat");
		lhm.put('g',"Goat");
		System.out.println(lhm);
//		for(Character c:lhm.keySet()) //lhm.valueSet() -> for value set 
//			System.out.println(c);
		for(Entry<Character, String> e:lhm.entrySet())
			System.out.println(e);

	}

}
