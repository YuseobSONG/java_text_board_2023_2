package com.sbs.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 프로그램 시작 ==");

    while (true) {
      System.out.printf("명령 )");
      String input = sc.nextLine();
      System.out.printf("입력된 명령어 : %s\n" ,input);

      if (input.equals("exit")) {
        break;
      }
    }
    System.out.println("== 프로그램 종료 ==");
    sc.close();
  }
}