import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public enum EnumPrintQue {
    INSTANCE;

    private List<String> words = new ArrayList<>();

    public void enqueue(String word) {
        words.add(word);
    }

    public String flush(){
        String join = String.join("\n", words);
        return join;
    }
}


