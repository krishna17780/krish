package com.example.demo.oneToManyUNi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="comment")
	private String comment;
	
	public Review() {
		
	}

	public Review(int id, String commet) {
		super();
		this.id = id;
		this.comment = commet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommet() {
		return comment;
	}

	public void setCommet(String commet) {
		this.comment = commet;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", commet=" + comment + "]";
	}
	

}
