package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Books")
public class Books {
	@Id
	@Column(name="bookid")
	private int bookid;
	@Column(name="title")
	private String title;
	@Column(name="author")
	private String author;
	@Column(name="publisher")
	private String publisher;
	@Column(name="subject")
	private String subject;
	@Column(name="category")
	private String category;
	@Column(name="edition")
	private String edition;
	@Column(name="noofbooks")
	private String noofbooks;
	@Column(name="language")
	private String language;
	@Column(name="imageurl")
	private String imageurl;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getNoofbooks() {
		return noofbooks;
	}
	public void setNoofbooks(String noofbooks) {
		this.noofbooks = noofbooks;
	}
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	

}
