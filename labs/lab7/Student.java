package lab7;

public class Student {

	private double GPA;
	private int CreditsTotal, StudentID;
	private String First, Last, ClassStanding;
	
	
	public Student (String a, String b, int c) {
	this.CreditsTotal = 0;
	this.GPA = 0.0;
	this.StudentID = c;
	this.First = a;
	this.Last = b;
	this.ClassStanding = "Freshman";
	}
	
	private Student (String a, String b, int c, double d, int e) {
		this.CreditsTotal = e;
		this.GPA = d;
		this.StudentID = c;
		this.First = a;
		this.Last = b;
		
	}
	
	public void submitGrade(double b, int d) {
	this.GPA = Math.round((this.GPA * this.CreditsTotal + d * b) / (this.CreditsTotal+ d) * 1000) / 1000.0;
	this.CreditsTotal = this.CreditsTotal + d;
	}
	
	public String getClassStanding() {
	if (this.CreditsTotal < 30) {
	return "Freshman";
	}else if ((this.CreditsTotal >= 30)&&(this.CreditsTotal < 60)) {
	return "Sophomore";
	}else if ((this.CreditsTotal >= 60)&&(this.CreditsTotal < 90)) {
	return "Junior";
	}else {
	return "Senior";
	}
	}
	
	public Student createLegacy(Student T) {
	Student A = new Student(this.getName(), T.getName(), this.StudentID + T.getStudentID(), this.GPA, this.CreditsTotal);
	A.GPA = (this.GPA + T.getGPA()) / 2.0;
	A.CreditsTotal = Math.max(this.CreditsTotal, T.getCredits());
	return A;
	}
	
	
	
	
	public int getStudentID() {
		return this.StudentID;
	}

	public String getName() {
		return this.First + " " + this.Last;
	}
	
	public int getCredits() {
		return this.CreditsTotal;
	}
	
	public String toString() {
	return this.getName() + this.getStudentID();
	}
	
	public double getGPA() {
		return this.GPA;
	}

	public static voic main(String[] args) {
	Student s = new Student (A, B, 37);
	}

