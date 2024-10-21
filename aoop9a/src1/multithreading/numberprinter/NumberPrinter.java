package multithreading.numberprinter;

public class NumberPrinter {
	 private int currentNumber = 1;
	    private final int MAX_NUMBER = 15;

	    // Synchronized method to print divisible by 2
	    public synchronized void printTwo() {
	        while (currentNumber <= MAX_NUMBER) {
	            if (currentNumber % 2 == 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
	                System.out.println("Divisible by 2: " + currentNumber);
	                currentNumber++;
	                notifyAll();
	            } else {
	                try {
	                    wait();
	                } catch (InterruptedException e) {
	                    Thread.currentThread().interrupt();
	                }
	            }
	        }
	    }

	    // Synchronized method to print divisible by 3
	    public synchronized void printThree() {
	        while (currentNumber <= MAX_NUMBER) {
	            if (currentNumber % 3 == 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
	                System.out.println("Divisible by 3: " + currentNumber);
	                currentNumber++;
	                notifyAll();
	            } else {
	                try {
	                    wait();
	                } catch (InterruptedException e) {
	                    Thread.currentThread().interrupt();
	                }
	            }
	        }
	    }

	    // Synchronized method to print divisible by 4
	    public synchronized void printFour() {
	        while (currentNumber <= MAX_NUMBER) {
	            if (currentNumber % 4 == 0 && currentNumber % 5 != 0) {
	                System.out.println("Divisible by 4: " + currentNumber);
	                currentNumber++;
	                notifyAll();
	            } else {
	                try {
	                    wait();
	                } catch (InterruptedException e) {
	                    Thread.currentThread().interrupt();
	                }
	            }
	        }
	    }

	    // Synchronized method to print divisible by 5
	    public synchronized void printFive() {
	        while (currentNumber <= MAX_NUMBER) {
	            if (currentNumber % 5 == 0) {
	                System.out.println("Divisible by 5: " + currentNumber);
	                currentNumber++;
	                notifyAll();
	            } else {
	                try {
	                    wait();
	                } catch (InterruptedException e) {
	                    Thread.currentThread().interrupt();
	                }
	            }
	        }
	    }

	
	    public synchronized void printNumber() {
	        while (currentNumber <= MAX_NUMBER) {
	            if (currentNumber % 2 != 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
	                System.out.println("Number: " + currentNumber);
	                currentNumber++;
	                notifyAll();
	            } else {
	                try {
	                    wait();
	                } catch (InterruptedException e) {
	                    Thread.currentThread().interrupt();
	                }
	            }
	        }
	    }
	
}
