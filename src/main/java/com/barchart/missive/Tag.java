package com.barchart.missive;

public interface Tag<V extends Datum<V>> {

	public String name();
	
	public Class<V> clazz();
	
}
