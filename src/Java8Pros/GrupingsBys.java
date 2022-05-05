package Java8Pros;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import StreamsAll.Employee;

public class GrupingsBys {

	public static void main(String[] args) {
	     List<Department>emplist=getDerpartmts();
	     Map<String,List<Department>>lists=(Map) emplist.stream().collect(Collectors.groupingBy(Department::getCity));
	     lists.forEach((key,value)->System.out.println("city :"+key+"  employees  :"+value));
	     

	}
	public static List<Department> getDerpartmts()
	{
		List<Department> emplist=new ArrayList<>();
		emplist.add(new Department("102","dasu sekhar","hyderabad"));
		emplist.add(new Department("105","rakesh","hyderabad"));
		emplist.add(new Department("106","suresh","bangalore"));
		emplist.add(new Department("101","varun","bangalore"));
		
		return emplist;
	}

}
class Department
{
	private String name;
	private String id;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Department(String string, String string2, String string3) {
		super();
	}
	public Department() {
		super();
	}
	
	
	
	
}
