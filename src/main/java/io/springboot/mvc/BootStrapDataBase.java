package io.springboot.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapDataBase implements CommandLineRunner {

	@Autowired
	BookService bookService;
	
	@Override
	public void run(String... args) throws Exception {
		bookService.create(new Book(1L,"Java For Noobs","This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."));
		bookService.create(new Book(2L,"Csharp For Noobs","This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."));
		bookService.create(new Book(3L,"PHP For Noobs","This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."));
		bookService.create(new Book(4L,"Nodejs For Noobs","This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."));
	}

}
