package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.gildedrose.model.Item;
import com.gildedrose.model.ItemFactory;

public class BackstagePassesItemTest {

	@Test
	public void backstagePassesItemItemNameReturnsItemName() {

		Item item = ItemFactory.backstagePassesItem(10, 10);

		String returnedItemName = item.getName();

		assertTrue(returnedItemName instanceof String);
	}

	@Test
	public void backstagePassesItemItemSellinDecreasesBy1AfterUpdateQuality() {

		Item item = ItemFactory.backstagePassesItem(10, 10);

		item.doAge();

		assertEquals(9, item.getSellIn());
	}

	@Test
	public void backstagePassesItemItemQualityIncreasesBy2WhenSellInIs10OrLessAndAbove5() {

		Item item;
		int oldQuality;
		for (int i = 10; i > 5; i--) {
			item = ItemFactory.backstagePassesItem(i, 10);
			oldQuality= item.getQuality();

			item.doAge();

			assertEquals(oldQuality + 2, item.getQuality());
			oldQuality = item.getQuality();
		}
	}

	@Test
	public void backstagePassesItemItemQualityIncreasesBy3WhenSellInIs5OrLessAndAboveZero() {

		Item item;
		int oldQuality;
		for (int i = 5; i > 0; i--) {
			item = ItemFactory.backstagePassesItem(i, 10);
			oldQuality= item.getQuality();

			item.doAge();

			assertEquals(oldQuality + 3, item.getQuality());
			oldQuality = item.getQuality();
		}
	}

	@Test
	public void backstagePassesItemItemQualityDropsToZeroAfterSellingDate() {

		Item item = ItemFactory.backstagePassesItem(0, 25);

		item.doAge();

		assertEquals(0, item.getQuality());
	}

}
