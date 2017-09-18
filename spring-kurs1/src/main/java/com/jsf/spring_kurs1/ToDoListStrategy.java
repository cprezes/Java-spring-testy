package com.jsf.spring_kurs1;

import java.util.List;

import com.jsf.spring_kurs1.model.Tasks;

public interface ToDoListStrategy {

	List<Tasks> createTodoList();

}