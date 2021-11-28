package com.gildedrose.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SulfurasItemTest {

	@Test
	public void sulfurasItemItemNameReturnsItemName() {

		Item item = ItemFactory.sulfurasItem(10);

		String returnedItemName = item.getName();

		assertTrue(returnedItemName instanceof String);
	}

	@Test
	public void sulfurasItemSellInDoesNotChangeOnUpdateQuality() {

		Item item = ItemFactory.sulfurasItem(10);

		item.doAge();

		assertEquals(10, item.getSellIn());
	}

	@Test
	public void sulfurasItemItemQualityDoesNotChangeOnUpdateQuality() {

		Item item = ItemFactory.sulfurasItem(10);

		item.doAge();

		assertEquals(80, item.getQuality());
	}

}
