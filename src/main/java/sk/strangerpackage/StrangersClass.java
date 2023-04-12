package sk.strangerpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StrangersClass {
    private final List<String> poems;

    public StrangersClass() {
        this.poems = Arrays.asList(
                "Hello\nIs there anybody in there?\nJust nod if you can hear me\nIs there anyone home?",
                "New car, caviar, four-star daydream \nThink I'll buy me a football team",
                "If you don't eat yer meat, \nyou can't have any pudding.\nHow can you have any pudding\nif you don't eat yer meat?",
                "Mother should I run for president\nMother should I trust the government\nMother will they put me in the firing line\nOoooh aah, is it just a waste of time");
    }

    public String getPoem() {
        Random rnd = new Random();
        return poems.get(rnd.nextInt(poems.size()));
    }
}
