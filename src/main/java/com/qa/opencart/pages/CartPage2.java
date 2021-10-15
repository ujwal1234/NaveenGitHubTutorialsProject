package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class CartPage2 {
	
	private By cartButton = By.id("cart");
	
	public CartPage2() {
		System.out.println("cart page...");
	}
	
	public void addToCart() {
		System.out.println("add to cart");
		System.out.println("add feature is done....");
	}

}
