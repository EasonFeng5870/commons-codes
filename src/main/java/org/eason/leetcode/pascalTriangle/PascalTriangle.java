package org.eason.leetcode.pascalTriangle;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Pascal's Triangle
 * 
 * the rule is the current element is a sum from the last row same position election and previous position.
 * 
 * https://leetcode.com/problems/pascals-triangle/
 * 
 * @author eason.fengys
 *
 */
public class PascalTriangle {
    
    private static final Logger logger = Logger.getLogger(PascalTriangle.class);

    public static void main(String[] args) {
	List<List<Integer>> res = new PascalTriangle().generate(5);
	for (List<Integer> list : res) {
	    logger.info(list);
	}
	
    }
    
    public List<List<Integer>> generate(int numRows) {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	if(numRows <= 0){
	    return res;
	}
        List<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(1);
        res.add(firstRow);
        
        for(int i=1; i< numRows; i++){
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> lastRow = res.get(i-1);
            
            int k = i+1;
            for(int j=0; j < k; j++){
        	if(j==0){
        	    row.add(lastRow.get(j));
        	}else if(j <= lastRow.size()-1){
		    row.add(lastRow.get(j) + lastRow.get(j-1));
		}else if(j > lastRow.size()-1){
		    row.add(lastRow.get(j-1));
		}
            }
            res.add(row);
        }
	return res;
    }

}
