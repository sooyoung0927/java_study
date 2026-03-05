package com.wanted.b_collection.a_list.run;

import com.wanted.b_collection.a_list.compare.AscendingPrice;
import com.wanted.b_collection.a_list.compare.AscendingTitle;
import com.wanted.b_collection.a_list.compare.DescendingPrice;
import com.wanted.b_collection.a_list.compare.DescendingTitle;
import com.wanted.b_collection.a_list.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class Application02 {
    public static void main(String[] args) {
        /*comment
        *  ArrayList 활용하기 */


        //  여러 번의 책을 하나의 변수로 관리하고 싶다 *
        
        List<BookDTO> bookList = new ArrayList();
        
        bookList.add(new BookDTO(1,"홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2,"목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3,"동의보감", "허준", 40000));
        bookList.add(new BookDTO(4,"삼국사기", "김부식", 45000));
        bookList.add(new BookDTO(5,"삼국유사", "일연", 58000));

        System.out.println("bookList = " + bookList);

        for(BookDTO book : bookList){ // : 오른쪽에 담겨있는 걸 하나씩 왼쪽에 넣어주겠다
                                      // = bookList에 있는 것들을 하나씩 book 변수에 담는다
                                      // 하나씩 생겨날 book의 타입은 BookDTO로
            System.out.println("book = " + book);
        }


        // 가격 순으로 오름차순 정렬
        // compare 패키지 만들고 그 안에 정렬 가능한 클래스를 상속 받아 구현할 예정
        System.out.println("=======가격 오름차순 정렬하기=========");
        bookList.sort(new AscendingPrice());

        for(BookDTO book : bookList){
            System.out.println("book = " + book);
        }
        System.out.println("=======가격 오름차순 정렬하기=========");


        System.out.println("=======가격 내림차순 정렬 하기=========");
        bookList.sort(new DescendingPrice());

        for(BookDTO book : bookList){
            System.out.println("book = " + book);
        }
        System.out.println("=======가격 내림차순 정렬하기=========");


        System.out.println("=======제목 오름차순 정렬 하기=========");
        bookList.sort(new AscendingTitle());

        for(BookDTO book : bookList){
            System.out.println("book = " + book);
        }
        System.out.println("=======제목 오름차순 정렬하기=========");

        System.out.println("=======제목 내림차순 정렬 하기=========");
        bookList.sort(new DescendingTitle());

        for(BookDTO book : bookList){
            System.out.println("book = " + book);
        }
        System.out.println("=======제목 내림차순 정렬하기=========");


        /*comment
        *  가격 오름차순 정렬을 해보았다
        *  이제 코드가 어떤 식으로 상호 작용하는지 확인했으니
        *  내림차순, 제목 정렬(String 클래스가 가지고 있는 compareTo()클래스를 활용) 등을 시도해보자 */

    }
}
