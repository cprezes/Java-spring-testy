package com.jsf.spring_kurs1.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.jsf.spring_kurs1.model.Tasks;

@Repository
public class TaskRepository {
//	@Autowired
//	private SimpleJdbcInsert taskInsert;
//	@Autowired
//	public TaskRepository (DataSource dataSource){
//		taskInsert= new SimpleJdbcInsert(dataSource).withTableName("cds");
//		
//	}
//	@Autowired
//	public void saveTask(Tasks task) {
//		Map<String, Object> params =new HashMap<String , Object>();
//		params.put("subiect", Tasks.getSubiect());
//		params.put("start_date", new Date());
//		
//		
//		taskInsert.execute(params);
//	}
	@PersistenceContext
	private EntityManager entityManager;
	public void saveTask(Tasks task){
		
	}
	public List<Tasks> findAllTasks() {
		javax.persistence.Query query=entityManager.createQuery("from cdcol");
		return query.getResultList();
	}
	
}
 