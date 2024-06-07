package app.com.validations;

import java.time.LocalDate;
import java.util.List;

import app.com.core.Task;

public class CustomValidations {
	
	public static Task validateInput(String taskName, String description, String taskDate){
		LocalDate dates=  LocalDate.parse(taskDate);
		return new Task(taskName,description,dates);
	}

}
