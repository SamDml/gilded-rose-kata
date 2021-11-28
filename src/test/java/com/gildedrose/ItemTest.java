package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.gildedrose.model.Item;
import com.gildedrose.model.ItemFactory;

public class ItemTest {

	@Test
	public void normalItemItemNameReturnsItemName() {

		String itemName = "item 1";
		Item item = ItemFactory.normalItem("item 1", 10, 10);

		String returnedItemName = item.getName();

		assertEquals(itemName, returnedItemName);
	}

	@Test
	public void agedBrieItemItemNameReturnsItemName() {

		Item item = ItemFactory.agedBrieItem(10, 10);

		String returnedItemName = item.getName();

		assertTrue(returnedItemName instanceof String);
	}

	@Test
	public void backstagePassesItemItemNameReturnsItemName() {

		Item item = ItemFactory.backstagePassesItem(10, 10);

		String returnedItemName = item.getName();

		assertTrue(returnedItemName instanceof String);
	}

	@Test
	public void sulfurasItemItemNameReturnsItemName() {

		Item item = ItemFactory.sulfurasItem(10);

		String returnedItemName = item.getName();

		assertTrue(returnedItemName instanceof String);
	}

	@Test
	public void normalItemItemSellinDecreasesBy1AfterUpdateQuality() {

		Item item = ItemFactory.normalItem("item 1", 10, 10);

		item.updateQuality();

		assertEquals(9, item.getSellIn());
	}

	@Test
	public void agedBrieItemItemSellinDecreasesBy1AfterUpdateQuality() {

		Item item = ItemFactory.agedBrieItem(10, 10);

		item.updateQuality();

		assertEquals(9, item.getSellIn());
	}

	@Test
	public void backstagePassesItemItemSellinDecreasesBy1AfterUpdateQuality() {

		Item item = ItemFactory.backstagePassesItem(10, 10);

		item.updateQuality();

		assertEquals(9, item.getSellIn());
	}

	@Test
	public void sulfurasItemSellInDoesNotChangeOnUpdateQuality() {

		Item item = ItemFactory.sulfurasItem(10);

		item.updateQuality();

		assertEquals(10, item.getSellIn());
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

	@Test
	public void agedBrieItemItemQualityIncreasesByOneOnUpdateQualityBelow50() {

		Item item;
		for (int initialQuality = 0; initialQuality < 50; initialQuality++) {
			item = ItemFactory.agedBrieItem(10, initialQuality);

			item.updateQuality();

			assertEquals(initialQuality + 1, item.getQuality());
		}
	}

	@Test
	public void agedBrieItemItemQualityDoesNotExceed50AfterUpdateQuality() {

		Item item = ItemFactory.agedBrieItem(10, 50);

		item.updateQuality();

		assertEquals(50, item.getQuality());
	}

	@Test
	public void agedBrieItemItemQualityOnlyIncreasesByOneWhenUpdateQualityOneBelow50() {

		Item item = ItemFactory.agedBrieItem(10, 49);

		item.updateQuality();

		assertEquals(50, item.getQuality());
	}

	@Test
	public void backstagePassesItemItemQualityIncreasesBy2WhenSellInIs10OrLessAndAbove5() {

		Item item;
		int oldQuality;
		for (int i = 10; i > 5; i--) {
			item = ItemFactory.backstagePassesItem(i, 10);
			oldQuality= item.getQuality();

			item.updateQuality();

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

			item.updateQuality();

			assertEquals(oldQuality + 3, item.getQuality());
			oldQuality = item.getQuality();
		}
	}

	@Test
	public void backstagePassesItemItemQualityDropsToZeroAfterSellingDate() {

		Item item = ItemFactory.backstagePassesItem(0, 25);

		item.updateQuality();

		assertEquals(0, item.getQuality());
	}

	@Test
	public void sulfurasItemItemQualityDoesNotChangeOnUpdateQuality() {

		Item item = ItemFactory.sulfurasItem(10);

		item.updateQuality();

		assertEquals(80, item.getQuality());
	}

}
