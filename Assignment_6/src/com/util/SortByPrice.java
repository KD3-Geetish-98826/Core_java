package com.util;

import java.util.Comparator;

import com.library.Library;

public class SortByPrice implements Comparator<Library> {

	@Override
	public int compare(Library x, Library y) {
		return Double.compare(y.getPrice(), x.getPrice());
	}

}
