package com.gildedrose.model;

import java.util.Arrays;
import java.util.List;

import com.gildedrose.GildedRose;

public class TexttestFixture {

	private static final int DAYS = 5;

    public static String resultText() {

    	List<Item> items = createItems();
        GildedRose app = new GildedRose(items);

        return updateItemQualityForDaysAndReturnResult(app);
    }

    private static List<Item> createItems() {

    	return Arrays.asList(new Item[] {
    			ItemFactory.normalItem("+5 Dexterity Vest", 10, 20),
    			ItemFactory.agedBrieItem(2, 0),
                ItemFactory.normalItem("Elixir of the Mongoose", 5, 7),
                ItemFactory.sulfurasItem(0),
                ItemFactory.sulfurasItem(-1),
                ItemFactory.backstagePassesItem(15, 20),
                ItemFactory.backstagePassesItem(10, 49),
                ItemFactory.backstagePassesItem(5, 49)});
    }

    private static String updateItemQualityForDaysAndReturnResult(GildedRose app) {

    	StringBuilder result = new StringBuilder("");

    	for (int i = 0; i < DAYS; i++) {
        	result.append("-------- day " + i + " --------\n");
        	result.append("name, sellIn, quality\n");
            for (Item item : app.items) {
            	result.append(item).append("\n");
            }
            result.append("\n");
            app.updateQuality();
        }

        return result.toString();
    }

    public static String expectedText() {
    	return "-------- day 0 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, 10, 20\n" + 
    			"Aged Brie, 2, 0\n" + 
    			"Elixir of the Mongoose, 5, 7\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 15, 20\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 10, 49\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 5, 49\n" + 
    			"\n" + 
    			"-------- day 1 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, 9, 19\n" + 
    			"Aged Brie, 1, 1\n" + 
    			"Elixir of the Mongoose, 4, 6\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 14, 21\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 9, 50\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 4, 50\n" + 
    			"\n" + 
    			"-------- day 2 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, 8, 18\n" + 
    			"Aged Brie, 0, 2\n" + 
    			"Elixir of the Mongoose, 3, 5\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 13, 22\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 8, 50\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 3, 50\n" + 
    			"\n" + 
    			"-------- day 3 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, 7, 17\n" + 
    			"Aged Brie, -1, 4\n" + 
    			"Elixir of the Mongoose, 2, 4\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 12, 23\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 7, 50\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 2, 50\n" + 
    			"\n" + 
    			"-------- day 4 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, 6, 16\n" + 
    			"Aged Brie, -2, 6\n" + 
    			"Elixir of the Mongoose, 1, 3\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 11, 24\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 6, 50\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 1, 50\n" + 
    			"\n";
    }

}
