package com.wanted.a_exception.c_userexception.exception;

public class MoneyNegativeException extends NegativeException{
    // 상품을 구매할 건데 가진 돈이 음수일 때 발생시 예외

    public MoneyNegativeException(String msg){
        super(msg);
    }
}
