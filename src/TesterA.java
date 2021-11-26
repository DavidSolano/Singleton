public class TesterA {
    public void doStuff() {
        for (int i = 0; i < 5; i++) {
            // Replace XXX below with your enqueue method
            EnumPrintQue x = EnumPrintQue.INSTANCE;
            x.enqueue(Integer.toString(i));
        }
    }
}
