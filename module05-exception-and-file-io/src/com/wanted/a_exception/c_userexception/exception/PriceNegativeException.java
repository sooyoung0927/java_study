package com.wanted.a_exception.c_userexception.exception;

public class PriceNegativeException extends NegativeException{
    // 상품을 구매할 건데 상품 가격이 음수일 때 발생시킬 예외

    public PriceNegativeException(String msg) {
        super(msg);
    }
}
