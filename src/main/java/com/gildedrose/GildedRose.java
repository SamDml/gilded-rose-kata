package com.gildedrose;

import java.util.ArrayList;
import java.util.List;

import com.gildedrose.model.Item;

public class GildedRose {

	public List<Item> items = new ArrayList<Item>();

	public GildedRose(List<Item> items) {
		this.items = items;
	}

	public void updateQuality() {

		for (Item item : items) {

			item.doAge();
		}
	}

}