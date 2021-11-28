package com.gildedrose.model;

public class AgedBrieItem implements Item {

	private String name;

	private int sellIn;

	private int quality;

	AgedBrieItem(String name, int sellIn, int quality) {
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
	public void updateQuality() {

		decreaseSellIn();

		increaseQuality();

		if (sellIn < 0) {
			increaseQuality();

		}
	}

	private void decreaseSellIn() {
		sellIn = sellIn - 1;
	}

	public void increaseQuality() {
		if (quality < 50) {
			quality = quality + 1;
		}
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}

}
