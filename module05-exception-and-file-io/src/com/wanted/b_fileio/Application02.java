package com.wanted.b_fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        /*comment
        *  try()*/

        Scanner sc = new Scanner(System.in);
        System.out.print("저장할 메시지 입력 : ");
        String message = sc.nextLine();

        /*comment
        *  try() 구문은 기존 try-catch 구문을 발전시킨 구문이며
        *  try-catch 에서는 finally 블럭에서 자원을 항상 해제를 해줘야한다
        *  try() 를 사용하게 되면, 사용한 리소스를 finally 블럭 없이 자동으로 제거해준다
        * */
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("user_input"))) {
            writer.write("사용자 입력 : "+message);
            writer.write(" / 작성 시간 : "+ LocalDateTime.now());
            writer.flush();
            System.out.println("데이터 저장 완료 !");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
