import ch02.stacks.*;
import support.*;
import java.util.Scanner;

public class BidDriver 
{

   public static void main(String args[])
   {
   
      LinkedStack<Bid> auction = new LinkedStack<> ();
   
      String newBidderName;
      int newMaxBid;
      int current = 0;     // Track current price
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a bidder's name: ");
      newBidderName = keyboard.next();
      System.out.println("Enter the bidder's maximum bid: ");
      newMaxBid = keyboard.nextInt();
      
      Bid first = new Bid(newBidderName, newMaxBid, 1);
      
      auction.push(first);
      current ++;    // Increment current bid
      
      // Loop through additional bidders with input
      
      System.out.println("Enter a bidder's name: ");
      newBidderName = keyboard.next();
      System.out.println("Enter the bidder's maximum bid: ");
      newMaxBid = keyboard.nextInt();
      Bid nextBid = new Bid(newBidderName, newMaxBid, current);
      
      auction.push(nextBid);
      current ++;    // Increment current bid
      
      // Increment bidders current bid unless higher than their max bid
      
      System.out.println(((auction.top()).getMaxBid()));
      System.out.println(((auction.top()).getCurrentBid()));
      
     //  while (second.getCurrentBid() <= top.getInfo().getCurrentBid())
//       {
//          second.setCurrentBid(second.getCurrentBid() + 1);
//          System.out.println(second.getCurrentBid());
//       }
      
   }

}