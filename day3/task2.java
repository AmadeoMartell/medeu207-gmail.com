package day3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            if (b == 0) break;
            else System.out.println(a / b);
        }
    }
}
