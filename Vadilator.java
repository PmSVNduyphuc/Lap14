package Lap14Ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vadilator {
    private String pattern;
    public Vadilator(String pattern){
        this.pattern = pattern;
    }
    public boolean vadilator(String value){
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(value);
        return m.matches();
    }
}
