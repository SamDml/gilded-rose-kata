package com.gildedrose.model;

public class NormalItem implements Item {

	private String name;

	private int sellIn;

	private int quality;

	NormalItem(String name, int sellIn, int quality) {
		this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
	}

    public String getName() {
		return name;
	}

	public int getSellIn() {
		return sellIn;
	}

	public int getQuality() {
		return quality;
	}

	@Override
	public void updateQuality() {

		sellIn = sellIn - 1;

		if (quality > 0) {

			quality = quality - 1;

			if (sellIn < 0) {
				if (quality > 0) {

					quality = quality - 1;
				}
			}
		}
	}

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

}
