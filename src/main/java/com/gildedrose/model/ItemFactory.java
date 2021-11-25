package com.gildedrose.model;

public class ItemFactory {

	public static Item normalItem(String name, int sellIn, int quality) {
		return new NormalItem(name, sellIn, quality);
	}

	public static Item agedBrieItem(int sellIn, int quality) {
		return new AgedBrieItem("Aged Brie", sellIn, quality);
	}

	public static Item backstagePassesItem(int sellIn, int quality) {
		return new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
	}

	public static Item sulfurasItem(int sellIn, int quality) {
		return new SulfurasItem("Sulfuras, Hand of Ragnaros", sellIn, quality);
	}

}
