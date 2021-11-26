public class PrintQueueTester {
    public static void main(String[] args) {
        new TesterA().doStuff();
        new TesterB().doOtherStuff();

        EnumPrintQue x = EnumPrintQue.INSTANCE;

        // Replace XXX below with your flush method
        System.out.println(x.flush());
        System.out.println(x.flush());
    }
}
