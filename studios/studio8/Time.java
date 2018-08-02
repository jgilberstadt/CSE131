package studio8;

import java.util.LinkedList;
import java.util.List;

public class Time {
	
	private final List<Time> Hour, Minute;
	private final int Format;
	
	public Time(int a) {
		this.Hour = new LinkedList<Time>();
		this.Minute = new LinkedList<Time>();
		this.Format = a;
	}
	
	public void addHour(Time h) {
		Hour.add(h);
	}
	
	public int Hour(int b) {
		if ((this.Format == 12)&&(b > 12)) {
		return b - 12;
		}else {
			return b;
		}
	}
	
	public void addMinute(Time m) {
		Minute.add(m);
	}
	
	public int Minute(int c) {
		return c;
	}
	
	public String toString() {
		return Hour(4) + ": " + Minute(40);
	}
	
	public static void main(String[] args) {
	Time t = new Time(12);
	t.Hour (4);
	t.Minute(30);
	System.out.println("Time: " + t);
	}

}
