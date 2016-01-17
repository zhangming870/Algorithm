package BFS;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 遍历所有能走到的点
 * 
 * 
 * */
public class AllPointCanWalk {
	
	int [][] map = new int[100][100];
	int [][] book = new int[100][100];
	int[][] next = {{0,1},{1,0},{0,-1},{-1,0}}; //右下左上
	int columnNumber;//列数
	int rowNumber;//行数

	public void Go()
	{
		Queue<Position> queue = new LinkedList<Position>();
		int startx = 0; int starty = 0;//开始坐标
		
		//init queue
		Position p0 = new Position(startx,starty);
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
					Position p = new Position(tx,ty);
					queue.add(p);
				}
			}
			
			System.out.println(queue.peek().x + "," + queue.peek().y);
			//扩展完毕就删除啊
			queue.remove();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
