package com.cg.libraries.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lib")
public class Library  implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="book_Id")
	private int bookId;
	@Column(name="Book_Name",length=20)
	private String bookName;
	@Column(name="Book_Author",length=20)
	private String bootAuthor;
	@Column(name="dept_name",length=20)
	private String deptName;
	
	
	public Library() {
		
	}
	public Library(int bookId, String bookName, String bootAuthor, String deptName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bootAuthor = bootAuthor;
		this.deptName = deptName;
	}
	public int getBookId() {
		return bookId;
	}
	/*public void setBookId(int bookId) {
		this.bookId = bookId;
	}*/
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBootAuthor() {
		return bootAuthor;
	}
	public void setBootAuthor(String bootAuthor) {
		this.bootAuthor = bootAuthor;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
