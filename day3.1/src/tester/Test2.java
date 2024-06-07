package tester;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

/*
 * accept dob of the bank customer n display it
 */

public class Test2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter DoB - yyyy-MM-dd");
			// user : string(sc.next() --> LocalDate
			LocalDate dob = LocalDate.parse(sc.next());
			LocalTime tim = LocalTime.parse(sc.next());
			LocalDateTime dobtim = LocalDateTime.parse(sc.next());
			System.out.println(dob);
			System.out.println(tim);
			System.out.println(dobtim);
			System.out.println("end of try...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main continues...");

	}

}
