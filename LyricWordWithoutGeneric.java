package Lap14Ex1_1;

import java.util.ArrayList;
import java.util.List;

public class LyricWordWithoutGeneric {
    private static final Work[] lyric = {
            new Work("you",1),new Work("say",2),new Work("it",3),
            new Work("best",4),new Work("when",5),new Work("you",6),
            new Work("say",7),new Work("nothing",8),new Work("at",9),
            new Work("all",10)};

    public static void main(String[] args) {
        List lyric = new ArrayList<>();
        for(Object w:  lyric)
            lyric.add(w);
        for (Object o:lyric){
            Work w=(Work) o;
            System.out.println(w.getValue()+","+w.getPosition());
        }
    }

}
