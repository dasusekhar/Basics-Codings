package StreamsAll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee>list=getEmployees();
		//1 prints all
		List<Employee>list1=list.stream().collect(Collectors.toList());
		System.out.println(list1);
		//2 filter uses
		List<Employee> list2=list.stream().filter(x->x.getId()>13).collect(Collectors.toList());
		System.out.println(list2);
		// 3 aseding oreder base on  age 
		List<Employee> list3=list.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
		System.out.println(list3);
		// 4 using map
		List<String> list4=list.stream().filter(x->x.getSalary()>63000L).map(Employee::getName).collect(Collectors.toList());
		System.out.println(list4);
		// 5 using map 2  things
		//List<Employee> list5=list.stream().map((Employee emp)->new Employee(emp.getId(),emp.getAddress(),emp.getName())).collect(Collectors.toList());
		
				
	//	System.out.println(list5);
		List<Employee> list6=list.stream().filter(x->x.getName().startsWith("d")).collect(Collectors.toList());
		System.out.println(list6);
		//  6 Optinal 
		Optional<Employee> list7=list.stream().filter(x->x.getId()==17).findAny();
if(list7.isPresent())
{
	System.out.println(list7.get());
}else
{
	System.out.println("not id found");
}
		

//  7 max salry
Employee list8=list.stream().max(Comparator.comparing(Employee::getSalary)).get();
System.out.println(list8);
		
				
		

	}
	public static List<Employee> getEmployees()
	{
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(12,"dasusekhar","hyderabd",27,60000L));
		list.add(new Employee(15,"rakesh","bangalore",22,68000L));
		list.add(new Employee(13,"andand","chennai",23,62000L));
		list.add(new Employee(18,"suman","mumbai",28,63000L));
		list.add(new Employee(11,"kumar","mysore",26,69000L));
		
		
		
		
		return list;
		
	}

}
