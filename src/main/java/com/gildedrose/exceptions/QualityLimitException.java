package com.gildedrose.exceptions;

public class QualityLimitException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public QualityLimitException(String message) {
		super(message);
	}
}
