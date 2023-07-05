package org.stjohn.service;

import java.util.List;

import org.stjohn.dao.BookDao;
import org.stjohn.dao.BookDaoImpl;
import org.stjohn.entities.Book;

public class BookServiceImpl implements BookService{
	

	private BookDao dao;
	
	public BookServiceImpl() {
		dao=new BookDaoImpl();
	}

	@Override
	public Book getBookByID(int id) {
		return dao.getBookByID(id);
	}

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}

	@Override
	public Long getBookCount() {
		return dao.getBookCount();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return dao.getBookByTitle(title);
	}

	@Override
	public List<Book> getBookByPrice(double low, double high) {
		return dao.getBookByPrice(low, high);
	}
}
