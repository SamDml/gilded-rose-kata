package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.model.Item;
import com.gildedrose.model.ItemFactory;

public class NormalItemTest {

	@Test
	public void normalItemItemNameReturnsItemName() {

		String itemName = "item 1";
		Item item = ItemFactory.normalItem("item 1", 10, 10);

		String returnedItemName = item.getName();

		assertEquals(itemName, returnedItemName);
	}

	@Test
	public void normalItemItemSellinDecreasesBy1AfterUpdateQuality() {

		Item item = ItemFactory.normalItem("item 1", 10, 10);

		item.updateQuality();

		assertEquals(9, item.getSellIn());
	}

	@Test
	public void normalItemItemQualityDecreasesBy1WhenSellInIsPositiveOrZero() {

		Item item;
		int oldQuality = 20;
		for (int i = 5; i > 0; i--) {
			item = ItemFactory.normalItem("item 1", i, oldQuality);

			item.updateQuality();

			assertEquals(oldQuality - 1, item.getQuality());
			oldQuality = item.getQuality();
		}
	}

	@Test
	public void normalItemItemQualityDecreasesBy2WhenSellInBecomesNegative() {

		Item item;
		int oldQuality = 20;
		for (int i = 0; i >= -5; i--) {
			item = ItemFactory.normalItem("item 1", i, oldQuality);

			item.updateQuality();

			assertEquals(oldQuality - 2, item.getQuality());
			oldQuality = item.getQuality();
		}
	}

	@Test
	public void normalItemItemQualityDoesNotBecomeNegativeAfterUpdateQuality() {

		Item item = ItemFactory.normalItem("item 1", 10, 0);

		item.updateQuality();

		assertEquals(0, item.getQuality());
	}

	@Test
	public void normalItemItemQualityDoesNotDecreaseByTwoOnUpdateQualityWhenSellInBecomesNegativeAndQualityBecomesZero() {

		Item item = ItemFactory.normalItem("item 1", 0, 1);

		item.updateQuality();

		assertEquals(0, item.getQuality());
	}

}
