import java.util.*;
class SortByIdAsc implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2){
		return emp1.id - emp2.id;
	}
}
class SortByNameAsc implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2){
		return emp1.name.compareTo(emp2.name);
	}
}
class Employee {
	int id;
	String name;
	float salary;
	Employee() {}
	
	Employee(int id, String name, float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return "id "+id+" name "+name+" salary "+salary;
	}
}		
public class CollectionDemo {
	public static void main(String args[]) {
	List<Employee> ll  = new ArrayList<>();
	ll.add(new Employee(2,"Ajay",12000));
	ll.add(new Employee(1,"Vijay",16000));
	ll.add(new Employee(3,"Mahesh",14000));
	
	System.out.println("Before sort");
	for(Employee emp : ll) {
		System.out.println(emp);
	}
	//Collections.sort(ll, new SortByIdAsc());
	Collections.sort(ll, new SortByNameAsc());
	System.out.println("After sort");
	for(Employee emp : ll) {
		System.out.println(emp);
	}
	}
}























