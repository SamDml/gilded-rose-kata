package com.gildedrose.model;

import com.gildedrose.QualityLimitException;

public class ItemFactory {

	public static Item normalItem(String name, int sellIn, int quality) {
		if (quality > 50) {
			throw new QualityLimitException("Quality for item cannot exceed 50.");
		}
		return new NormalItem(name, sellIn, quality);
	}

	public static Item agedBrieItem(int sellIn, int quality) {
		if (quality > 50) {
			throw new QualityLimitException("Quality for item cannot exceed 50.");
		}
		return new AgedBrieItem("Aged Brie", sellIn, quality);
	}

	public static Item backstagePassesItem(int sellIn, int quality) {
		if (quality > 50) {
			throw new QualityLimitException("Quality for item cannot exceed 50.");
		}
		return new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
	}

	public static Item sulfurasItem(int sellIn, int quality) {
		return new SulfurasItem("Sulfuras, Hand of Ragnaros", sellIn, quality);
	}

}
