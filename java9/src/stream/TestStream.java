package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import com.app.core.*;
import utils.*;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,6,7,2,345,6};
		//attah int stream to array  and display elements
		//source int[] terminal(forEach
//		2.Understand Functional Streams (Theory topic)
//		Solve - 
//		2.1 Create stream of ints between 1-100 & display all even elements.
//		2.2  Create Stream<Integer> from a fixed size list (un sorted ) of integers , sort n display it. (all in single java statement , using chain/pipe line of operations)
//		2.3 Display all product names of a particular category , exceeding specific price.
//		I/P category name & price.
		//streaming the data from source returns IntStream
				//above is the way to stream the data
		Arrays.stream(arr)   //source -- intermediate -- terminal
				.filter(i->i%2!=0)
		.forEach(p->System.out.print(p+" "));//for each is a terminal operation
		
		List<Student > lst = popula
		
	}

}
