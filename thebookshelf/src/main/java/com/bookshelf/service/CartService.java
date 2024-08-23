package com.bookshelf.service;

import com.bookshelf.entities.Cart;


public interface CartService {

	 public Cart addBookToCart(Long userId, Long bookId, int quantity);
	 
	 public Cart getUserCart(Long userId);
	 
	 public Cart updateBookQuantity(Long userId, Long bookId, int quantity);
	 
	 public void removeBookFromCart(Long userId, Long bookId);

	
}
