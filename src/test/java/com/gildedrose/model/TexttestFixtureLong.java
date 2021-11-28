package com.gildedrose.model;

import java.util.Arrays;
import java.util.List;

import com.gildedrose.GildedRose;

public class TexttestFixtureLong {

	private static final int DAYS = 100;

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
    			"\n" + 
    			"-------- day 5 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, 5, 15\n" + 
    			"Aged Brie, -3, 8\n" + 
    			"Elixir of the Mongoose, 0, 2\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 10, 25\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 5, 50\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 0, 50\n" + 
    			"\n" + 
    			"-------- day 6 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, 4, 14\n" + 
    			"Aged Brie, -4, 10\n" + 
    			"Elixir of the Mongoose, -1, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 9, 27\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 4, 50\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -1, 0\n" + 
    			"\n" + 
    			"-------- day 7 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, 3, 13\n" + 
    			"Aged Brie, -5, 12\n" + 
    			"Elixir of the Mongoose, -2, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 8, 29\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 3, 50\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -2, 0\n" + 
    			"\n" + 
    			"-------- day 8 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, 2, 12\n" + 
    			"Aged Brie, -6, 14\n" + 
    			"Elixir of the Mongoose, -3, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 7, 31\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 2, 50\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -3, 0\n" + 
    			"\n" + 
    			"-------- day 9 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, 1, 11\n" + 
    			"Aged Brie, -7, 16\n" + 
    			"Elixir of the Mongoose, -4, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 6, 33\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 1, 50\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -4, 0\n" + 
    			"\n" + 
    			"-------- day 10 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, 0, 10\n" + 
    			"Aged Brie, -8, 18\n" + 
    			"Elixir of the Mongoose, -5, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 5, 35\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 0, 50\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -5, 0\n" + 
    			"\n" + 
    			"-------- day 11 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -1, 8\n" + 
    			"Aged Brie, -9, 20\n" + 
    			"Elixir of the Mongoose, -6, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 4, 38\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -1, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -6, 0\n" + 
    			"\n" + 
    			"-------- day 12 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -2, 6\n" + 
    			"Aged Brie, -10, 22\n" + 
    			"Elixir of the Mongoose, -7, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 3, 41\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -2, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -7, 0\n" + 
    			"\n" + 
    			"-------- day 13 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -3, 4\n" + 
    			"Aged Brie, -11, 24\n" + 
    			"Elixir of the Mongoose, -8, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 2, 44\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -3, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -8, 0\n" + 
    			"\n" + 
    			"-------- day 14 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -4, 2\n" + 
    			"Aged Brie, -12, 26\n" + 
    			"Elixir of the Mongoose, -9, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 1, 47\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -4, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -9, 0\n" + 
    			"\n" + 
    			"-------- day 15 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -5, 0\n" + 
    			"Aged Brie, -13, 28\n" + 
    			"Elixir of the Mongoose, -10, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, 0, 50\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -5, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -10, 0\n" + 
    			"\n" + 
    			"-------- day 16 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -6, 0\n" + 
    			"Aged Brie, -14, 30\n" + 
    			"Elixir of the Mongoose, -11, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -1, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -6, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -11, 0\n" + 
    			"\n" + 
    			"-------- day 17 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -7, 0\n" + 
    			"Aged Brie, -15, 32\n" + 
    			"Elixir of the Mongoose, -12, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -2, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -7, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -12, 0\n" + 
    			"\n" + 
    			"-------- day 18 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -8, 0\n" + 
    			"Aged Brie, -16, 34\n" + 
    			"Elixir of the Mongoose, -13, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -3, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -8, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -13, 0\n" + 
    			"\n" + 
    			"-------- day 19 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -9, 0\n" + 
    			"Aged Brie, -17, 36\n" + 
    			"Elixir of the Mongoose, -14, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -4, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -9, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -14, 0\n" + 
    			"\n" + 
    			"-------- day 20 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -10, 0\n" + 
    			"Aged Brie, -18, 38\n" + 
    			"Elixir of the Mongoose, -15, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -5, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -10, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -15, 0\n" + 
    			"\n" + 
    			"-------- day 21 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -11, 0\n" + 
    			"Aged Brie, -19, 40\n" + 
    			"Elixir of the Mongoose, -16, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -6, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -11, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -16, 0\n" + 
    			"\n" + 
    			"-------- day 22 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -12, 0\n" + 
    			"Aged Brie, -20, 42\n" + 
    			"Elixir of the Mongoose, -17, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -7, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -12, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -17, 0\n" + 
    			"\n" + 
    			"-------- day 23 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -13, 0\n" + 
    			"Aged Brie, -21, 44\n" + 
    			"Elixir of the Mongoose, -18, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -8, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -13, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -18, 0\n" + 
    			"\n" + 
    			"-------- day 24 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -14, 0\n" + 
    			"Aged Brie, -22, 46\n" + 
    			"Elixir of the Mongoose, -19, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -9, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -14, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -19, 0\n" + 
    			"\n" + 
    			"-------- day 25 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -15, 0\n" + 
    			"Aged Brie, -23, 48\n" + 
    			"Elixir of the Mongoose, -20, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -10, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -15, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -20, 0\n" + 
    			"\n" + 
    			"-------- day 26 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -16, 0\n" + 
    			"Aged Brie, -24, 50\n" + 
    			"Elixir of the Mongoose, -21, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -11, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -16, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -21, 0\n" + 
    			"\n" + 
    			"-------- day 27 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -17, 0\n" + 
    			"Aged Brie, -25, 50\n" + 
    			"Elixir of the Mongoose, -22, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -12, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -17, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -22, 0\n" + 
    			"\n" + 
    			"-------- day 28 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -18, 0\n" + 
    			"Aged Brie, -26, 50\n" + 
    			"Elixir of the Mongoose, -23, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -13, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -18, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -23, 0\n" + 
    			"\n" + 
    			"-------- day 29 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -19, 0\n" + 
    			"Aged Brie, -27, 50\n" + 
    			"Elixir of the Mongoose, -24, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -14, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -19, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -24, 0\n" + 
    			"\n" + 
    			"-------- day 30 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -20, 0\n" + 
    			"Aged Brie, -28, 50\n" + 
    			"Elixir of the Mongoose, -25, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -15, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -20, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -25, 0\n" + 
    			"\n" + 
    			"-------- day 31 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -21, 0\n" + 
    			"Aged Brie, -29, 50\n" + 
    			"Elixir of the Mongoose, -26, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -16, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -21, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -26, 0\n" + 
    			"\n" + 
    			"-------- day 32 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -22, 0\n" + 
    			"Aged Brie, -30, 50\n" + 
    			"Elixir of the Mongoose, -27, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -17, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -22, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -27, 0\n" + 
    			"\n" + 
    			"-------- day 33 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -23, 0\n" + 
    			"Aged Brie, -31, 50\n" + 
    			"Elixir of the Mongoose, -28, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -18, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -23, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -28, 0\n" + 
    			"\n" + 
    			"-------- day 34 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -24, 0\n" + 
    			"Aged Brie, -32, 50\n" + 
    			"Elixir of the Mongoose, -29, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -19, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -24, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -29, 0\n" + 
    			"\n" + 
    			"-------- day 35 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -25, 0\n" + 
    			"Aged Brie, -33, 50\n" + 
    			"Elixir of the Mongoose, -30, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -20, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -25, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -30, 0\n" + 
    			"\n" + 
    			"-------- day 36 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -26, 0\n" + 
    			"Aged Brie, -34, 50\n" + 
    			"Elixir of the Mongoose, -31, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -21, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -26, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -31, 0\n" + 
    			"\n" + 
    			"-------- day 37 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -27, 0\n" + 
    			"Aged Brie, -35, 50\n" + 
    			"Elixir of the Mongoose, -32, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -22, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -27, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -32, 0\n" + 
    			"\n" + 
    			"-------- day 38 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -28, 0\n" + 
    			"Aged Brie, -36, 50\n" + 
    			"Elixir of the Mongoose, -33, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -23, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -28, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -33, 0\n" + 
    			"\n" + 
    			"-------- day 39 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -29, 0\n" + 
    			"Aged Brie, -37, 50\n" + 
    			"Elixir of the Mongoose, -34, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -24, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -29, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -34, 0\n" + 
    			"\n" + 
    			"-------- day 40 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -30, 0\n" + 
    			"Aged Brie, -38, 50\n" + 
    			"Elixir of the Mongoose, -35, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -25, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -30, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -35, 0\n" + 
    			"\n" + 
    			"-------- day 41 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -31, 0\n" + 
    			"Aged Brie, -39, 50\n" + 
    			"Elixir of the Mongoose, -36, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -26, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -31, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -36, 0\n" + 
    			"\n" + 
    			"-------- day 42 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -32, 0\n" + 
    			"Aged Brie, -40, 50\n" + 
    			"Elixir of the Mongoose, -37, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -27, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -32, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -37, 0\n" + 
    			"\n" + 
    			"-------- day 43 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -33, 0\n" + 
    			"Aged Brie, -41, 50\n" + 
    			"Elixir of the Mongoose, -38, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -28, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -33, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -38, 0\n" + 
    			"\n" + 
    			"-------- day 44 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -34, 0\n" + 
    			"Aged Brie, -42, 50\n" + 
    			"Elixir of the Mongoose, -39, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -29, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -34, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -39, 0\n" + 
    			"\n" + 
    			"-------- day 45 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -35, 0\n" + 
    			"Aged Brie, -43, 50\n" + 
    			"Elixir of the Mongoose, -40, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -30, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -35, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -40, 0\n" + 
    			"\n" + 
    			"-------- day 46 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -36, 0\n" + 
    			"Aged Brie, -44, 50\n" + 
    			"Elixir of the Mongoose, -41, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -31, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -36, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -41, 0\n" + 
    			"\n" + 
    			"-------- day 47 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -37, 0\n" + 
    			"Aged Brie, -45, 50\n" + 
    			"Elixir of the Mongoose, -42, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -32, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -37, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -42, 0\n" + 
    			"\n" + 
    			"-------- day 48 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -38, 0\n" + 
    			"Aged Brie, -46, 50\n" + 
    			"Elixir of the Mongoose, -43, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -33, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -38, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -43, 0\n" + 
    			"\n" + 
    			"-------- day 49 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -39, 0\n" + 
    			"Aged Brie, -47, 50\n" + 
    			"Elixir of the Mongoose, -44, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -34, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -39, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -44, 0\n" + 
    			"\n" + 
    			"-------- day 50 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -40, 0\n" + 
    			"Aged Brie, -48, 50\n" + 
    			"Elixir of the Mongoose, -45, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -35, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -40, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -45, 0\n" + 
    			"\n" + 
    			"-------- day 51 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -41, 0\n" + 
    			"Aged Brie, -49, 50\n" + 
    			"Elixir of the Mongoose, -46, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -36, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -41, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -46, 0\n" + 
    			"\n" + 
    			"-------- day 52 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -42, 0\n" + 
    			"Aged Brie, -50, 50\n" + 
    			"Elixir of the Mongoose, -47, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -37, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -42, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -47, 0\n" + 
    			"\n" + 
    			"-------- day 53 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -43, 0\n" + 
    			"Aged Brie, -51, 50\n" + 
    			"Elixir of the Mongoose, -48, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -38, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -43, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -48, 0\n" + 
    			"\n" + 
    			"-------- day 54 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -44, 0\n" + 
    			"Aged Brie, -52, 50\n" + 
    			"Elixir of the Mongoose, -49, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -39, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -44, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -49, 0\n" + 
    			"\n" + 
    			"-------- day 55 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -45, 0\n" + 
    			"Aged Brie, -53, 50\n" + 
    			"Elixir of the Mongoose, -50, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -40, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -45, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -50, 0\n" + 
    			"\n" + 
    			"-------- day 56 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -46, 0\n" + 
    			"Aged Brie, -54, 50\n" + 
    			"Elixir of the Mongoose, -51, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -41, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -46, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -51, 0\n" + 
    			"\n" + 
    			"-------- day 57 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -47, 0\n" + 
    			"Aged Brie, -55, 50\n" + 
    			"Elixir of the Mongoose, -52, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -42, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -47, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -52, 0\n" + 
    			"\n" + 
    			"-------- day 58 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -48, 0\n" + 
    			"Aged Brie, -56, 50\n" + 
    			"Elixir of the Mongoose, -53, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -43, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -48, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -53, 0\n" + 
    			"\n" + 
    			"-------- day 59 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -49, 0\n" + 
    			"Aged Brie, -57, 50\n" + 
    			"Elixir of the Mongoose, -54, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -44, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -49, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -54, 0\n" + 
    			"\n" + 
    			"-------- day 60 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -50, 0\n" + 
    			"Aged Brie, -58, 50\n" + 
    			"Elixir of the Mongoose, -55, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -45, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -50, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -55, 0\n" + 
    			"\n" + 
    			"-------- day 61 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -51, 0\n" + 
    			"Aged Brie, -59, 50\n" + 
    			"Elixir of the Mongoose, -56, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -46, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -51, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -56, 0\n" + 
    			"\n" + 
    			"-------- day 62 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -52, 0\n" + 
    			"Aged Brie, -60, 50\n" + 
    			"Elixir of the Mongoose, -57, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -47, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -52, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -57, 0\n" + 
    			"\n" + 
    			"-------- day 63 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -53, 0\n" + 
    			"Aged Brie, -61, 50\n" + 
    			"Elixir of the Mongoose, -58, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -48, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -53, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -58, 0\n" + 
    			"\n" + 
    			"-------- day 64 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -54, 0\n" + 
    			"Aged Brie, -62, 50\n" + 
    			"Elixir of the Mongoose, -59, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -49, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -54, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -59, 0\n" + 
    			"\n" + 
    			"-------- day 65 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -55, 0\n" + 
    			"Aged Brie, -63, 50\n" + 
    			"Elixir of the Mongoose, -60, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -50, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -55, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -60, 0\n" + 
    			"\n" + 
    			"-------- day 66 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -56, 0\n" + 
    			"Aged Brie, -64, 50\n" + 
    			"Elixir of the Mongoose, -61, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -51, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -56, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -61, 0\n" + 
    			"\n" + 
    			"-------- day 67 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -57, 0\n" + 
    			"Aged Brie, -65, 50\n" + 
    			"Elixir of the Mongoose, -62, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -52, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -57, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -62, 0\n" + 
    			"\n" + 
    			"-------- day 68 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -58, 0\n" + 
    			"Aged Brie, -66, 50\n" + 
    			"Elixir of the Mongoose, -63, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -53, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -58, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -63, 0\n" + 
    			"\n" + 
    			"-------- day 69 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -59, 0\n" + 
    			"Aged Brie, -67, 50\n" + 
    			"Elixir of the Mongoose, -64, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -54, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -59, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -64, 0\n" + 
    			"\n" + 
    			"-------- day 70 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -60, 0\n" + 
    			"Aged Brie, -68, 50\n" + 
    			"Elixir of the Mongoose, -65, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -55, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -60, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -65, 0\n" + 
    			"\n" + 
    			"-------- day 71 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -61, 0\n" + 
    			"Aged Brie, -69, 50\n" + 
    			"Elixir of the Mongoose, -66, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -56, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -61, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -66, 0\n" + 
    			"\n" + 
    			"-------- day 72 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -62, 0\n" + 
    			"Aged Brie, -70, 50\n" + 
    			"Elixir of the Mongoose, -67, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -57, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -62, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -67, 0\n" + 
    			"\n" + 
    			"-------- day 73 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -63, 0\n" + 
    			"Aged Brie, -71, 50\n" + 
    			"Elixir of the Mongoose, -68, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -58, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -63, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -68, 0\n" + 
    			"\n" + 
    			"-------- day 74 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -64, 0\n" + 
    			"Aged Brie, -72, 50\n" + 
    			"Elixir of the Mongoose, -69, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -59, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -64, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -69, 0\n" + 
    			"\n" + 
    			"-------- day 75 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -65, 0\n" + 
    			"Aged Brie, -73, 50\n" + 
    			"Elixir of the Mongoose, -70, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -60, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -65, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -70, 0\n" + 
    			"\n" + 
    			"-------- day 76 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -66, 0\n" + 
    			"Aged Brie, -74, 50\n" + 
    			"Elixir of the Mongoose, -71, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -61, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -66, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -71, 0\n" + 
    			"\n" + 
    			"-------- day 77 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -67, 0\n" + 
    			"Aged Brie, -75, 50\n" + 
    			"Elixir of the Mongoose, -72, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -62, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -67, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -72, 0\n" + 
    			"\n" + 
    			"-------- day 78 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -68, 0\n" + 
    			"Aged Brie, -76, 50\n" + 
    			"Elixir of the Mongoose, -73, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -63, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -68, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -73, 0\n" + 
    			"\n" + 
    			"-------- day 79 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -69, 0\n" + 
    			"Aged Brie, -77, 50\n" + 
    			"Elixir of the Mongoose, -74, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -64, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -69, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -74, 0\n" + 
    			"\n" + 
    			"-------- day 80 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -70, 0\n" + 
    			"Aged Brie, -78, 50\n" + 
    			"Elixir of the Mongoose, -75, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -65, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -70, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -75, 0\n" + 
    			"\n" + 
    			"-------- day 81 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -71, 0\n" + 
    			"Aged Brie, -79, 50\n" + 
    			"Elixir of the Mongoose, -76, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -66, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -71, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -76, 0\n" + 
    			"\n" + 
    			"-------- day 82 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -72, 0\n" + 
    			"Aged Brie, -80, 50\n" + 
    			"Elixir of the Mongoose, -77, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -67, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -72, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -77, 0\n" + 
    			"\n" + 
    			"-------- day 83 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -73, 0\n" + 
    			"Aged Brie, -81, 50\n" + 
    			"Elixir of the Mongoose, -78, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -68, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -73, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -78, 0\n" + 
    			"\n" + 
    			"-------- day 84 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -74, 0\n" + 
    			"Aged Brie, -82, 50\n" + 
    			"Elixir of the Mongoose, -79, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -69, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -74, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -79, 0\n" + 
    			"\n" + 
    			"-------- day 85 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -75, 0\n" + 
    			"Aged Brie, -83, 50\n" + 
    			"Elixir of the Mongoose, -80, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -70, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -75, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -80, 0\n" + 
    			"\n" + 
    			"-------- day 86 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -76, 0\n" + 
    			"Aged Brie, -84, 50\n" + 
    			"Elixir of the Mongoose, -81, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -71, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -76, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -81, 0\n" + 
    			"\n" + 
    			"-------- day 87 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -77, 0\n" + 
    			"Aged Brie, -85, 50\n" + 
    			"Elixir of the Mongoose, -82, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -72, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -77, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -82, 0\n" + 
    			"\n" + 
    			"-------- day 88 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -78, 0\n" + 
    			"Aged Brie, -86, 50\n" + 
    			"Elixir of the Mongoose, -83, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -73, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -78, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -83, 0\n" + 
    			"\n" + 
    			"-------- day 89 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -79, 0\n" + 
    			"Aged Brie, -87, 50\n" + 
    			"Elixir of the Mongoose, -84, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -74, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -79, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -84, 0\n" + 
    			"\n" + 
    			"-------- day 90 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -80, 0\n" + 
    			"Aged Brie, -88, 50\n" + 
    			"Elixir of the Mongoose, -85, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -75, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -80, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -85, 0\n" + 
    			"\n" + 
    			"-------- day 91 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -81, 0\n" + 
    			"Aged Brie, -89, 50\n" + 
    			"Elixir of the Mongoose, -86, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -76, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -81, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -86, 0\n" + 
    			"\n" + 
    			"-------- day 92 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -82, 0\n" + 
    			"Aged Brie, -90, 50\n" + 
    			"Elixir of the Mongoose, -87, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -77, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -82, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -87, 0\n" + 
    			"\n" + 
    			"-------- day 93 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -83, 0\n" + 
    			"Aged Brie, -91, 50\n" + 
    			"Elixir of the Mongoose, -88, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -78, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -83, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -88, 0\n" + 
    			"\n" + 
    			"-------- day 94 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -84, 0\n" + 
    			"Aged Brie, -92, 50\n" + 
    			"Elixir of the Mongoose, -89, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -79, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -84, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -89, 0\n" + 
    			"\n" + 
    			"-------- day 95 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -85, 0\n" + 
    			"Aged Brie, -93, 50\n" + 
    			"Elixir of the Mongoose, -90, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -80, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -85, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -90, 0\n" + 
    			"\n" + 
    			"-------- day 96 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -86, 0\n" + 
    			"Aged Brie, -94, 50\n" + 
    			"Elixir of the Mongoose, -91, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -81, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -86, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -91, 0\n" + 
    			"\n" + 
    			"-------- day 97 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -87, 0\n" + 
    			"Aged Brie, -95, 50\n" + 
    			"Elixir of the Mongoose, -92, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -82, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -87, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -92, 0\n" + 
    			"\n" + 
    			"-------- day 98 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -88, 0\n" + 
    			"Aged Brie, -96, 50\n" + 
    			"Elixir of the Mongoose, -93, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -83, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -88, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -93, 0\n" + 
    			"\n" + 
    			"-------- day 99 --------\n" + 
    			"name, sellIn, quality\n" + 
    			"+5 Dexterity Vest, -89, 0\n" + 
    			"Aged Brie, -97, 50\n" + 
    			"Elixir of the Mongoose, -94, 0\n" + 
    			"Sulfuras, Hand of Ragnaros, 0, 80\n" + 
    			"Sulfuras, Hand of Ragnaros, -1, 80\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -84, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -89, 0\n" + 
    			"Backstage passes to a TAFKAL80ETC concert, -94, 0\n" + 
    			"\n";
    }

}
