package com.jsf.spring_kurs1.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.support.StaticApplicationContext;
import org.springframework.scheduling.config.Task;
@Entity
public class Tasks {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getSubiect() {
		return subiect;
	}

	public void setSubiect(String subiect) {
		this.subiect = subiect;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="interpret")
	private static String subiect;
	@Column(name="titel")
	private Date startDate;
	@Column(name="jahr")
	private Date closeDate;

	public Tasks() {

	}

	public Tasks(int i) {
		id = i;
	}

	public static TaskBulider New() {
		return new TaskBulider();
	} 

	public static class TaskBulider {
		private Tasks task;

		private TaskBulider() {
			task = new Tasks();
		}

		public TaskBulider withId(int id) {
			task.id = id;
			return this;
		}

		public TaskBulider withSubiect(String subiect) {
			task.subiect = subiect;
			return this;
		}

		public TaskBulider startsOn(Date starts) {
			task.startDate = starts;
			return this;
		}

		public TaskBulider closesOn(Date close) {
			task.closeDate = close;
			return this;
		}

		public TaskBulider build() {
			return this;

		}
	}

	@Override
	public String toString() {
		return "Tasks [id=" + id + ", subiect=" + subiect + ", startDate=" + startDate + ", closeDate=" + closeDate
				+ "]";
	}

}
