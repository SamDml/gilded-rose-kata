package com.gildedrose.model;

public class ConjuredItem extends ItemDecorator {

	public ConjuredItem(Item item) {
		super(item);
	}

	@Override
	public String getName() {
		return super.item.getName();
	}

	@Override
	public int getSellIn() {
		return super.item.getSellIn();
	}

	@Override
	public int getQuality() {
		return super.item.getQuality();
	}

	@Override
	public void doAge() {
		super.item.doAge();
		super.item.updateQuality();
	}

	@Override
	public void updateQuality() {
		super.item.updateQuality();
	}

}
