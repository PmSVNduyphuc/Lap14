package Lap14Ex2;

public class DemoValidator {
    public static void main(String[] args) {
        Vadilator simpleEmail=new Vadilator("\\w+@\\w+(\\.\\w+)+");
        System.out.println(simpleEmail.vadilator("abc@cde.com"));
        System.out.println(simpleEmail.vadilator("abccde.com"));
    }
}
