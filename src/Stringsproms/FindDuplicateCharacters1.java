package Stringsproms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateCharacters1 {

	public static void main(String[] args) {
		 String name="aabbbccklmnop";
		 Map<Character,Integer> map=new LinkedHashMap<>();
		 for(int i=0;i<name.length();i++){
			 char ch=name.charAt(i);
			 if(map.get(ch)==null)
			 {
				 map.put(ch, 1);
			 }else
			 {
				 map.put(ch, map.get(ch)+1);
			 }
	
			 
		 }
		 Iterator<Character> tempstrings=map.keySet().iterator();
		 while(tempstrings.hasNext())
		 {
			 char temp=tempstrings.next();
			 if(map.get(temp)>1)
			 {
				 System.out.println("the character is "+ temp+" appreared in "+map.get(temp)+" times ");
			 }
					 
		 }
		 
		 

	}

}
