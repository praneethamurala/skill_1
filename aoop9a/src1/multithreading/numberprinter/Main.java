package multithreading.numberprinter;

public class Main {
	public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();


        Thread threadTwo = new Thread(new PrintTask(numberPrinter, "two"));
        Thread threadThree = new Thread(new PrintTask(numberPrinter, "three"));
        Thread threadFour = new Thread(new PrintTask(numberPrinter, "four"));
        Thread threadFive = new Thread(new PrintTask(numberPrinter, "five"));
        Thread threadNumber = new Thread(new PrintTask(numberPrinter, "number"));

       
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        threadFive.start();
        threadNumber.start();
    }
}
