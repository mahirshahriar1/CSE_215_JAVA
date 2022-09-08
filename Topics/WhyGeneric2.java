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



class StringStack {
   private java.util.ArrayList<String> list = new java.util.ArrayList<>();
 
   public int getSize() {
       return list.size();
   }
 
   
   public void push(String o) {
      list.add(o);
   }

   public String pop() {
      String o = list.get(getSize() - 1); 
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
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        StringStack stringStack = new StringStack();
        stringStack.push("London");
        stringStack.push("Berlin");
        stringStack.push("Dhaka");

        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());

 }
}

