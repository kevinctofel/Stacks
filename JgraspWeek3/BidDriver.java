import ch02.stacks.*;
import support.*;
import java.util.Scanner;

public class BidDriver 
{

   public static void main(String args[])
   {
   
      LinkedStack<Bid> auction = new LinkedStack<> ();   // Create stack of Bid objects
   
      String newBidderName, more="Y";     // Sentinel value for looping
      int newMaxBid;       // Declare new max bid
      int current = 1;     // Set first bid default
      
      // Scanner object needed for input
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a bidder's name: ");
      newBidderName = keyboard.next();
      System.out.println("Enter the bidder's maximum bid: ");
      newMaxBid = keyboard.nextInt();
      
      // Create the first bid object
      Bid first = new Bid(newBidderName, newMaxBid, 1);
      // And push it on the stack
      auction.push(first);
      
      System.out.println("More bidders? Y or N: ");
      more = keyboard.next();
      
      while (more.equals("Y"))   
      {         
      
      // Loop through additional bidders
      
      System.out.println("Enter a bidder's name: ");
      newBidderName = keyboard.next();
      System.out.println("Enter the bidder's maximum bid: ");
      newMaxBid = keyboard.nextInt();
      
      // Create next Bid object
      Bid nextBid = new Bid(newBidderName, newMaxBid, current);
      
      // Increment bidders current bid unless higher than their max bid
      
      if ((auction.top().getMaxBid()) > nextBid.getMaxBid()) {
         auction.top().setMaxBid(nextBid.getMaxBid() + 1);
         }
      
      // Replace top bidder if their max is higher that current top bidder max
      
      if ( nextBid.getMaxBid() > (auction.top().getMaxBid()) ) {
         int oldMax = auction.top().getMaxBid();
         auction.push(nextBid);
         auction.top().setCurrentBid(oldMax + 1);
      }
      
      System.out.println("More bidders? Y or N: ");
      more = keyboard.next();
      } // End While loop, no more bidders
      
      System.out.println("Here is the bid history: ");
      
      // Pop items off the stack to print out from high bid to low bid
      
      while(!auction.isEmpty()){
         System.out.println(auction.top().getName() + " " + auction.top().getCurrentBid());
         auction.pop();
      }
      
   }

}