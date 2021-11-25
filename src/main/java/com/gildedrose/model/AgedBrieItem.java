package com.gildedrose.model;

public class AgedBrieItem extends Item {

	AgedBrieItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {

		super.sellIn = super.sellIn - 1;

		if (super.quality < 50) {

			super.quality = super.quality + 1;

			if (super.sellIn < 0) {
				super.quality = super.quality + 1;
			}
		}
	}

}
