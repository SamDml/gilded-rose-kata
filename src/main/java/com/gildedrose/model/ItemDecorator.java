package com.gildedrose.model;

public abstract class ItemDecorator implements Item {

	Item item;

	public ItemDecorator(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return item.getName() + ", " + item.getSellIn() + ", " + item.getQuality();
	}

}
