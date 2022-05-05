package Java8Pros;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted1 {
	public static void main(String [] args)
	{
		List<String> list1=Arrays.asList("hibernate","corejava","springboot","microserves");
	//1 reverse order
		List<String>list2=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list2);
		//2  asc
		List<String> list3=list1.stream().sorted().collect(Collectors.toList());
		System.out.println(list3);
		
		List<String> list4=list1.stream().sorted(Comparator.comparing(String::valueOf)).collect(Collectors.toList());
		System.out.println(list4);
		//3
		
		List<Integer> lists=Arrays.asList(12,35,32,65,43,34,78);
		List<Integer>list5=lists.stream().sorted(Comparator.comparing(Integer::valueOf)).collect(Collectors.toList());
		System.out.println(list5);
		//4
		
		
		
		
		
	}

}
