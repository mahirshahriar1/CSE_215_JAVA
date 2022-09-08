class Stack {
   private java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
 
   public int getSize() {
       return list.size();
   }   
 
   
   public void push(Integer o) {
      list.add(o);
   }   

   public Integer pop() {
      Integer o = list.get(getSize() - 1); 
      list.remove(getSize() - 1); 
      return o;
   }   

   public boolean isEmpty() {
      return list.isEmpty();
   }   

   @Override
   public String toString() {
      return "stack: " + list.toString();
   }   
}






public class Main {
	public static void main(String[] args) {
		
        
        Stack stack = new Stack();
        stack.push(1); // autoboxing 1 to new Integer(1)
        stack.push(2);
        stack.push(3);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

 	}
}
