package com.barchart.missive;

public enum Primitives {
	
	;
	
	public Datum<Integer> INT = new Datum<Integer>() {

		private Integer value = new Integer(0);
		
		public Integer getValue() {
			return value;
		}

		public void setValue(final Integer v) {
			value = v;
		}
		
	};
	

}
