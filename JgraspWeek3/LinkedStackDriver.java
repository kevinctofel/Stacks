import ch02.stacks.*;
import support.LLNode;

public class LinkedStackDriver {

   public static void main (String args[]) {
   
   myLinkedStack myStack;
   myStack = new myLinkedStack <> ();
   
   //Add five elements to the stack
   myStack.push(11);    
   myStack.push(22);
   myStack.push(33);
   myStack.push(44);
   myStack.push(55);

   // Print out the stack and the number of items
   System.out.println("Here is what's on the stack: " + myStack.toString());
   System.out.println("The stack size is: " + myStack.size());
 
   // Pop some items off the stack and then show remaining items and stack size
   myStack.popSome(3); // Change this parameter for testing
   System.out.println("Here is what's on the stack: " + myStack.toString());
   System.out.println("The stack size is: " + myStack.size());
   
//    // Push some more items on the stack before swapStart
    myStack.push(66);
    myStack.push(77);
    myStack.push(88);
    System.out.println("Here is what's on the stack now: " + myStack.toString());
   
   boolean moreThan2 = myStack.swapStart();
   if (moreThan2){
      System.out.println("There are at least 2 items on the stack so I swapped the top 2.");
      System.out.println("Here is what's on the stack now: " + myStack.toString());
   }
   else
      System.out.println("Can't swap the top two items as the stack has less than 2 elements.");
   
   System.out.println((myStack.popTop()) + " just got popped off the stack."); // Pop the top and return top
   
   System.out.println("Here is what's on the stack now: " + myStack.toString());
   }
}