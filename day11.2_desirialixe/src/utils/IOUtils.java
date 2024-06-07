package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public interface IOUtils {
//add a static method for storing student details , in a bin file using ser.
//	static void writeDetails(Map<String, Student> students, String fileName) throws IOException {
//		// Java App --> OOS --> FOS (bin file)//using 
//		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
//			out.writeObject(students);// serialization
//		} // JVM : out.close --fos.close --close the file handle
//	}

	// add a static method for restoring student details , from a bin file using
	// de-ser.
	
	static Object /*Map<String, Student>*/ readDetails(String fileName) throws IOException, ClassNotFoundException {
		// Java App <--- OIS <--- FIS (bin file)
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			return  in.readObject();
		}
	}

}
