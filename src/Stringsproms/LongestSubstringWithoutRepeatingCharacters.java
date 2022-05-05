package Stringsproms;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		 String s="abbac";
		 String longestString=null;
		 int longestsubstringlength=0;
		 Map<Character,Integer> map=new LinkedHashMap<>();
		 char[] array=s.toCharArray();
		 for(int i=0;i<array.length;i++)
		 {
			 char ch=array[i];
			 if(!map.containsKey(ch))
			 {
				 map.put(ch,i);
			 }
			 else
			 {
				 i=map.get(ch);
				 map.clear();
			 }
			 if(map.size()>longestsubstringlength)
			 {
				 longestsubstringlength=map.size();
				 longestString = map.keySet().toString();
				 
				 
			 }
			 
		 }
		 System.out.println("the longest substring is :"+longestString);
		 System.out.println("the longest substring lenth "+longestsubstringlength);
		 
		 
		 

	}

}
