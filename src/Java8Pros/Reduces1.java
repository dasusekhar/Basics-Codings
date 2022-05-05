package Java8Pros;

import java.util.Arrays;
import java.util.List;

public class Reduces1 {

	public static void main(String[] args) {

List<Integer>lists=Arrays.asList(12,24,53,35,56,34,78);
//1 maximum and mininum values
Integer maxvalue=lists.stream().reduce(Integer::max).get();
System.out.println(maxvalue);
Integer minvalue=lists.stream().reduce(Integer::min).get();
System.out.println(minvalue);
System.out.println("==========================================");
  // 2 sum
Integer max=lists.stream().reduce(0,(a,b)->a+b);
System.out.println(max);
Integer sums=lists.stream().reduce(Integer::sum).get();
System.out.println(sums);


	}

}
