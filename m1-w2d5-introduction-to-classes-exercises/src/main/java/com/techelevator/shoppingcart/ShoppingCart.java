package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems;
	private double totalAmountOwed;
	
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	public void setTotalAmountOwed(int totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}
	
	public double getAveragePricePerItem() {
		if (totalNumberOfItems == 0) {
			return 0;
		} else {
			return this.totalAmountOwed / this.totalNumberOfItems;
		}
	}
	public void addItems(int numberOfItems, double pricePerItem) {
		totalNumberOfItems += numberOfItems;
		totalAmountOwed += pricePerItem * numberOfItems;
		
	}
	public void empty() {
		this.totalNumberOfItems = 0;
		this.totalAmountOwed = 0.0;
	}
	
}
