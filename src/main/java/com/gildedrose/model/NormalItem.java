package com.gildedrose.model;

public class NormalItem implements Item {

	private String name;

	private int sellIn;

	private int quality;

	NormalItem(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSellIn() {
		return sellIn;
	}

	@Override
	public int getQuality() {
		return quality;
	}

	@Override
	public void doAge() {

		decreaseSellIn();
		updateQuality();
	}

	private void decreaseSellIn() {
		sellIn = sellIn - 1;
	}

	@Override
	public void updateQuality() {

		decreaseQuality();

		if (sellIn < 0) {
			decreaseQuality();
		}
	}

	private void decreaseQuality() {
		if (quality > 0) {
			quality = quality - 1;
		}
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}

}
