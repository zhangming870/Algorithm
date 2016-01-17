package Sort;

public class QuickSort {
	
	public int[] a = new int[101];
	int n;
	
	public QuickSort(){}
	
	public void DoQuickSort(int left, int right)
	{
		int temp;
		int i;
		int j;
		if(left>right)
			return;
		temp = a[left];//基准数
		i = left;
		j = right;
		
		//i,j相向而行
		while(i!=j)
		{
			while((a[j]>=temp) && (j>i))
				j--;
			while((a[i] <=temp) &&(i<j))
				i++;
			//a[i]大于基准，a[j]小于基准，swap,而且i,j没有相遇
			if(i<j)
			{
				int swapTemp = a[i];
				a[i] = a[j];
				a[j] = swapTemp;
			}
		}
		//i,j相遇，和基准交换
		a[left] = a[i];
		a[i] = temp;
		
		DoQuickSort(left,i-1);
		DoQuickSort(i+1,right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//要排序的目标数组
		int[] target = {2,2,2,2,2,2,1};
		QuickSort qs = new QuickSort();
		qs.a = target;
		qs.DoQuickSort(0, qs.a.length-1);
		
		for(int i = 0;i<target.length-1;i++)
		{
			System.out.println(target[i]);
		}
		
	}

}
