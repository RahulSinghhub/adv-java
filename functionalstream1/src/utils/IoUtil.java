package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import com.app.core.Student;

public interface IoUtil {
	static void storeDetails(Stream<Student> strm,String fileName) throws IOException {
		//D:\java\madhura_mam\day10-data\code
		//java app -->printwriter 
		try(PrintWriter p = new PrintWriter(new FileWriter(fileName))){
			strm.forEach(i->p.print(i));
		}
		//jvm pw.close(),pw.flush,fw.clode
	}

}
