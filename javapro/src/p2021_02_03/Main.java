package p2021_02_03;

import java.sql.Timestamp;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Date d = new Date();
		System.out.println(d);
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(ts);
		
	}
}
