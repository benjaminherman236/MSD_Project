package com.training.project.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="EVENTS")
public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	@Column(name="EVENT_CODE")
	String code;
	@Column(name="EVENT_NAME")
	String name;
	@Column(name="EVENT_DESCRIPTION")
	String description;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCode() {
			return code;
		}
		public void setEmail(String code) {
			this.code = code;
		}
		public String getDescription() {
			return description;
		}
		public void setPassword(String description) {
			this.description = description;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
}
