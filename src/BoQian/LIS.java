package BoQian;

import java.util.*;

public class LIS {
	
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

	int [] a = {3,2,6,4,5,1};
	
	static void CalcLIS(int[] a)
	{
		int maxCount = 0;
		int [] dp = new int[a.length];//每个元素结尾的最长子序列的长度
		int end = 0;//最长子序列的最后一个元素
		HashMap<Integer,Integer> bt = new HashMap<Integer,Integer>();//最长子序列
		//构造dp
		for(int i = 0;i<a.length;i++)
		{
			dp[i] = 1;
			for(int j = 0;j<i;j++) //j在追赶i
			{
				if(a[i]>a[j])
				{
					dp[i] = Math.max(dp[i], dp[j]+1);
					if(maxCount<dp[i])
					{
						maxCount = dp[i];
						bt.put(i,j);
						end = i;
					}
				}
			}
		}
		return;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {3,2,6,4,5,1};
		CalcLIS(a);
	}

}
