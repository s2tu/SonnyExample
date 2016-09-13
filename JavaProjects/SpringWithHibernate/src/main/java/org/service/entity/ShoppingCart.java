package org.service.entity;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	private int cartId;
	private String item;
	/**
	 * @return the cartId
	 */
	public int getCartId() {
		return cartId;
	}
	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}
	/**
	 * @param cartId
	 * @param item
	 */
	public ShoppingCart(int cartId, String item) {
		super();
		this.cartId = cartId;
		this.item = item;
	}
	/**
	 * 
	 */
	public ShoppingCart() {
		super();
	}
	
}
