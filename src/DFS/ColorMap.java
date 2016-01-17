package DFS;
/*
 * 着色法
 * map,0表示大海， 1-9表示纬度
 * */
public class ColorMap {
	
	int columnNumber;//列数
	int rowNumber;//行数
	int [][] map = new int[100][100];
	int [][] book = new int[100][100];

	public void DFS(int x, int y, int color)
	{
		int[][] next = {{0,1},{1,0},{0,-1},{-1,0}}; //右下左上
		
		//染色
		map[x][y] = color;
		
		//四种走法
		for(int k = 0 ;k <=3;k++)
		{
			//得到下一个坐标
			int kx = x + next[k][0];
			int ky = y+ next[k][1];
			
			//判断是否越界			
			if(kx<0 || kx>rowNumber || ky<0 || ky>columnNumber)
				continue;
			
			//是陆地，没有已经在路径之中
			if((map[kx][ky] > 0) && book[kx][ky] == 0)
			{
				book[kx][ky] = 1;
				DFS(kx,ky,color);
				//book[kx][ky] = 0;
			}
		}
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
