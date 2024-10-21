package multithreading.numberprinter;

public class PrintTask implements Runnable{

	private final NumberPrinter numberPrinter;
    private final String taskType;

    public PrintTask(NumberPrinter numberPrinter, String taskType) {
        this.numberPrinter = numberPrinter;
        this.taskType = taskType;
    }

    @Override
    public void run() {
        switch (taskType) {
            case "two":
                numberPrinter.printTwo();
                break;
            case "three":
                numberPrinter.printThree();
                break;
            case "four":
                numberPrinter.printFour();
                break;
            case "five":
                numberPrinter.printFive();
                break;
            case "number":
                numberPrinter.printNumber();
                break;
            default:
                throw new IllegalArgumentException("Invalid task type");
        }
    }
}
