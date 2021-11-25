package com.gildedrose;

import org.junit.jupiter.api.Test;

import com.gildedrose.model.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

	private static final String NAME_FIRST_ITEM = "item 1";

    @Test
    void nameFirstItemEqualsNameFirstAddedItem() {
        Item[] items = new Item[] { new Item(NAME_FIRST_ITEM, 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(NAME_FIRST_ITEM, app.items[0].name);
    }

    @Test
	public void textTest() {
		assertEquals(TexttestFixture.expectedText(), TexttestFixture.resultText());
	}

}
