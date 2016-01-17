package Graph;

/*
 * 深度遍历图
 * 图用邻接矩阵存储
 * */

public class DFS {
	int sum=0;//顶点总数
	int n;//顶点总数
	int [][] map = new int[100][100];//map中存储的是一个邻接矩阵
	int [] book = new int[100];
	
	public void DFSGraph(int cur)
	{
		System.out.println(cur);
		sum ++;
		
		//所有的点都被输出了
		if(sum == n)
			return;
		
		for(int i = 0;i<n;i++)
		{
			if((map[cur][i] == 1)&&(book[i] == 0))//当前顶点cur到顶点i是否有边
			{
				book[i] = 1;//顶点i已经被访问
				DFSGraph(i);//从顶点i再出发
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
