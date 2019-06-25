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
      int current = 1;     // Set first bid default
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a bidder's name: ");
      newBidderName = keyboard.next();
      System.out.println("Enter the bidder's maximum bid: ");
      newMaxBid = keyboard.nextInt();
      
      Bid first = new Bid(newBidderName, newMaxBid, 1);
      
      auction.push(first);
      
      // Loop through additional bidders with input
      
      System.out.println("Enter a bidder's name: ");
      newBidderName = keyboard.next();
      System.out.println("Enter the bidder's maximum bid: ");
      newMaxBid = keyboard.nextInt();
      
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
      
      System.out.println("High bidder: " + auction.top().getName());
      System.out.println("Max bid: " + auction.top().getMaxBid());
      
      // Next loop
      
      System.out.println("Enter a bidder's name: ");
      newBidderName = keyboard.next();
      System.out.println("Enter the bidder's maximum bid: ");
      newMaxBid = keyboard.nextInt();
      
      Bid third = new Bid(newBidderName, newMaxBid, current);
      
      // Increment bidders current bid unless higher than their max bid
      
      if ((auction.top().getMaxBid()) > third.getMaxBid()) {
         auction.top().setMaxBid(third.getMaxBid() + 1);
         }
      
       // Replace top bidder if their max is higher that current top bidder max
      
      if (third.getMaxBid() > (auction.top().getMaxBid()) ) {
         int oldMax = auction.top().getMaxBid();
         auction.push(third);
         auction.top().setCurrentBid(oldMax + 1);
      }
      
      System.out.println("High bidder: " + auction.top().getName());
      System.out.println("Max bid: " + auction.top().getMaxBid());

      // Next loop
      
      System.out.println("Enter a bidder's name: ");
      newBidderName = keyboard.next();
      System.out.println("Enter the bidder's maximum bid: ");
      newMaxBid = keyboard.nextInt();
      
      Bid fourth = new Bid(newBidderName, newMaxBid, current);
      
      // Increment bidders current bid unless higher than their max bid
      
      if ((auction.top().getMaxBid()) > fourth.getMaxBid()) {
         auction.top().setMaxBid(fourth.getMaxBid() + 1);
         }
      
       // Replace top bidder if their max is higher that current top bidder max
      
      if (fourth.getMaxBid() > (auction.top().getMaxBid()) ) {
         int oldMax = auction.top().getMaxBid();
         auction.push(fourth);
         auction.top().setCurrentBid(oldMax + 1);
      }
      
      System.out.println("High bidder: " + auction.top().getName());
      System.out.println("Max bid: " + auction.top().getMaxBid());
      
      // Next loop
      
      System.out.println("Enter a bidder's name: ");
      newBidderName = keyboard.next();
      System.out.println("Enter the bidder's maximum bid: ");
      newMaxBid = keyboard.nextInt();
      
      Bid fifth = new Bid(newBidderName, newMaxBid, current);
      
      // Increment bidders current bid unless higher than their max bid
      
      if ((auction.top().getMaxBid()) > fifth.getMaxBid()) {
         auction.top().setMaxBid(fifth.getMaxBid() + 1);
         }
      
       // Replace top bidder if their max is higher that current top bidder max
      
      if (fifth.getMaxBid() > (auction.top().getMaxBid()) ) {
         int oldMax = auction.top().getMaxBid();
         auction.push(fifth);
         auction.top().setCurrentBid(oldMax + 1);
      }
      
      System.out.println("High bidder: " + auction.top().getName());
      System.out.println("Max bid: " + auction.top().getMaxBid());


      
   }

}