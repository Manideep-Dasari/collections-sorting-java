package Task3;

import java.util.Comparator;

public class Employee {

	String name;
	int age;
	double salary;

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}

//For Desc(Salary)
class DescComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return Double.compare(e2.salary, e1.salary);
	}
}

//For Asc(Name)
class AscComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}
