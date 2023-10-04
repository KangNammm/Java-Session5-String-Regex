package BT;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi muốn đảo ngược: ");
        String text = scanner.nextLine();
        StringBuilder change = new StringBuilder(text);
        change.reverse();
        System.err.println("Chuỗi ban đầu: "+text);
        System.err.println("Chuỗi đảo ngược: " + change);
    }
}
