package com.gildedrose.model;

public class SulfurasItem implements Item {

	private String name;

	private int sellIn;

	private int quality;

	SulfurasItem(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public String getName() {
		return name;
	}

	public int getSellIn() {
		return sellIn;
	}

	public int getQuality() {
		return quality;
	}

	@Override
	public void doAge() {

		// do nothing
	}

	@Override
	public void updateQuality() {

		// do nothing
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}

}
