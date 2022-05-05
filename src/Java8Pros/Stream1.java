package Java8Pros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		//to convert list to streams 
		List<Integer> list=Arrays.asList(12,12,12,34,54,34,34,65,78,30,24);
		List<String> string=Arrays.asList("hibernate","corejava","springboot","microservices");
		
		List<Integer> str=list.stream().collect(Collectors.toList());
		System.out.println(str);
		 System.out.println("===========================================");
		Integer [] array= {12,45,67,35,56};
		Stream<Integer> streams1=Arrays.stream(array);
		streams1.forEach(System.out::println);
		System.out.println("prints distant elements");
		list.stream().distinct().forEach(System.out::println);
		System.out.println("prints using filter condion check ");
		List<Integer> list1=list.stream().filter(x->x.intValue()>30).collect(Collectors.toList());
		System.out.println(list1);
		System.out.println("using sorted method ");
		List<Integer> list2=list.stream().distinct().sorted(Comparator.comparing(Integer::valueOf)).collect(Collectors.toList());
		System.out.println(list2);
	List<String> list3=string .stream().collect(Collectors.toList());
	System.out.println(list3);
	List<String> list4=string.stream().filter(x->x.startsWith("m")).collect(Collectors.toList());
		System.out.println(list4);
		
		
		
		
		
		}
		
		

	

}
