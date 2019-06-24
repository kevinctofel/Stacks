import ch02.stacks.*;
import support.*;

public class myLinkedStack<T> extends LinkedStack<T> {

   public String toString(){
      String output = "";
      LLNode<T> temp = top;
      
      while(temp != null) {
         output += temp.getInfo().toString() + " ";
         temp = temp.getLink();
      }
      
      return output;
   }
   
   public int size(){
      
      int items = 0;
      LLNode<T> temp = top;
      
      while (temp != null) {
         temp = temp.getLink();
         items ++;
      }
       
      return items;
   
   }
   
   public void popSome(int count) throws StackUnderflowException{
   
   if (count > this.size()){
      throw new StackUnderflowException("\nCan't pop " + count + " items as the stack is too small.");   
      }
   while (count != 0) {
      top = top.getLink();
      count = count - 1;
      }
   }
   
   public boolean swapStart(){
   
   LLNode<T> temp = top;
   LLNode<T> current = temp;
   LLNode<T> previous = temp.getLink();
   
   if (this.size() < 2)
      return false;
   else {   // Traverse notes and keep track of current & previous until reaching top 
        current.setLink(previous.getLink());
        previous.setLink(top.getLink());
        top = previous;
        previous.setLink(temp.getLink());
        previous.setLink(current);
        }
      return true;
      
   
   }
   
   public String popTop() throws StackUnderflowException {
    {
      if (top == null)
        throw new StackUnderflowException("Pop attempted on an empty stack.");
      else
      {
         T temp = top.getInfo();
         top = top.getLink();
         return temp.toString();
      }

    }

  }
}