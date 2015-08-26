package org.eason.leetcode.combinationSumIII;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class SolutionTwo {
    
    private static final Logger logger = Logger.getLogger(SolutionTwo.class);

    public static void main(String[] args) {
	System.out.println(new SolutionTwo().combinationSum3(2, 9));
    }
    
    public List<List<Integer>> combinationSum3(int k, int n){
	List<List<Integer>> res=new ArrayList<List<Integer>>();
	logger.info("the information is A:" + res + "|tar=" + n + "|index=" + 1 + "|count=" + k);
        recur(new ArrayList<Integer>(),res,n,1,k);
        return res;
    }

    public void recur(List<Integer> temp,List<List<Integer>> res, int tar,int index,int count){
        if(tar==0 && count==0){
            res.add(temp);
            return;
        }
        
        if(count==0||tar<=0) return;

        for(int i=index; i<=9; i++){
            temp.add(i);
            logger.info("the information is:" + temp + "|" + res + "|" + (tar-i) + "|" + (i + 1) + "|" + (count -1));
            recur(new ArrayList<Integer>(temp), res, tar-i, i+1, count-1);
            temp.remove(temp.size()-1);
        }
    }
}
