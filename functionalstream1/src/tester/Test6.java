package tester;


import java.util.Collections;
import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static utils.IoUtil.*;


import com.app.core.Student;
import com.app.core.Subject;

import custom_exception.StudentHandlingException;

public class Test6 extends Exception{

	public static void main(String[] args) throws StudentHandlingException {
		// TODO Auto-generated method stub
		//intstream.rangeclosed(1-100).filter(i->
		
//        int result = IntStream.rangeClosed(1, 100)
//        .filter(i->i%2==0)
//        .map(i->i*i)
//        .sum();
//		System.out.println(result);
//		
		//display sum of gpas of all passed students map
//        Map<String, Student> map = populateMap(populateList());
//        double sum = map.values().stream()
//        		.filter(i->i.getGpa()>4)
//        		.mapToDouble(s->s.getGpa())
//        		.sum();
//        System.out.println(sum);
        //display the student details from list of students sorted as per the dob 
//        List<Student> list = populateList();
//       Comparator<Student> stud = (s1,s2)->s1.getDob().compareTo(s2.getDob());
//        list.stream()
//        .sorted(stud)
//        .forEach(i->System.out.println(i));
		
        
        //print name of subject topper
        //compare from particular subjects of sort the list and show the first value for all
        
        //map - collection --stream -- filter(subject) -- max  -- get
		
		
//		Optional<Student> optional= map.values().stream() //collection <student>
//		.filter(i->i.getSubject()==Subject.ANGULAR)
//		.max( (s1,s2) -> ((Double)s1.getGpa()).compareTo((Double)s2.getGpa()))
//		.get();
//     
		
		try(Scanner sc = new Scanner(System.in))
		{	BufferedWriter br = new BufferedReader(new FileReader(sc.nextLine()));		 
			Map<String,Student> map = populateMap(populateList());  
			Stream<Student> sortedStudent=map.values().stream()
			.sorted((s1,s2)->s1.getDob().compareTo(s2.getDob()));
			storeDetails(sortedStudent,sc.nextLine());
			}
		catch(Exception E) {
			throw new StudentHandlingException("d");
		}
		
	
	}

}
