package com.wanted.work;

public class for14 {
    public static void main(String[] args) {

        int sum=0;
        int start=70;
        int count=0;

        while(true) {
            if (sum > 10000) {
                System.out.println("총 모금횟수 = " + count);
                break;

            } else {
                sum+=start;
                count++;
                System.out.println(count+"회 모금액 : "+ sum+"원");
            }
        }
    }
}
