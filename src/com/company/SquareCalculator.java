package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(">>> 제곱 계산기 <<<");
        System.out.println("밑을 입력하세요.");

        double numberBottom = scan.nextInt();
        scan.nextLine();

        System.out.println("지수를 입력하세요.");
        double numberIndex = scan.nextInt();
        scan.nextLine();

        double numberResult = Math.pow(numberBottom,numberIndex);
        System.out.println("계산 결과 : " + numberResult);
    }
}
