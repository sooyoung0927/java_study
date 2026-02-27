package com.wanted.work;

import java.util.Scanner;

public class num9 {
    public static void main(String[] args) {
    }

    public void practice9(){
        Scanner sc = new Scanner(System.in);

        System.out.print("중간고사 점수 : ");
        int middle = sc.nextInt();
        System.out.print("기말고사 점수 : ");
        int test = sc.nextInt();
        System.out.print("과제 점수 : ");
        int hw = sc.nextInt();
        System.out.print("출석 횟수 : ");
        int present = sc.nextInt();
        System.out.println("  ");

        double total = (middle*0.2d)+(test*0.3d)+(hw*0.3d)+(present);


        if(total>=70.0 && present>=14){
            System.out.println("=======결과========");
            System.out.println("중간고사 점수(20) :"+(middle*0.2d));
            System.out.println("기말고사 점수(30) :"+(test*0.3d));
            System.out.println("과제 점수(30) :"+(hw*0.3d));
            System.out.println("출석 점수(20) :"+present);
            System.out.println("총점 : "+ total);
            System.out.println("PASS");
        }else if(total<70.0 && present>=14){
            System.out.println("=======결과========");
            System.out.println("FAIL [점수 미달] (총점 "+total+")");
        } else if(total>=70.0 && present<14){
            System.out.println("=======결과========");
            System.out.println("FAIL [출석 횟수 부족] ("+present+"/20)");
        }else{
            System.out.println("=======결과========");
            System.out.println("FAIL [점수 미달] (총점 "+total+")");
            System.out.println("FAIL [출석 횟수 부족] ("+present+"/20)");
        }

    }
}
