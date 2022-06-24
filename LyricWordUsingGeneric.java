package Lap14Ex1_1;

import java.util.ArrayList;
import java.util.List;
public class LyricWordUsingGeneric {
    private static final Work[] lyric = {
            new Work("you",1),new Work("say",2),new Work("it",3),
            new Work("best",4),new Work("when",5),new Work("you",6),
            new Work("say",7),new Work("nothing",8),new Work("at",9),
            new Work("all",10)};

    public static void main(String[] args) {
        List<Work> lyric = new ArrayList<Work>();
        for (Work w : lyric)
            lyric.add(w);

        //show all elements of words
        for (Work w : lyric) {
            System.out.print(w.getValue() + ", "+ w.getPosition());
        }

    }
}
