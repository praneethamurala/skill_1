package com.auctionsystem;

public class Main {
	 public static void main(String[] args) {
	        // Create an auction system for a specific item
	        AuctionSystem auctionSystem = new AuctionSystem("Antique Vase");

	        // Create bidders
	        Bidder bidder1 = new Bidder("Alice");
	        Bidder bidder2 = new Bidder("Bob");
	        Bidder bidder3 = new Bidder("Charlie");

	        // Subscribe bidders to the auction system
	        auctionSystem.subscribe(bidder1);
	        auctionSystem.subscribe(bidder2);

	        // Notify item availability
	        auctionSystem.itemAvailable();

	        // Start bidding
	        auctionSystem.startBidding();

	        // Unsubscribe a bidder and continue bidding
	        auctionSystem.unsubscribe(bidder1);
	        auctionSystem.startBidding();

	        // End bidding
	        auctionSystem.endBidding();
	    }
}
