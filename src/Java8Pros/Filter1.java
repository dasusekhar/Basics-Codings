package Java8Pros;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter1 {

	

	public static void main(String[] args) {
		List<String> list=Arrays.asList("hibernate","corejava","springboot","microserves");
		List<String> list1=list.stream().collect(Collectors.toList());
		System.out.println(list1);
		//1
		list.stream().filter(x->x.startsWith("s")).forEach(System.out::println);
		//2
		List<Integer> lists=Arrays.asList(12,34,56,43,54,67,64);
		
		List<Integer> list2=lists.stream().filter(x->x.intValue()>26).collect(Collectors.toList());
		System.out.println(list2);
		

	}

}
