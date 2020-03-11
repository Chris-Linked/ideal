package School;

/*
 * Created by Chris on 2/2/2020
 * This class is responsible for keeping the track teacher's 
 * id, name and salary
 */
public class Teacher {
	
	private int id;
	private String name;
	private double salary;
	private double salaryEarned;
	
	/*
	 * Creates an new teacher object
	 * @param id, id of the teacher
	 * @param name, name of the teacher
	 * @param salary, salary of the teacher
	 */
	public Teacher(int id, String name, double salary)
	{
		if(salary < 0.0)
			throw new IllegalArgumentException(
					"The salary must me >= 0.0");
			
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = salaryEarned;
	}

	/*
	 * @return id for the teacher
	 */
	public int getId() {
		return id;
	}
	
	/*
	 * @return name of the teacher
	 */
	public String getName() {
		return name;
	}

	/*
	 * @return salary of the teacher
	 */
	public double getSalary() {
		return salary;
	}

	/*
	 * Update or set the salary of the teacher
	 * @param salary
	 */
	public void setSalary(double salary) {
		if(salary < 0.0)
			throw new IllegalArgumentException(
					"The salary must be >= 0.0");
		this.salary = salary;
	}
	
	//@param salary 
	public void receiveSalary(double salary)
	{
		salaryEarned += salary;
	}

	@Override
	public String toString() {
		return String.format("Teacher [id=%s, name=%s, salary=%s, salaryEarned=%s]", id, name, salary, salaryEarned);
	}
	
	
}
