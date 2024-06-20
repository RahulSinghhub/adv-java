package com.app.tester;

import static app.com.utils.Utility.populateList;
import static app.com.validations.CustomValidations.validateInput;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import app.com.core.Status;
import app.com.core.Task;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			List<Task> taskList = populateList();
			boolean flag = false;

			while (!flag) {
				try {
					System.out.println(
							"1. Add New Task                       \n" + "2. Delete a task                         \n"
									+ "3. Update task status               \n" + "4. Display all pending tasks     \n"
									+ "5. Display all pending tasks for today           \n"
									+ "6. Display all tasks sorted by taskDate \n" + "0. for exit press o");

					switch (sc.nextInt()) {
					case 1:
						System.out.println("Add New Task");
						taskList.add(validateInput(sc.next(), sc.next(), sc.next()));
						taskList.forEach(s -> System.out.println(s));
						break;
					case 2:
						System.out.println(" Delete a task");
						// inp = index output all tasklist except the id selected
						// validations required
//			            String str = removeElement(sc.nextInt(),taskList);
//			            System.out.println(str);
//			            taskList.forEach(s->System.out.println(s));

						int t1 = sc.nextInt();
						taskList.stream().filter(a -> a.getTaskId() != t1).collect(Collectors.toList());

						int itemId = sc.nextInt();
						taskList.removeIf(item -> item.getTaskId() == itemId);
						taskList.forEach(e -> System.out.println(e));

						break;
					case 3:
						System.out.println("Update task status");
						// give in the id to be updated and then update task status according to value
						// you provide
						// input taskid , task enum val , list
						// validate taskid then validate task enum value you provided and then update it
						int taskId = sc.nextInt();
						String t = sc.next().toUpperCase();
						taskList.stream().filter(i -> i.getTaskId() == taskId).findFirst()
								.ifPresent(s -> s.setStatus(Status.valueOf(t)));
						taskList.forEach(e -> System.out.println(e));
						break;
					case 4:
						System.out.println("Display all pending tasks");
						taskList.stream().filter(s -> s.getStatus() == Status.PENDING)
								.forEach(s -> System.out.println(s));
						break;
					case 5:
						System.out.println("Display all pending tasks for today");

						taskList.stream()
								.filter(s -> s.getStatus() == Status.PENDING && s.getTaskDate().equals(LocalDate.now()))
								.forEach(s -> System.out.println(s));
						break;
					case 6:
						System.out.println("Display all tasks sorted by taskDate");
						/*
						 * Collections.sort(taskList); taskList.forEach(e->System.out.println(e));
						 */

						/*
						 * List<Task> ttt=
						 * taskList.stream().sorted((t1,t2)->t1.getTaskDate().compareTo(t2.getTaskDate()
						 * )) .collect(Collectors.toList()); ttt.forEach(e->System.out.println(e));
						 */
						List<Task> ttt = taskList.stream().sorted(Comparator.comparing(Task::getTaskDate).reversed())
								.collect(Collectors.toList());
						ttt.forEach(e -> System.out.println(e));
						break;
					case 0:
						System.out.println("exiting now");
						flag = true;
						break;

					}

				}

				catch (Exception e) {
					e.printStackTrace();
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
