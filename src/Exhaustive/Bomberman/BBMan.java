package Exhaustive.Bomberman;

/*
 * #表示墙壁
 * G表示敌人
 * .表示空地
 * 
 * */
public class BBMan {
	
	//表示地图
	char[][] map = new char[100][100];
	int row;//行
	int column;//列
	
	//统计往下能炸多少敌人
	public int CountDown()
	{
		int i = 0;//行
		int j = 0;//列
		int sum = 0;
		while(map[i][j]!='#')
		{
			if(map[i][j] == 'G')
				sum ++;
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
