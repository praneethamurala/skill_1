package com.auctionsystem;

public class Bidder implements AuctionEvent {
    private String bidderName;

    public Bidder(String bidderName) {
        this.bidderName = bidderName;

}

    @Override
    public void update(String eventType, String itemName) {
        System.out.println("Notification to " + bidderName + ": " + eventType + " event for item: " + itemName);
    }

    public String getName() {
        return bidderName;
    }
}
