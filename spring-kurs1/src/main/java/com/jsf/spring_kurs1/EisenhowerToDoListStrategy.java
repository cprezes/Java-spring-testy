package com.jsf.spring_kurs1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jsf.spring_kurs1.model.Tasks;
import com.jsf.spring_kurs1.service.ToDoListQualifier;
import com.jsf.spring_kurs1.service.ToDoListType;
@Service
@ToDoListQualifier(strategy=ToDoListType.EISENHOWER)
public class EisenhowerToDoListStrategy implements ToDoListStrategy {

	public List<Tasks> createTodoList() {
		List<Tasks> todoList = new ArrayList<Tasks>();
		todoList.add(new Tasks(3));
		todoList.add(new Tasks(4));
		todoList.add(new Tasks(1));
		todoList.add(new Tasks(2));

		return todoList;

	}

}
