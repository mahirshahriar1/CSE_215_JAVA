class GenericStack<E> {
   private java.util.ArrayList<E> list = new java.util.ArrayList<>();
 
   public int getSize() {
       return list.size();
   }   
 
   public E peek() {
      return list.get(getSize() - 1); 
   }   

   public void push(E o) {
      list.add(o);
   }   

   public E pop() {
      E o = list.get(getSize() - 1); 
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
		
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");
        
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        
        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1); // autoboxing 1 to new Integer(1)
        stack2.push(2);
        stack2.push(3);
        
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        


 	}
}
