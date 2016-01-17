package Sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//要排序的目标数组
		int[] target = {2,1};
		
		for(int i = 0;i<target.length;i++)
		{
			for(int j = 0;j<target.length - i - 1;j++)
			{
				if(target[j]> target[j+1])
				{
					int temp = target[j];
					target[j] = target[j+1];
					target[j+1] = temp;
				}
			}
		}
		
		for(int k = 0;k<target.length;k++)
			System.out.println(target[k]);
		
	}

}
