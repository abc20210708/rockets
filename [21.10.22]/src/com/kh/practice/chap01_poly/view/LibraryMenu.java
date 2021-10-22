package com.kh.practice.chap01_poly.view;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

import java.util.Scanner;

public class LibraryMenu {

   private LibraryController lc  = new LibraryController();
   private Scanner sc = new Scanner(System.in);

   public void mainMenu() {



           System.out.print("이름 : ");
           String name = sc.next();
           System.out.print("나이 : ");
           int age = sc.nextInt();
           sc.nextLine();
           System.out.print("성별 : ");
           char gender = sc.nextLine().charAt(0);

          Member nm = new Member(name, age, gender);

           lc.insertMember(nm);

       while (true) {
           System.out.println("==== 메뉴 ====");
           System.out.println("1. 마이페이지");
           System.out.println("2. 도서 전체 조회");
           System.out.println("3. 도서 검색");
           System.out.println("4. 도서 대여하기");
           System.out.println("9. 프로그램 종료하기");
           System.out.print("메뉴 번호 : ");
           int menu = sc.nextInt();

           switch (menu) {
               case 1:
                   lc.myInfo();
                   break;
               case 2:
                   lc.selectAll();
                   break;
               case 3:
                   System.out.print("검색할 제목 키워드 : ");
                   String key = sc.next();
                   lc.searchBook(key);
                   break;
               case 4:
                   //lc.rentBook();
                   break;
               case 9:
                   return;
               default:
                   System.out.println("잘못 입력하셨습니다. 다시 입력해주세요!");


           }

       }


   }

   public void selectAll() {
      Book[] b = lc.selectAll();
       for (int i = 0; i < b.length; i++) {
           System.out.println(b[i]);
       }

   }

   public void searchBook() {

   }

   public void rentBook() {

   }

}//end class
