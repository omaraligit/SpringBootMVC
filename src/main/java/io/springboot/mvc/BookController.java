package io.springboot.mvc;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {

	@Autowired
	BookService bookService;

	Logger logger = LoggerFactory.getLogger(BookController.class);
	
	
	@GetMapping({"books/index.html", "books/", "bks"})
	public String booksList(Model model) {
		model.addAttribute("books",bookService.findAll());
		return "books/index";
	}
	
	@GetMapping({"book/{id}/view.html", "book/{id}/view", "bks/{id}/view"})
	public String bookView(@PathVariable Long id, Model model) {
		logger.info("viewing book id : " + id.toString());
		model.addAttribute("book",bookService.findById(id));
		return "books/view";
	}
	
}
