package org.eason.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * 实现了整数泛型的List的List排 序 即：List<List<Integer>>
 * 
 * @author eason.fengys
 * 
 */
public class MyIntegerListSortor {

    private static final Logger logger = Logger.getLogger(MyIntegerListSortor.class);

    public static List<List<Integer>> sort(List<List<Integer>> list) {
	logger.info("the list is:" + list);
	Collections.sort(list, new Comparator<List<Integer>>() {
	    public int compare(List<Integer> o1, List<Integer> o2) {
		for (int i = 0; i < o1.size(); i++) {
		    if (o1.get(i) > o2.get(i)) {
			return 1;
		    } else if (o1.get(i) == o2.get(i)) {
			continue;
		    } else if (o1.get(i) < o2.size()) {
			return -1;
		    }
		}
		return 0;
	    }
	});
	logger.info("the sorted list is:" + list);
	return list;
    }

}
