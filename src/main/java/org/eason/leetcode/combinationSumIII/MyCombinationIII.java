package org.eason.leetcode.combinationSumIII;

import java.util.ArrayList;
import java.util.List;

public class MyCombinationIII {

    public static void main(String[] args) {
	System.out.println(new MyCombinationIII().combinationSum3(3, 24));
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	
	recursive(new ArrayList<Integer>(), res, n, 1, k);
	
	return res; 
    }

    private void recursive(ArrayList<Integer> temp, List<List<Integer>> res, int target, int index, int count) {
	if(count == 0 && target == 0){
	    res.add(temp);
	    return;
	}
	if(count == 0 || target < 0) return;
	
	for (int i = index; i <= 9; i++) {
	    temp.add(i);
	    
	    recursive(new ArrayList<Integer>(temp), res, target-i, i+1, count-1);
	    
	    temp.remove(temp.size()-1);
	}
    }
}
