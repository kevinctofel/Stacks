import ch02.stacks.*;
import support.*;
import java.util.Scanner;

public class BidDriver<T> extends LinkedStack<T>
{

   public static void main(String args[])
   {
   
      String newBidderName;
      int newMaxBid;
      int current = 1;     // Start the bidding at one
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a bidder's name: ");
      newBidderName = keyboard.nextLine();
      System.out.println("Enter the bidder's maximum bid: ");
      newMaxBid = keyboard.nextInt();
      
      Bid first = new Bid(newBidderName, newMaxBid, 1);
      
      
      
      
   
   }

}