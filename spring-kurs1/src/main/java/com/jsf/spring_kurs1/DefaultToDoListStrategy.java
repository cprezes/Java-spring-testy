package com.jsf.spring_kurs1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jsf.spring_kurs1.model.Tasks;

@Service
public class DefaultToDoListStrategy implements ToDoListStrategy {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jsf.spring_kurs1.ToDoListStrategy#createTodoList()
	 */
	public List<Tasks> createTodoList() {
		List<Tasks> todoList = new ArrayList<Tasks>();
		todoList.add(new Tasks(1));
		todoList.add(new Tasks(2));
		todoList.add(new Tasks(3));
		todoList.add(new Tasks(4));
		return todoList;

	}
}
