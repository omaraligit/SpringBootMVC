package io.springboot.mvc;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("rct")
public class BookServiceNoSQL implements BookService {

	Set<Book> db;
	
	Logger logger = LoggerFactory.getLogger(BookServiceNoSQL.class);
	
	public BookServiceNoSQL() {
		this.db = new HashSet<Book>();
	}
	
	@Override
	public Set<Book> findAll() {
		// TODO Auto-generated method stub
		return this.db;
	}

	@Override
	public Book create(Book obj) {
		// TODO Auto-generated method stub
		this.db.add(obj);
		return obj;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		this.db.removeIf(book->book.getId() == id);
	}

	@Override
	public void deleteAll() {
		this.db.removeIf(book->true);
	}

	@Override
	public Book findById(Long id) {
		// TODO Auto-generated method stub
		final Book b;
		for (Book book : db) {
			if(book.getId() == id)
				return book;
		}
		return null;
	}

}
