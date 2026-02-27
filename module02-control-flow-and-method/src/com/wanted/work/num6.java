package com.wanted.work;

import java.util.Scanner;

public class num6 {
    public static void main(String[] args) {
    }

    public void practice6(){
        Scanner sc = new Scanner(System.in);

        System.out.print("권한을 확인하고자 하는 회원 등급 : ");
        String level = sc.next();

        if(level.equals("관리자")){
            System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능");
        }else if(level.equals("회원")){
            System.out.println("게시글 작성, 게시글 조회, 댓글 작성이 가능");
        }else if(level.equals("비회원")){
            System.out.println("게시글 조회 가능");
        }else{
            System.out.println("잘못 입력하였습니다.");
        }
    }
}
