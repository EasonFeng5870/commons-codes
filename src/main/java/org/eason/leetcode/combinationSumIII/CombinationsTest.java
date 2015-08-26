package org.eason.leetcode.combinationSumIII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * https://leetcode.com/problems/combination-sum-iii/
 * 
 * @author eason.fengys
 * 
 */
public class CombinationsTest {
    
    private static final Logger logger = Logger.getLogger(CombinationsTest.class);
    
    

    public static void main(String[] args) {
	CombinationsTest ct = new CombinationsTest();
	logger.info( ct.combinationSum3(2, 18) );
	
    }
    
    public List<List<Integer>> combinationSum3(int k, int n) {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	int[] can = {1,2,3,4,5,6,7,8,9};
	Arrays.sort(can);
	helper(can, 0, n, new ArrayList<Integer>(), k, res);
	return res;
    }


    private void helper(int[] can, int start, int target, List<Integer> each, int len, List<List<Integer>> res) {
	if(each.size() >= len) return;
	for( int i= start; i < can.length; i++){
	    List<Integer> temp = new ArrayList<Integer>(each);
	    
	    if(can[i] == target){
		if(each.size() == len-1){
		    temp.add(can[i]);
		    res.add(temp);
		}
		break;
	    } else if( can[i] < target) {
		temp.add(can[i]);
		helper(can, i+1, target-can[i], new ArrayList<Integer>(temp), len, res);
	    } else {
		break;
	    }
	}
	
	return;
    }


}
