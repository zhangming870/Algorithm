package Queue;

public class Queue {
	int[] data = new int[100]; 
	int head;
	int tail;//指向最后一个元素的后一位
	
	public Queue(){head = 0; tail=0;}
	
	public void AddRange(int[] target)
	{
		for(int i=0;i<target.length;i++)
		{
			data[i] = target[i];
		}
		tail = target.length;
	}
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] target = {1,2,3};
		//初始化队列
		Queue queue = new Queue();
		queue.AddRange(target);
		
		
		while(queue.head<queue.tail)
		{
			System.out.println(queue.data[queue.head]);
			//出队
			queue.head++;
		}
		
		
		
	}

}
