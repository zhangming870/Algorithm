package DFS;

public class ShortestSavePath {
	
	int p,q; //目的地坐标
	int min; //最小的步数
	int columnNumber;//列数
	int rowNumber;//行数
	int [][] map = new int[100][100];
	int [][] book = new int[100][100];
	
	public void DFS(int x, int y, int stepCount)
	{
		int[][] next = {{0,1},{1,0},{0,-1},{-1,0}}; //右下左上
		
		//已经到达目的地
		if((x ==p) && (y ==q))
		{
			if(stepCount < min)
				min = stepCount;
			return;
		}
		
		//四种走法
		for(int k = 0 ;k <=3;k++)
		{
			//得到下一个坐标
			int kx = x + next[k][0];
			int ky = y+ next[k][1];
			
			//判断是否越界			
			if(kx<0 || kx>rowNumber || ky<0 || ky>columnNumber)
				continue;
			
			//不是障碍物，没有已经在路径之中
			if((map[kx][ky] == 0) && book[kx][ky] == 0)
			{
				book[kx][ky] = 1;
				DFS(kx,ky,stepCount+1);
				book[kx][ky] = 0;
			}
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
