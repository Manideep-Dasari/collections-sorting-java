package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Kanmani", 21, 45000));
		list.add(new Employee("Rambo", 25, 37000));
		list.add(new Employee("Kathija", 23, 85000));
		
		//For Original Employee List
		System.out.println("Original List:");
		for(Employee e : list) {
			System.out.println(e);
		}
		System.out.println();
		
		//For Desc(Salary)
		Collections.sort(list, new DescComparator());
		System.out.println("Sorted by Salary (Desc):");
		for(Employee e : list) {
			System.out.println(e);
		}
		System.out.println();
		
		//For Asc(Name)
		Collections.sort(list, new AscComparator());
		System.out.println("Sorted by Name (Asc):");
		for(Employee e : list) {
			System.out.println(e);
		}
		
	}
	
}
