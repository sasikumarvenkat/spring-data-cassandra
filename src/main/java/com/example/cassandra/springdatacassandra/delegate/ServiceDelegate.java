package com.example.cassandra.springdatacassandra.delegate;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.cassandra.springdatacassandra.models.Book;
import com.example.cassandra.springdatacassandra.repository.BookRepository;

@Component
public class ServiceDelegate {

	private static final Logger LOGGER = LogManager.getLogger(ServiceDelegate.class);

	@Autowired
	BookRepository bookRepo;

	public void getDemoData() {
		LOGGER.traceEntry();
		LOGGER.traceExit();
	}

	public boolean addBook(Book book) {
		LOGGER.entry(book);
		boolean isAdded = false;
		book = bookRepo.insert(book);
		if (book.getIsbn() != null) {
			isAdded = true;
		}
		return LOGGER.traceExit(isAdded);
	}

	public Book getBook(UUID uuid) {
		LOGGER.entry(uuid);
		Book b = bookRepo.findByIsbn(uuid);
		return LOGGER.traceExit(b);
	}
}
