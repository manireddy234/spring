package com.cg.libraries.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.libraries.bean.Library;
import com.cg.libraries.repo.LibraryRepo;

@Service("libraryService")
public class LibraryServiceImpl implements ILibraryService{
	@Autowired
	private LibraryRepo repo;

	@Override
	public void addBook(Library library) {
		repo.save(library);
	}

	@Override
	public void deleteBook(int id) {
		repo.deleteById(id);
	}



	@Override
	public List<Library> showAll() {
		List<Library> lib=new ArrayList<>();
		repo.findAll().forEach(lib::add);
		return lib;
	}

	@Override
	public void updateBook(Library library) {
		repo.save(library);
	}

}
