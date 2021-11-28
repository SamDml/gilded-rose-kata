package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.gildedrose.model.Item;
import com.gildedrose.model.ItemFactory;

public class AgedBrieItemTest {

	@Test
	public void agedBrieItemItemNameReturnsItemName() {

		Item item = ItemFactory.agedBrieItem(10, 10);

		String returnedItemName = item.getName();

		assertTrue(returnedItemName instanceof String);
	}

	@Test
	public void agedBrieItemItemSellinDecreasesBy1AfterUpdateQuality() {

		Item item = ItemFactory.agedBrieItem(10, 10);

		item.doAge();

		assertEquals(9, item.getSellIn());
	}

	@Test
	public void agedBrieItemItemQualityIncreasesByOneOnUpdateQualityBelow50() {

		Item item;
		for (int initialQuality = 0; initialQuality < 50; initialQuality++) {
			item = ItemFactory.agedBrieItem(10, initialQuality);

			item.doAge();

			assertEquals(initialQuality + 1, item.getQuality());
		}
	}

	@Test
	public void agedBrieItemItemQualityDoesNotExceed50AfterUpdateQuality() {

		Item item = ItemFactory.agedBrieItem(10, 50);

		item.doAge();

		assertEquals(50, item.getQuality());
	}

	@Test
	public void agedBrieItemItemQualityOnlyIncreasesByOneWhenUpdateQualityOneBelow50() {

		Item item = ItemFactory.agedBrieItem(10, 49);

		item.doAge();

		assertEquals(50, item.getQuality());
	}

}
