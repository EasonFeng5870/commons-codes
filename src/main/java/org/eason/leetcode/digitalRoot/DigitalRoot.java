package org.eason.leetcode.digitalRoot;

import org.apache.log4j.Logger;

/**
 * https://leetcode.com/problems/add-digits/
 * 
 * @author eason.fengys
 *
 */
public class DigitalRoot {
    
    private static final Logger logger = Logger.getLogger(DigitalRoot.class);

    public static void main(String[] args) {
	logger.info(new DigitalRoot().addDigits(12345));
    }
    
    /**
     * formula: the number a's digital root b = [(a-1)%9] + 1
     * @param num
     * @return
     */
    public int addDigits(int num) {
	return ((num-1)%9 + 1);
    }

}
