package tester;

import static utils.StudentCollectionUtils.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.app.core.Student;

public class Test1case {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		1.1 Display all student details from a student list
////		1.2  Display all student details from a student map
////		1.3 Display all student details(from the list) sorted as per GPA (desc order)
////		Use custom ordering
////		1.4 Remove all failed students from the map n display the map again
////		(gpa < 6 => failure)
		List<Student> studentList =populateList();
//		studentList.forEach(p->System.out.println(p));
//		System.out.println();
		Map<String,Student> studmap = populateMap(studentList);
//		studmap.forEach((p,k)->System.out.println(k));//we need to give 
//		System.out.println();
//		
//		studmap.forEach((p,k) -> System.out.println("roll no "+p+" gpa: "+ k.getGpa()));
//		
//		System.out.println();
//		//for sorting on gpa
//		//you cannot make a primitive type sort in custom make the class a wrapper class
//		//method 1
//		//functional literal - assigning the variable to functional interface (comparator)
////		Comparator<Student> sortComaprator= (p1,p2)->((Double)p2.getGpa()).compareTo((Double)p1.getGpa());aoto boxing from primitive to wrapper class
////		Collections.sort(studentList,sortComaprator);
////		studentList.forEach(p->System.out.println(p));
//		//
//		Comparator<Student> c  = (p1,p2)->{
//			System.out.println();
//			if(p1.getGpa()<p2.getGpa())
//				return 1;
//			if(p1.getGpa()>p2.getGpa())
//				return -1;
//			return 0;
//		};
//		Collections.sort(studentList,c);
//		
//		studentList.forEach(p->System.out.println(p));
		
		//remove all failed students gpa < 6
		studmap.values().removeIf(p->{
			if(p.getGpa()<6) 
				return true;
			if(p.getGpa()>6)
				return false;
			return false;
		});
		
		studmap.forEach((p,k)->System.out.println(k));
		
		
		 
	}

}
