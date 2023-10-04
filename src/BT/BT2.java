package BT;

import java.util.regex.Pattern;

public class BT2 {
    public static void main(String[] args) {
        String text = "Hello my friend";
        String regex = "Hello my friend";
        boolean validateText = Pattern.matches(regex, text);
        if (validateText){
            System.err.println("Chuỗi rỗng");
        }else{
            System.err.println("Chuỗi không rỗng");
        }
    }
}
