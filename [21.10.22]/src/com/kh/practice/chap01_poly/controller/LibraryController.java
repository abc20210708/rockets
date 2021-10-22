package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;
import day10.modi.pac1.B;
import day10.modi.pac2.C;

public class LibraryController {

    private Member mem;//null로 명시초기화
    Book[] bList = new Book[5];

    public LibraryController() {
        bList[0] = new CookBook("백종원의 집밥","백종원","tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스","루피","japan",12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);

    }

    public void insertMember(Member mem) {
        this.mem = mem;
    }

    public Member myInfo() {
        System.out.println(mem);
        return mem;
    }

    public Book[] selectAll() {
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i+"번 도서 : " + bList[i]);
        }
        return bList;

    }

    public Book[] searchBook(String keyword) {
        Book[] temp = new Book[5];

        int count = 0;

        for (int i = 0; i < bList.length; i++) {
            if (bList[i].getTitle().contains(keyword)) {
                temp[count] = bList[i];
                count++;
            }
        }

       for (Book book : temp) {
           if(book != null)
           System.out.println(book);
       }
        return temp;
    }

    public int rentBook(int index) {

        return 0;
    }



}//end class
