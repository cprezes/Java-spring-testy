package com.jsf.spring_kurs1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsf.spring_kurs1.model.Tasks;
import com.jsf.spring_kurs1.service.TaskService;

public class Runner {
	static ClassPathXmlApplicationContext factory;

	public static void main(String[] args) throws SQLException {

		factory = new ClassPathXmlApplicationContext("META-INF/application-context.xml");
		TaskService taskService = factory.getBean(TaskService.class);
		TaskService seccoundTaskService = factory.getBean(TaskService.class);

		if (taskService == seccoundTaskService) {
			System.out.println("Takie same obiekty");
		} else {
			System.out.println("inne ");
		}

		String serviceId = taskService.getServiceId();
		System.out.println("Id srervisu to: " + serviceId);

		List<Tasks> todoList = taskService.findCurrentTodoList();
		System.out.println(todoList);
		
		
		baza();
	}

	public static void baza() throws SQLException {
		DataSource dataSource = factory.getBean(DataSource.class);
		System.out.print(dataSource);
		Connection connection = dataSource.getConnection();
		Statement statement = connection.createStatement();
		if (statement.execute("select * from cds;")) {
			System.out.println("wykonano");
			ResultSet resultSet = statement.executeQuery("select * from cds;");
			java.sql.ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (resultSet.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						System.out.print(",  ");
					String columnValue = resultSet.getString(i);
					System.out.print(columnValue + " " + rsmd.getColumnName(i));
				}
				System.out.println("");
			}
		} else {
			System.out.println("nie wykonano");
		}

	}
}