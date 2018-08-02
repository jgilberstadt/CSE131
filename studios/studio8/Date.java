package studio8;

import java.util.LinkedList;
import java.util.List;

import exercises8.Valuable;

public class Date {
	
	private final List<Date> Month, Day, Year;
	private final String Holiday;
	
	public Date() {
		this.Month = new LinkedList<Date>();
		this.Day = new LinkedList<Date>();
		this.Year = new LinkedList<Date>();
	}
	
	public void addMonth(Date m) {
		Month.add(m);
	}
	
	public void addDay(Date d) {
		Month.add(d);
	}
	
	public void addYear(Date y) {
		Month.add(y);
	}
	
	public String toString() {
	return 	
	}
	
	public static void main(String[] args) {
	Date d = new Date();
	System.out.println("Date: " + d);
	}

}
