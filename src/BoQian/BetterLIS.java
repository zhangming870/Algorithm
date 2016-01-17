package BoQian;

import java.util.ArrayList;
import java.util.Vector;
/*
 * {3,2,6,4,5,1}
 * L[0] = 3
 * L[1] = 2
 * L[2] = 2,6
 * L[3] = 2,4
 * L[4] = 2,4,5
 * L[5] = 1
 * 
 * */
public class BetterLIS {
	
	static void  CalcLIS(ArrayList<Integer> target)
	{
		ArrayList<ArrayList<Integer>> L = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> v0 = new ArrayList<Integer>();
		v0.add(target.get(0));
		L.add(v0);//加入0号最长子序列
		
		//初始化
		for(int i = 0;i<target.size()-1;i++)
		{
			ArrayList<Integer> initList = new ArrayList<Integer>();
			L.add(initList);
		}
		
		for(int i=0;i<target.size();i++)
		{
			for(int j=0;j<i;j++)
			{
				//3,5或者4,5都可以，但是要取最长的2,4,5
				if((target.get(i) > target.get(j)) && (L.get(i).size() < L.get(j).size()+1))
				{
					L.get(i).clear();
					L.get(i).addAll(L.get(j));
				}
			}
			if(i!=0)
				L.get(i).add(target.get(i));
		}
		
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> target = new ArrayList<Integer>();
		target.add(3);
		target.add(2);
		target.add(6);
		target.add(4);
		target.add(5);
		target.add(1);
		
		CalcLIS(target);
	}

}
