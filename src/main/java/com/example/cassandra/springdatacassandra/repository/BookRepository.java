package com.example.cassandra.springdatacassandra.repository;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.cassandra.springdatacassandra.models.Book;

public interface BookRepository extends CassandraRepository<Book, UUID> {

	Book findByIsbn(UUID uuid);

}
