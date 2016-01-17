package Graph;

import java.util.LinkedList;
import java.util.Queue;


public class BFS {
	
	int [][] map = new int[100][100];//map中存储的是一个邻接矩阵
	int [] book = new int[100];
	int n;//顶点总数
	
	public void Go(int cur)//遍历开始从cur顶点
	{
		Queue<Integer> queue = new LinkedList<Integer>();
		System.out.println(cur);
		
		//init queue
		queue.add(cur);
		book[cur] = 1;
		
		while(!queue.isEmpty())
		{
			for(int i = 0;i<n;i++)
			{
				if((map[cur][i] == 1)&&(book[i] == 0))//有边而且未被访问过
				{
					queue.add(i);
					book[i] = 1;
				}
			}	
		}
		
		queue.remove();
		
	}
	
	public static void main(String[] args) {
		

	}

}
