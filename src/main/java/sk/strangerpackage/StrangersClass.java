package sk.strangerpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StrangersClass {
    private List<String> verses = null;

    public StrangersClass() {
        this.verses = Arrays.asList(
                "Sk slovan skurvena bratislava ....",
                "Co voda to potok co belasy to kokot",
                "Kurvy belase ....",
                "Rozkopal som, slovanistu, hned mi je lepsie...");
    }

    public String getVers() {
        Random rnd = new Random();
        return verses.get(rnd.nextInt(verses.size()));
    }

    public static void main(String[] args) {
        StrangersClass str = new StrangersClass();
        for (int i = 0; i < 10; i++) {
            System.out.println(str.getVers());
        }
    }
}
