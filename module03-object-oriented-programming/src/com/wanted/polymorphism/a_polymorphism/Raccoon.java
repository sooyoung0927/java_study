package com.wanted.polymorphism.a_polymorphism;

public class Raccoon extends Animal{

    @Override
    public void eat() {
        System.out.println("너구리 라면을 먹습니다");
    }

    @Override
    public void run() {
        System.out.println("너구리가 쓰레기통으로 달려갑니다 !");
    }

    @Override
    public void bark() {
        System.out.println("너굴너굴너굴너굴");
    }

    public void bite(){
        System.out.println("미친 너구리가 사람을 물고 다닙니다");
    }
}
