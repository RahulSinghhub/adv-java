package functional_streams;
import static utils.StudentCollectionUtils.*;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get ppopulated map for students , display all
		try(Scanner sc = new Scanner(System.in)){Map<String,Student> studentMap = populateMap(populateList());
	     //studentMap.forEach((t, u) ->System.out.println(u) );
		
		//accept subject name from a client
		System.out.println("Enter subject name");
		Subject choosenSubject = Subject.valueOf(sc.next().toUpperCase());
	     studentMap.values()//collection of type values
	     .stream()//stream of type student all
	     .filter(i->i.getSubject()==choosenSubject )//filter is a matter of stream //now check for passed students && i.getGpa()>6*/
	     //we can have multiple filter
	     .filter(i->i.getGpa()>4)
	     .forEach(i->System.out.println(i));
		//display student details from a specified subject
		}
		

	}

}
