package Stack;

public class Palindrome {
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		String a = "abaabacc";
		char[] charA = a.toCharArray();
		//求中间点
		int mid = a.length()/2 -1;
		//入stack
		for(int i = 0;i<=mid;i++)
		{
			stack.Push(charA[i]);
		}
		
		int laterhalf ; //要比较的后半段的起始点
		if(a.length()%2 == 0)
		{
			laterhalf = mid+1;
		}else
			laterhalf = mid+2;
		
		for(; laterhalf<a.length();laterhalf++)
		{
			if(charA[laterhalf] == stack.Peek())
				stack.Get();
			else
				break;
		}
		
		if(stack.IsEmpty())
			System.out.println("是回文");
		else
			System.out.println("不是回文");
		
	}

}

class Stack
{
	char[] stack = new char[101];
	int top = -1;
	
	public void Push(char c)
	{
		stack[++top] = c;
	}
	
	public char Get()
	{
		return stack[top--];
	}
	
	public char Peek()
	{
		return stack[top];
	}
	
	public Boolean IsEmpty()
	{
		return top == -1;
	}
}
