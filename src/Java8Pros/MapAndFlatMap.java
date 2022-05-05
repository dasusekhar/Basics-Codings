package Java8Pros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapAndFlatMap {

	public static void main(String[] args) {
		
List<Customer> customers=getCustomer();
Set<String> lists=customers.stream().map(customer->customer.getEmail()).collect(Collectors.toSet());
System.out.println(lists);

System.out.println("===============================================================================");
List<List<String>> phonenumbersof=customers.stream().map(customer->customer.getPhonenumber()).collect(Collectors.toList());
System.out.println(phonenumbersof);
 List<String> phones=customers.stream().flatMap(customer->customer.getPhonenumber().stream()).collect(Collectors.toList());
System.out.println(phones);













	}
	public static List<Customer> getCustomer()
	{
		List<Customer> customers=new ArrayList<>();
		customers.add(new Customer(101,"dasu sekhar","john@gmail.com",Arrays.asList("345564456364","45454454446","46445467454")));
		customers.add(new Customer(104,"suman ","john@gmail.com",Arrays.asList("345564464df","4545444dfdf","464454df454")));
		customers.add(new Customer(103,"dasu sekhar","john@gmail.com",Arrays.asList("345564dfdgdgdg464","dfdg54546","46445489454")));
		return customers;
	}
	

}
 class Customer
{
	 private int id;
	 private String name;
	 private  String email;
	 private  List<String> phonenumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(List<String> phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Customer(int id, String name, String email, List<String> phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	public Customer() {
		super();
	}
	 
	 
	
}
