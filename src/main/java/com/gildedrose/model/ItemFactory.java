package com.gildedrose.model;

import com.gildedrose.QualityLimitException;

public class ItemFactory {

	private static final int MAX_QUALITY = 50;
	private static final String EXCEPTION_MESSAGE_QUALITY_EXCEEDS_MAX = "Quality for item cannot exceed %s.";
	private static final String EXCEPTION_MESSAGE_QUALITY_NEGATIVE = "Quality for item cannot be negative.";

	public static Item normalItem(String name, int sellIn, int quality) {

		validateQuality(quality);

		return new NormalItem(name, sellIn, quality);
	}

	public static Item agedBrieItem(int sellIn, int quality) {

		validateQuality(quality);

		return new AgedBrieItem("Aged Brie", sellIn, quality);
	}

	public static Item backstagePassesItem(int sellIn, int quality) {

		validateQuality(quality);

		return new BackstagePassesItem("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
	}

	public static Item sulfurasItem(int sellIn) {
		return new SulfurasItem("Sulfuras, Hand of Ragnaros", sellIn, 80);
	}

	private static void validateQuality(int quality) {

		if (quality > MAX_QUALITY) {
			throw new QualityLimitException(String.format(EXCEPTION_MESSAGE_QUALITY_EXCEEDS_MAX, MAX_QUALITY));
		}
		if (quality < 0) {
			throw new QualityLimitException(EXCEPTION_MESSAGE_QUALITY_NEGATIVE);
		}
	}

}
