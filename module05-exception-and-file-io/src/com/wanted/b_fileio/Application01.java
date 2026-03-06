package com.wanted.b_fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application01 {
    public static void main(String[] args) {
        /*comment
        *  파일 입력과 출력
        *  파일 입출력은 프로그램에서 데이터를 파일에 저장하거나 읽어오는 기능을 의미한다
        *  이는 데이터를 우리가 영구적으로 보존하거나 외부의 데이터를 횔용할 때 필수적이다
        *  파일 작업은 외부 자원에 의존을 한다
        *  파일이 없거나 권한이 부족하거나 이름이 잘못 되거나 기타 등등의 예외상황이 자주 발생한다
        *  */

        // 기본 파일 작성해보기
        try {
            // 파일 관련 클래스들은 예외를 객체 생성 시에 반드시 처리해야 한다
            FileWriter writer = new FileWriter("output.txt");
            writer.write("helloworld");
            writer.write("hellowanted");

            // flush() 는 버퍼에 있는 데이터를 밀어서 버퍼를 즉시 지우고 디스크에 기록한다
            writer.flush();
            System.out.println("파일 쓰기 완료");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileReader reader = new FileReader("output.txt");
            // 읽을 파일명을 지정하지 않으면 FileNotFoundException 발생

            int data;
            // 파일 끝까지 읽는 방법 (파일의 끝은 -1로 정의되어 있음)
            // .read() : 파일에서 한 문자씩 읽으며 파일 끝에 도달하면 -1을 반환한다
            while((data = reader.read()) !=-1){
                System.out.print((char) data); // 이거는 읽을 때 아스키코드로 한 글자씩 읽기 떄문에 형변환 해줌
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
