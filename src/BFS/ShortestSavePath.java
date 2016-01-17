package BFS;

import java.util.LinkedList;
import java.util.Queue;



public class ShortestSavePath {
	
	int [][] map = new int[100][100];
	int [][] book = new int[100][100];
	int[][] next = {{0,1},{1,0},{0,-1},{-1,0}}; //右下左上
	int columnNumber;//列数
	int rowNumber;//行数
	int flag = 0;//表示是否到达目的地，0未到，1到达
	int p,q;
	
	public void BFS()
	{
		Queue<Position> queue = new LinkedList<Position>();
		int startx = 0; int starty = 0;//开始坐标
		
		//init queue
		Position p0 = new Position(startx,starty, null,0);
		queue.add(p0);
		book[startx][starty] = 1;//标记已经使用过
		
		while(!queue.isEmpty())
		{
			//枚举四个方向
			for(int i = 0;i<=3;i++)
			{
				int tx = queue.peek().x +next[i][0];
				int ty = queue.peek().y + next[i][1];
				
				//判断是否越界			
				if(tx<0 || tx>rowNumber || ty<0 || ty>columnNumber)
					continue;
				
				//不是障碍物，没有已经在路径之中
				if((map[tx][ty] == 0) && book[tx][ty] == 0)
				{
					//宽搜每个元素只入队一次，不需要还原标记
					//BFS不回溯的
					book[tx][ty] = 1;
					Position p = new Position(tx,ty,queue.peek(),queue.peek().stepCount+1);
					queue.add(p);
					
				}
				
				//到达目的地
				if((tx == p) &&(ty ==q))
				{
					flag = 1;
					break;
				}
			}
			//扩展完毕就删除啊
			queue.remove();
		}
		
		Position p = null;
		while(!queue.isEmpty())
		{
			p = queue.remove();
		}
		//print the last one in queue
		System.out.println(p.stepCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Position
{
	public Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public Position(int x, int y, Position parent, int stepCount)
	{
		this.x = x;
		this.y = y;
		this.parent = parent;
		this.stepCount = stepCount;
	}
	int x;
	int y;
	Position parent;
	int stepCount;
}
