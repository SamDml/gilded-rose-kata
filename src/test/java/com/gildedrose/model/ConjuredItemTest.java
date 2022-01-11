package com.gildedrose.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConjuredItemTest {

	@Test
	public void conjuredItemDegradesTwiceAsFastInQualityAsNormalItem() {
		int initialQuality = 10;
		Item normalItem = ItemFactory.normalItem("item 1", 10, initialQuality);
		Item conjuredItem = ItemFactory.conjuredItem("item 2", 10, initialQuality);

		normalItem.doAge();
		conjuredItem.doAge();

		int normalItemQualityDifference = initialQuality - normalItem.getQuality();
		int conjuredItemQualityDifference = initialQuality - conjuredItem.getQuality();

		assertEquals(normalItemQualityDifference * 2, conjuredItemQualityDifference);
	}

	@Test
	public void conjuredItemItemNameReturnsItemName() {

		String itemName = "item 1";
		Item item = ItemFactory.conjuredItem("item 1", 10, 10);

		String returnedItemName = item.getName();

		assertEquals(itemName, returnedItemName);
	}

	@Test
	public void conjuredItemItemSellinDecreasesBy1AfterUpdateQuality() {

		Item item = ItemFactory.conjuredItem("item 1", 10, 10);

		item.doAge();

		assertEquals(9, item.getSellIn());
	}

	@Test
	public void conjuredItemItemQualityDecreasesBy2WhenSellInIsPositiveOrZero() {

		Item item;
		int oldQuality = 20;
		for (int i = 5; i > 0; i--) {
			item = ItemFactory.conjuredItem("item 1", i, oldQuality);

			item.doAge();

			assertEquals(oldQuality - 2, item.getQuality());
			oldQuality = item.getQuality();
		}
	}

	@Test
	public void conjuredItemItemQualityDecreasesBy4WhenSellInBecomesNegative() {

		Item item;
		int oldQuality = 40;
		for (int i = 0; i >= -5; i--) {
			item = ItemFactory.conjuredItem("item 1", i, oldQuality);

			item.doAge();

			assertEquals(oldQuality - 4, item.getQuality());
			oldQuality = item.getQuality();
		}
	}

	@Test
	public void conjuredItemItemQualityDoesNotBecomeNegativeAfterUpdateQuality() {

		Item item = ItemFactory.conjuredItem("item 1", 10, 0);

		item.doAge();

		assertEquals(0, item.getQuality());
	}

	@Test
	public void conjuredItemItemQualityDoesNotDecreaseBy4OnUpdateQualityWhenSellInBecomesNegativeAndQualityBecomesZero() {

		Item item = ItemFactory.conjuredItem("item 1", 0, 1);

		item.doAge();

		assertEquals(0, item.getQuality());
	}

}
