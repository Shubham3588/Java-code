package javaCodeRevesion;

import java.util.HashMap;
import java.util.Map;

public class FindOccurencesOfAnElementUsingHashMap {

	public static void main(String[] args) {
		
		findOcurrencesOfAnElement("shubhamm")	;

	}
	
	
	public static void findOcurrencesOfAnElement(String s) {
		HashMap<Character,Integer> count = new HashMap<Character,Integer>();
		int oldCount =0;
		char[] ch = s.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			
			if(count.containsKey(ch[i])) {
				oldCount=count.get(ch[i]);
				count.put(ch[i], oldCount+1);
			}else {
				count.put(ch[i], 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:	count.entrySet() ) {
			System.out.println(entry.getKey() +" ->"+entry.getValue());
		}
		
	}

}
