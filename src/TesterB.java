public class TesterB {
    public void doOtherStuff() {
        for (int i = 5; i >= 0; i--) {
            // Replace XXX below with your enqueue method
            EnumPrintQue x = EnumPrintQue.INSTANCE;
            x.enqueue(Integer.toString(i));
        }
    }
}
