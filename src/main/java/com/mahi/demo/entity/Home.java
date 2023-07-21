package com.mahi.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Home {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		private String course;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		@Override
		public String toString() {
			return "Home [id=" + id + ", course=" + course + "]";
		}

		
	}



