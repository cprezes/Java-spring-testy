package com.jsf.spring_kurs1.service;

import  com.jsf.spring_kurs1.model.Util;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import com.jsf.spring_kurs1.DefaultToDoListStrategy;
import com.jsf.spring_kurs1.ToDoListStrategy;
import com.jsf.spring_kurs1.model.Tasks;
import com.jsf.spring_kurs1.model.Tasks.TaskBulider;



@Service

public class TaskService {
	@Autowired
	@ToDoListQualifier(strategy = ToDoListType.EISENHOWER)
	private ToDoListStrategy toDoListChoserStrategy;
	@Resource
	private ApplicationContext context;
	@Value("${serviceId.default}")
	private String serviceId;
	public String getServiceId() {
		return serviceId;
	}

	@PostConstruct
	public void startup() {

		System.out.println("construct ");
	}

	@PreDestroy
	public void destruct() {

		System.out.println("destruct ");
	}

	public List<Tasks> findCurrentTodoList() {
		System.out.println("Info o kntekscie->> " + context.toString());
		List<Tasks> todoList = toDoListChoserStrategy.createTodoList();

		return todoList;

	}
	
	public void addTask(String subiect, String startdate, String closeDate) {
		
	 TaskBulider tasks=	Tasks.New()
			 .withSubiect("")
			 .startsOn(Util.createDate(startdate))
			 .closesOn(Util.createDate(closeDate)).
			 build();
			 
	}

}
