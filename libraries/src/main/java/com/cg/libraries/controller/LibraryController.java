package com.cg.libraries.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.libraries.bean.Library;
import com.cg.libraries.service.ILibraryService;

@RestController
public class LibraryController {

	@Autowired
	private ILibraryService service;
	
	@RequestMapping(value="/addBook",method=RequestMethod.POST)
	public void addBook(@RequestBody Library library) {
		service.addBook(library);
	}
	
	@RequestMapping(value="/deleteBook/{id}",method=RequestMethod.DELETE)
	public void deleteBook(@PathVariable int id) {
		service.deleteBook(id);
	}
	@RequestMapping(value="/updateBook",method=RequestMethod.PUT)
	public void updateBook(@RequestBody Library library ) {
		service.updateBook(library);
	}
	@RequestMapping(value="/showAll")
	public List<Library> showAll() {
		return service.showAll();
	}
}
