package com.gildedrose;

import com.gildedrose.model.Item;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {

			updateItem(items[i]);
		}
	}

	private void updateItem(Item item) {

		String itemName = item.name;

		if (itemName.equals("Aged Brie")) {

			if (item.quality < 50) {
				item.quality = item.quality + 1;
			}

			item.sellIn = item.sellIn - 1;

			if (item.sellIn < 0) {

				if (item.quality < 50) {
					item.quality = item.quality + 1;
				}
			}

		} else if (itemName.equals("Backstage passes to a TAFKAL80ETC concert")) {
			if (item.quality < 50) {
				item.quality = item.quality + 1;
			}

			if (item.sellIn < 11) {
				if (item.quality < 50) {
					item.quality = item.quality + 1;
				}
			}

			if (item.sellIn < 6) {
				if (item.quality < 50) {
					item.quality = item.quality + 1;
				}
			}

			item.sellIn = item.sellIn - 1;

			if (item.sellIn < 0) {
				item.quality = item.quality - item.quality;
			}

		} else if (itemName.equals("Sulfuras, Hand of Ragnaros")) {
			// do nothing

		} else {
			if (item.quality > 0) {

				item.quality = item.quality - 1;

				item.sellIn = item.sellIn - 1;

				if (item.sellIn < 0) {
					if (item.quality > 0) {

						item.quality = item.quality - 1;
					}
				}
			}
		}

	}

}