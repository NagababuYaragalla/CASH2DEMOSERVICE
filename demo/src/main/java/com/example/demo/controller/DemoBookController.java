package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DemoBook;
import com.example.demo.model.DemoBookResponse;
import com.example.demo.repository.DemoBookRepository;
import com.example.demo.service.DemoBookService;

@RestController
public class DemoBookController {
	@Autowired
	DemoBookService demoBookService;

	@Autowired
	DemoBookRepository demoBookRepository;
	// save book details in db		
	@PostMapping("/savebookdetails")
	@ResponseStatus(HttpStatus.CREATED)
		public String saveBookDetails(@RequestBody DemoBook demobook, DemoBookResponse demoBookResponse) {
		DemoBookResponse demobookres = new DemoBookResponse();
		demobookres= demoBookService.saveBookService(demobook,demoBookResponse);
		System.out.println(demobook.getId()+" "+demobook.getTitle()+"  "+demobook.getAuthor()+"  "+demobook.getPrice());
			  return demobookres.getDemobookstatusresponse();
		}

	// get books details from db	
	@GetMapping("/getbooksdetails")
	@ResponseStatus(HttpStatus.FOUND)
	public List<DemoBook> getBookDetails() {

		return demoBookService.getBookDetailsService();
	}
	
	// get book details from db	
	@GetMapping("/getbookdetailsById/{id}")
	@ResponseStatus(HttpStatus.FOUND)
	public DemoBook getBookbyId(@PathVariable("id")  int id) {
		return demoBookService.getBookDetailsById(id);
		
	}

}
