package com.wanted.a_exception.c_userexception.exception;

public class NotEnoughMoneyException extends Exception{
    // 상품을 구매할 건데 가진 돈이 충분하지 않을 때 발생시킨 예외

    public NotEnoughMoneyException(String msg) {
        super(msg);
    }
}
