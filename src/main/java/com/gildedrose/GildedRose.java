package com.gildedrose;

import java.util.Arrays;
import java.util.List;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {

			if (items[i].name.equals("Aged Brie") 
					|| items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")
					|| items[i].name.equals("Sulfuras, Hand of Ragnaros")) {

				updateItem(items[i]);

			} else {

				if (!isSpecialItem(items[i])) {
					if (items[i].quality > 0) {
						items[i].quality = items[i].quality - 1;
					}
				}

				if (items[i].name.equals("Aged Brie")
						|| items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
					if (items[i].quality < 50) {
						items[i].quality = items[i].quality + 1;

						if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
							if (items[i].sellIn < 11) {
								if (items[i].quality < 50) {
									items[i].quality = items[i].quality + 1;
								}
							}

							if (items[i].sellIn < 6) {
								if (items[i].quality < 50) {
									items[i].quality = items[i].quality + 1;
								}
							}
						}
					}
				}

				if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
					items[i].sellIn = items[i].sellIn - 1;
				}

				if (items[i].sellIn < 0) {

					if (items[i].name.equals("Aged Brie")) {
						if (items[i].quality < 50) {
							items[i].quality = items[i].quality + 1;
						}
					} else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
						items[i].quality = items[i].quality - items[i].quality;

					} else if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
						if (items[i].quality > 0) {

							items[i].quality = items[i].quality - 1;
						}
					}
				}
			}
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
		}


	}

	private boolean isSpecialItem(Item item) {

		List<String> specialItemNames = Arrays.asList(new String[] { "Aged Brie",
				"Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros" });

		return specialItemNames.contains(item.name);

	}
}