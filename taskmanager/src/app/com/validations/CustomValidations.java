package app.com.validations;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import app.com.core.Task;

public class CustomValidations {
	
	public static Task validateInput(String taskName, String description, String taskDate){
		LocalDate dates=  LocalDate.parse(taskDate);
		return new Task(taskName,description,dates);
	}
	public static String removeElement(int taskId,List<Task> taskList) 
	{
		Iterator<Task> itr = taskList.iterator();
		while(itr.hasNext())
			if(itr.next().getTaskId()==taskId)
				itr.remove();
		
		
		
		return "id not in list";
	}
	
}
