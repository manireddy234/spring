package com.cg.libraries.service;

import java.util.List;

import com.cg.libraries.bean.Library;

public interface ILibraryService {

	public void addBook(Library library);
	
	public List<Library> showAll();

	public void updateBook(Library library);

	void deleteBook(int id);
}
