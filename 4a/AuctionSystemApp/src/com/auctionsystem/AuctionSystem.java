package com.auctionsystem;
import java.util.ArrayList;
import java.util.List;
public class AuctionSystem {
	 private List<Bidder> bidders = new ArrayList<>();
	    private String itemName;

	    public AuctionSystem(String itemName) {
	        this.itemName = itemName;
	    }

	    public void subscribe(Bidder bidder) {
	        bidders.add(bidder);
	        System.out.println(bidder.getName() + " has subscribed to auction notifications for item: " + itemName);
	    }

	    public void unsubscribe(Bidder bidder) {
	        bidders.remove(bidder);
	        System.out.println(bidder.getName() + " has unsubscribed from auction notifications for item: " + itemName);
	    }

	    public void notifyBidders(String eventType) {
	        for (Bidder bidder : bidders) {
	            bidder.update(eventType, itemName);
	        }
	    }

	    public void startBidding() {
	        System.out.println("Bidding has started for item: " + itemName);
	        notifyBidders("Bidding Start");
	    }

	    public void endBidding() {
	        System.out.println("Bidding has ended for item: " + itemName);
	        notifyBidders("Bidding End");
	    }

	    public void itemAvailable() {
	        System.out.println("Item is available for auction: " + itemName);
	        notifyBidders("Item Available");
	    }
}
