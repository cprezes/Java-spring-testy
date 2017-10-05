package com.jsf.spring_kurs1.model;

import java.util.Date;

import org.springframework.context.support.StaticApplicationContext;
import org.springframework.scheduling.config.Task;

public class Tasks {
	private int id;
	private String subiect;
	private Date startDate;
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
