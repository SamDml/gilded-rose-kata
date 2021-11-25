package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.gildedrose.model.ItemFactory;

public class ItemFactoryTest {

	@Test
	public void normalItemQualityCanNotExceed50WhenCreated() {
		assertThrows(QualityLimitException.class, () -> ItemFactory.normalItem("item 1", 10, 51));

		try {
			ItemFactory.normalItem("item 1", 10, 51);
		} catch (QualityLimitException ex) {
			System.out.println(ex.getLocalizedMessage());
		}
	}

	@Test
	public void backstagePassesItemQualityCanNotExceed50WhenCreated() {
		assertThrows(QualityLimitException.class, () -> ItemFactory.backstagePassesItem(10, 51));
	}

	@Test
	public void agedBrieItemQualityCanNotExceed50WhenCreated() {
		assertThrows(QualityLimitException.class, () -> ItemFactory.agedBrieItem(10, 51));
	}
	
	@Test
	public void normalItemQualityCanNotBeNegativeWhenCreated() {
		assertThrows(QualityLimitException.class, () -> ItemFactory.normalItem("item 1", 10, -1));

		try {
			ItemFactory.normalItem("item 1", 10, -1);
		} catch (QualityLimitException ex) {
			System.out.println(ex.getLocalizedMessage());
		}
	}

	@Test
	public void backstagePassesItemQualityCanNotBeNegativeWhenCreated() {
		assertThrows(QualityLimitException.class, () -> ItemFactory.backstagePassesItem(10, -1));
	}

	@Test
	public void agedBrieItemQualityCanNotBeNegativeWhenCreated() {
		assertThrows(QualityLimitException.class, () -> ItemFactory.agedBrieItem(10, -1));

	}

}
