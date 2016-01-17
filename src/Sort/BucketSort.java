package Sort;

public class BucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//要排序的目标数组
		int[] target = {2,2,2,5,6,8,1};
		
		int[] book = new int[1001];
		
		//初始化
		for(int i = 0;i<1000;i++)
		{
			book[i] = 0;
		}
		
		for(int i = 0; i<target.length;i++)
		{
			//把target中的数据作为book下标
			book[target[i]]++;
		}
		
		for(int i = 0;i<book.length;i++)
		{
			if(book[i]>0)
				//出现了几次就把筒的编号打印几次
				for(int j=0;j<book[i];j++)
					System.out.println(i);
		}

	}

}
