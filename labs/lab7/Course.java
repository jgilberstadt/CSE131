package lab7;

public class Course {

	private String Name;
	private int Credits, NumSeats;
	private Student[] Roster;
	
	public Course(String a, int b, int c) {
	this.Roster = new Student[c];
	this.Credits = b;
	this.NumSeats = c;
	this.Name = a;
}
	
	public boolean addStudent(Student S) {
	int j = 0;
	for (int i = 0; i < Roster.length; i++) {
	if (this.Roster[i] == S) {
	j = j + 1;	
	}
	}
	boolean c = ((this.NumSeats > 0)&&(j == 0));	
	if (c == true) {
	for (int i = 0; i < Roster.length; i++) {
	if (this.Roster[i] == null) {
	this.Roster[i] = S;
	break;
	}
	}
	this.NumSeats = this.NumSeats - 1;
	}
	return c;
	}
	
	public String generateRoster() {
	String S= "";
	for (int i = 0; i < Roster.length; i++)	{
	S = S + this.Roster[i] + " ";	
	}
	return S;
	}
	
	public int getRemainingSeats() {
	return NumSeats;
	}
	
	public double averageGPA() {
	int j = 0;
	double h = 0.0;
	for (int i = 0; i < Roster.length; i++)	{
	if (this.Roster[i] != null) {
	h = h + this.Roster[i].getGPA();
	j = j + 1;
	}
	}
	h = h / (double) j;
	return h;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getCredits() {
		return Credits;
	}

	public void setCredits(int credits) {
		Credits = credits;
	}

	public int getNumSeats() {
		return NumSeats;
	}

	public void setNumSeats(int numSeats) {
		NumSeats = numSeats;
	}

	public Student[] getRoster() {
		return Roster;
	}
	
	public void setRoster(Student[] roster) {
		Roster = roster;
	}

	public String toString() {
	return this.getName() + this.getCredits() + this.getNumSeats() + this.getRoster();	
	}
	
	public static void main(String[] args) {
	Course c = new Course(Algebra, 3, 3);

	}

}
