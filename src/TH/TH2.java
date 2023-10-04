package TH;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TH2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^[_a-z0-9]{6,}$";
        do {
            System.out.println("Nhập tên tài khoản :");
            String email = scanner.nextLine();
            boolean validateEmail = Pattern.matches(regex, email);
            if (validateEmail){
                System.out.println("Hợp lệ tên bạn là : " + email);
                break;
            }else{
                System.out.println("Tên người dùng không hợp lệ");
            }
        }while (true);
    }
}
