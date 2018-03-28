package com.example.cassandra.springdatacassandra;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.cassandra.springdatacassandra.delegate.ServiceDelegate;
import com.example.cassandra.springdatacassandra.models.Book;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataCassandraApplicationTests {

	private static final Logger LOGGER = LogManager.getLogger();
	@Autowired
	ServiceDelegate delegate;

	@Test
	public void addBookSuccess() {
		Book b = new Book();
		b.setIsbn(UUID.randomUUID());
		b.setTitle("A Song of Ice and Fire");
		b.setPublisher("HBO");
		b.addTag("GOT");
		b.addTag("Stark");

		boolean isAdded = delegate.addBook(b);
		Assert.assertTrue(isAdded);
	}

	@Test
	public void getBookById() {
		UUID uuid = UUID.fromString("27ad5e67-ae15-4aaa-90f9-5d1784d5ef1a");
		Book b = delegate.getBook(uuid);
		LOGGER.info(b);
		Assert.assertNotNull(b);
	}

	@Test
	public void contextLoads() {
	}

}
