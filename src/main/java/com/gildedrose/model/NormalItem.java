package com.gildedrose.model;

public class NormalItem extends Item {

	public NormalItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateQuality() {

		if (super.quality > 0) {

			super.quality = super.quality - 1;

			super.sellIn = super.sellIn - 1;

			if (super.sellIn < 0) {
				if (super.quality > 0) {

					super.quality = super.quality - 1;
				}
			}
		}
	}

}
