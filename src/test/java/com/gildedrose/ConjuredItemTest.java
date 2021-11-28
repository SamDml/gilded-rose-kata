package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.model.Item;
import com.gildedrose.model.ItemFactory;

public class ConjuredItemTest {

	@Test
	public void test() {
		int initialQuality = 10;
		Item normalItem = ItemFactory.normalItem("item 1", 10, initialQuality);
		Item conjuredItem = ItemFactory.conjuredItem("item 2", 10, initialQuality);

		normalItem.doAge();
		conjuredItem.doAge();

		int normalItemQualityDifference = initialQuality - normalItem.getQuality();
		int conjuredItemQualityDifference = initialQuality - conjuredItem.getQuality();

		assertEquals(normalItemQualityDifference * 2, conjuredItemQualityDifference);
	}
}
