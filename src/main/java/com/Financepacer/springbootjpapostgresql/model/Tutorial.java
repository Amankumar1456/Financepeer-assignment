package com.Financepacer.springbootjpapostgresql.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
    private String title;
    
    @Column(name="UserId")
    private int UserId;

	@Column(name = "body")
	private String body;

	@Column(name = "published")
	private boolean published;

	public Tutorial() {

	}

	public Tutorial(String title, String body, boolean published) {
		this.title = title;
		this.body = body;
		this.published = published;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getbody() {
		return body;
	}

	public void setbody(String body) {
		this.body = body;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + body + ", published=" + published + "]";
	}
}
