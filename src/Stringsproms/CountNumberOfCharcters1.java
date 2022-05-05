package Stringsproms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountNumberOfCharcters1 {

	public static void main(String[] args) {
	    String name="my name is dasu sekhar";
	    Map<Character,Integer> map=new LinkedHashMap<>();
	    for(int i=0;i<name.length();i++)
	    {
	    	char ch=name.charAt(i);
	    	if(map.get(ch)==null)
	    	{
	    		map.put(ch, 1);
	    	}
	    	else
	    	{
	    		map.put(ch, map.get(ch)+1);
	    	}
	    	
	    	
	    }
	    System.out.println(map);
	    
	    
	    

	}

}
