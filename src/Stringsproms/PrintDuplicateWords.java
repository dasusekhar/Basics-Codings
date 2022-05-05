package Stringsproms;

import java.util.HashMap;
import java.util.Iterator;

public class PrintDuplicateWords {

	public static void main(String[] args) {
		 String str=" i am car car car am dasu dasu sekhar";
		 HashMap<String ,Integer> map=new HashMap<>();
		 String [] s =str.split(" ");
		 for(String  tempStrings :s)
		 {
			 if(map.get(tempStrings)!=null)
			 {
				 map.put(tempStrings, map.get(tempStrings)+1);
			 }else
			 {
				 map.put(tempStrings, 1);
			 }
		 }
		 Iterator<String> temps=map.keySet().iterator();
		 while(temps.hasNext())
		 {
			 String supt=temps.next();
			 if(map.get(supt)>1)
			 {
				 System.out.println("the words are "+supt+" appred in "+map.get(supt)+" in times");
			 }
			 
		 }
			 
		 
		 

	}

}
