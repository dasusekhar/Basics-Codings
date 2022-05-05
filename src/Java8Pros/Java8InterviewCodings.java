package Java8Pros;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8InterviewCodings {

	public static void main(String[] args) {
		//1 prints duplicates
	  List<Integer>list=Arrays.asList(12,34,34,56,67,98,45,98,45);
	  Set<Integer>duplicateprints=list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
	  System.out.println("duplciates are :"+duplicateprints+"     conting the duplcate are :"+duplicateprints.size());
	  System.out.println("=============================================================================");
	  Set<Integer>dupNum=new HashSet<>();
	  Set<Integer>duplicates=list.stream().filter(e->!dupNum.add(e)).collect(Collectors.toSet());
	  System.out.println(duplicates);
	  //2 prints starts with 2
	 List<Integer> list1=Arrays.asList(2,22,234,745,256,567,543);
	 List<Integer> startswith2=list1.stream().map(e->String.valueOf(e))
			 .filter(e->e.startsWith("2"))
			 .map(Integer::valueOf)
			 .collect(Collectors.toList());
	 System.out.println(startswith2);
	 //3 get Second Highest and lowest 
	 List<Integer>list2=Arrays.asList(0,3,5,7,3,5,9,45,43,56,34,23,46,98);
	 int second=list2.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
	 System.out.println(second);
	 int seconds=list2.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
	 System.out.println(seconds);
	 int secondlow=list2.stream().sorted().distinct().skip(1).findFirst().get();
	 System.out.println(secondlow);
	 /// 4 ignore  first 5 numbers using limit and skip in streams
	  List<Integer>l=list2.stream().limit(5).collect(Collectors.toList());
	  System.out.println(l);
	  System.out.println("================================================");
	  Integer sumsoffirst5=list2.stream().limit(5).reduce((p,q)->p+q).get();
	  System.out.println(sumsoffirst5);
	  System.out.println("================================================");
			  Integer sumafter5=list2.stream().skip(5).reduce((p,q)->p+q).get();
			  System.out.println(sumafter5);
			  System.out.println("================================================");
			  //5 prints even and odd
			  List<Integer>evenlist=list2.stream().filter(e->e%2==0).collect(Collectors.toList());
			  System.out.println(evenlist);
			 
	 List<Integer> odd=list2.stream().filter(e->e%2!=0).collect(Collectors.toList());
	 System.out.println(odd);
	 System.out.println("================================================");
	 //6 prnts condi based avag of the after square
	 double lists=list2.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
	  System.out.println(lists);
	  
	  

	}

}
