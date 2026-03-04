package com.wanted.polymorphism.a_polymorphism;

public class Koala extends Animal{

    @Override
    public void eat() {
        System.out.println("코알라가 잠에서 깨어 밥을 먹는다");
    }

    @Override
    public void run() {
        System.out.println("너무 느려서 달리지만 걷는 거보다 느리네요");
    }

    @Override
    public void bark() {
        System.out.println("코알라가 소리를 지릅니다");
    }

    public void sleep(){
        System.out.println("코알라가 잠에 들어서 깨어날 줄도 모르고 하루종일 잠만 잡니다 개부러워요");
    }
}
