package org.eason.leetcode.combinationSumIII;

import java.util.ArrayList;
import java.util.List;

public class SolutionTwoCopy {

    public static void main(String[] args) {
	System.out.println(new SolutionTwoCopy().combinationSum3(3, 9));
    }
    
    public List<List<Integer>> combinationSum3(int k, int n) {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	recursive(new ArrayList<Integer>(), res, 1, n, k);
	return res;
    }

    private void recursive(ArrayList<Integer> temp, List<List<Integer>> res, int index, int target, int count) {
	if(count == 0 && target == 0){
	    res.add(temp);
	    return;
	}
	
	if(count == 0 || target < 0) return;
	
	for(int i=index; i<=9; i++){
	    temp.add(i);
	    
	    recursive(new ArrayList<Integer>(temp), res, i + 1, target-i, count-1);
	    
	    temp.remove(temp.size()-1);
	    
	}
    }

}
