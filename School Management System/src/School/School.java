package School;

import java.util.List;

/* Many students Many teachers
 * Created by Chris 2/2/2020
 */
public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static double totalMoneyEarned;
	private static double totalMoneySpent;
	
	/*
	 * New school object is created
	 * @param teacher, list of teachers
	 * @param students, list of students
	 */
	public School(List<Teacher> teachers, List<Student> students)
	{
		
		this.teachers = teachers;
		this.students = students;
		this.totalMoneyEarned = 0;
		this.totalMoneySpent = 0;
		
	}
	
	// @param teacher adds teacher to the school
	public void addTeacher(Teacher teacher)
	{
		teachers.add(teacher);
	}
	
	// @param student adds students to the school
	public void addStudent(Student student)
	{
		students.add(student);
	}

	// @return list of teachers
	public List<Teacher> getTeachers() {
		return teachers;
	}

	// @param teacher, set list of teachers
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	// @return list of students
	public List<Student> getStudents() {
		return students;
	}
	
	// @param list of students
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	// @return total money earned
	public double getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	// @param totalMoneyEarned
	public void setTotalMoneyEarned(double totalMoneyEarned) {
		this.totalMoneyEarned = totalMoneyEarned;
	}
	
	// @return total money spent
	public double getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	// @param total money spent
	public void setTotalMoneySpent(double totalMoneySpent) {
		this.totalMoneySpent = totalMoneySpent;
	}
	
	// @param moneyEarned to update the information of money earned
	// e.g fees from the students
	public static void updateTotalMoneyEarned(double moneyEarned)
	{
		totalMoneyEarned += moneyEarned;
	}
	
	// @param moneySpent to update the information of money spent
	// e.g salaries of the teachers
	public void updateTotalMoneySpent(double moneySpent)
	{
		totalMoneyEarned -= moneySpent;
		
	}

	@Override
	public String toString() {
		return String.format("School [teachers=%s, students=%s]", teachers, students);
	}
	
	
}
