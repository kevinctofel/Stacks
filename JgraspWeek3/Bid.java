import ch02.stacks.*;
import support.*;

public class Bid<T> extends LinkedStack<T>

{
   protected String bidderName;
   protected int maxBid, currentBid;
   
   // Constructor
   
   public Bid(String newBidderName, int newMaxBid, int newCurrentBid)
   {
      bidderName = newBidderName; maxBid = newMaxBid; currentBid = newCurrentBid;
   }
   
   public String getName() {
      return this.bidderName;
   }
   
   public int getMaxBid() {
      return this.maxBid;
   }
   
   public int getCurrentBid() {
      return this.currentBid;
   }
   
   public void setName(String name) {
      this.bidderName = name;
   }
   
   public void setMaxBid(int maxBid) {
      this.maxBid = maxBid;
   }
   
   public void setCurrentBid(int currentBid) {
      this.currentBid = currentBid;
   }
   
   public String toString(){
      
      return this.bidderName + " " + this.currentBid + " " + this.maxBid;
   }

}