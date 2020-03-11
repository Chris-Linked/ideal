package School;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher kostas = new Teacher(1, "Kostas", 800);
		Teacher antonia = new Teacher(2, "Antonia", 800);
		Teacher thanos = new Teacher(3, "Thanos", 800);
		
		List<Teacher> teacherList = new ArrayList<Teacher>();
		teacherList.add(kostas);
		teacherList.add(antonia);
		teacherList.add(thanos);
		
		Student christos = new Student(1, "Christos", 70);
		Student zoi = new Student(2, "Zoi", 75);
		Student fotis = new Student(2, "Fotis", 61);
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(christos);
		studentList.add(zoi);
		studentList.add(fotis);
		
		School mixaniona = new School(teacherList, studentList);
		System.out.println("Mixaniona has earned: " + mixaniona.getTotalMoneyEarned() );
		
		christos.payFees(4000);
		
		System.out.println(mixaniona.getTotalMoneyEarned());
		zoi.payFees(7000);
		System.out.println(mixaniona.getTotalMoneyEarned());
		
		System.out.println("Mixaniona Salary Payment");
		mixaniona.updateTotalMoneySpent(800);
		System.out.println(mixaniona.getTotalMoneyEarned());


	}

}
