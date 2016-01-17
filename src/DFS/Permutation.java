package DFS;
/*
 * DFS,解决当下该如何做，下一步和当下一步是一样的
 * */
public class Permutation {

	int n = 10;//n张牌
	int[] book = new int[10];
	int[] box = new int[10];
	
	void DFS(int step)
	{
		if(step == n+1)
		{
			for(int i = 0 ;i<box.length;i++)
				System.out.print(box[i]);
			return;
		}
		for(int i = 0;i<n;i++)//每一种可能，扩展
		{
			if(book[i] == 0)//i号牌还未出过
			{
				box[step] = i; 
				book[i] = 1;
				
				DFS(step+1);
				book[i] = 0;
			}
		}
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
