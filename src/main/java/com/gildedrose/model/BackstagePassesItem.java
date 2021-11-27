package com.gildedrose.model;

public class BackstagePassesItem implements Item {

	private String name;

	private int sellIn;

	private int quality;

	BackstagePassesItem(String name, int sellIn, int quality) {
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

		increaseQuality();

		if (sellIn < 11) {
			increaseQuality();
		}

		if (sellIn < 6) {
			increaseQuality();
		}

		decreaseSellIn();

		expire();
	}

	private void decreaseSellIn() {
		sellIn = sellIn - 1;
	}

	public void increaseQuality() {
		if (quality < 50) {
			quality = quality + 1;
		}
	}

	private void expire() {
		if (sellIn < 0) {
			quality = 0;
		}
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}

}
