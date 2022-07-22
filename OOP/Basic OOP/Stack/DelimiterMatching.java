package Stack;

public class DelimiterMatching {

	/*
		public boolean isDelimiterMatching(String str) {
			Stack s = new Stack(str.length());
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch == '(' || ch == '{' || ch == '[')
					s.push(ch);
				if (ch == ')' || ch == '}' || ch == ']') {
					if (!s.isStackEmpty()) {
						char item = s.pop();
						if ((ch == ')' && item != '(') || (ch == '}' && 
								item != '{') || (ch == ']' && item != '['))
							return false;
					}
				}
			}
			if (!s.isStackEmpty())
				return false;
			return true;
		}*/
	
	public boolean isDelimiterMatching(String inputExpr)
	{
		Stack obj=new Stack(inputExpr.length());
		char [] arr= inputExpr.toCharArray();
	
		for(int i=0;i<inputExpr.length();i++)
		{	
			if(arr[i]=='('||arr[i]=='{'||arr[i]=='[')
				obj.push(arr[i]);
			else if(arr[i] == ')' || arr[i] == '}' || arr[i] == ']')
			{
				if(!obj.isStackEmpty())
				{
					//System.out.println(arr[i]+" "+i);
					if(arr[i]==')'&&obj.peek()=='(')
						obj.pop();
					else if(arr[i]==']'&&obj.peek()=='[')
						obj.pop();
					else if(arr[i]=='}'&&obj.peek()=='{')
						obj.pop();
					else 
						return false;
				}
				else
					return false;
				
			}
			
		}
		if(obj.isStackEmpty())
			return true;
		else
			return false;
		
	}

}
