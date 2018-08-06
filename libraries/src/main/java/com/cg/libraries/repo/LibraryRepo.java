package com.cg.libraries.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.libraries.bean.Library;

@Repository("libraryRepo")
public interface LibraryRepo extends CrudRepository<Library, Integer>{

}
