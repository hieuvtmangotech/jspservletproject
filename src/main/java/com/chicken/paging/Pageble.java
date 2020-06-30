package com.chicken.paging;

import com.chicken.sort.Sorter;

public interface Pageble {
	Integer getPage();
	Integer getOffSet();
	Integer getLimit();
	Sorter getSorter();
}
