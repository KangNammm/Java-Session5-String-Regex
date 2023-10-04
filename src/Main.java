import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size cho mảng :");
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Nhập phần tử cho mảng " + (i+1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("mảng bao gồm :");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}