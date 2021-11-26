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

		if (quality < 50) {
			quality = quality + 1;
		}

		if (quality < 50) {
			if (sellIn < 11) {
				quality = quality + 1;
			}
		}

		if (sellIn < 6) {
			if (quality < 50) {
				quality = quality + 1;
			}
		}

		sellIn = sellIn - 1;

		if (sellIn < 0) {
			quality = quality - quality;
		}
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}

}
