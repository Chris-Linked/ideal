package School;

/*
 * Created by Chris 2/2/2020
 * This is responsible to keep track of students fees,
   name, grade and fees paid
 */
public class Student {
	private int id;
	private String name;
	private double grade;
	private double feesPaid;
	private double feesTotal;
	
	/* create a new student by initializing the values
	 * assume that fees for every student is 30,000$
	 * fees paid initially is 0
	 * @param id for the student unique
	 * @param name name of student
	 * @param grade of student
	 */
	
	public Student(int id, String name, double grade)
	{
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	
	// @param grade 
	public void setGrade(double grade)
	{
		// check if grade input is valid
		if(grade < 0.0)
			throw new IllegalArgumentException("Grade must be >= 0.0");
		
		this.grade = grade;
	}
	
	/* add fees to the fees paid
	 * @param fees
	 */
	
	public void payFees(double fees)
	{
		//check for valid input
		if(fees <= 0.0)
			throw new IllegalArgumentException("Fees must be > 0.0");
		
		feesPaid += fees; 
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	/*
	 * @return the id of the student
	 */

	
	public int getId() {
		return id;
	}


	/*
	 *@return the name of the student 
	 */
	public String getName() {
		return name;
	}

	/*
	 * @return the fees paid
	 */
	public double getFeesPaid() {
		return feesPaid;
	}


	// @return the total fees 
	public double getFeesTotal() {
		return feesTotal;
	}
	
	public double getRemainingFees()
	{
		return getFeesTotal() - getFeesPaid();
	}
	
	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, grade=%s, feesPaid=%s, feesTotal=%s]", id, name, grade, feesPaid,
				feesTotal);
	}


	
}
