package com.gildedrose.model;

public class BackstagePassesItem extends Item {

	BackstagePassesItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {

		if (super.quality < 50) {
			super.quality = super.quality + 1;
		}

		if (super.sellIn < 11) {
			if (super.quality < 50) {
				super.quality = super.quality + 1;
			}
		}

		if (super.sellIn < 6) {
			if (super.quality < 50) {
				super.quality = super.quality + 1;
			}
		}

		super.sellIn = super.sellIn - 1;

		if (super.sellIn < 0) {
			super.quality = super.quality - super.quality;
		}
	}

}
