package com.gildedrose;

import org.junit.jupiter.api.Test;

import com.gildedrose.model.Item;
import com.gildedrose.model.ItemFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

class GildedRoseTest {

	private static final String NAME_FIRST_ITEM = "item 1";

    @Test
    void nameFirstItemEqualsNameFirstAddedItem() {
        List<Item> items = Arrays.asList(new Item[] { ItemFactory.normalItem(NAME_FIRST_ITEM, 0, 0) });
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(NAME_FIRST_ITEM, app.items.get(0).getName());
    }

    @Test
	public void textTest() {
		assertEquals(TexttestFixture.expectedText(), TexttestFixture.resultText());
	}

}
