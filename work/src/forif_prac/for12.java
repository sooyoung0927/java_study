package forif_prac;

import java.util.Scanner;

public class for12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while(true){
            System.out.print("연산자 : ");
            String sign = sc.next();

            if(sign.equals("exit")) {
                System.out.println("종료합니다");
                break;
            }

            System.out.print("정수1 : ");
            int num1 = sc.nextInt();

            System.out.print("정수2 : ");
            int num2 = sc.nextInt();

            if(sign.equals("/") && num2==0){
                System.out.println("0으로 나눌 수 없습니다. ");
                break;
            }

            switch(sign){
                case "+":
                    System.out.println(num1+"+"+num2+"="+(num1+num2));
                    break;
                case "-":
                    System.out.println(num1+"-"+num2+"="+(num1-num2));
                    break;
                case "*":
                    System.out.println(num1+"*"+num2+"="+(num1*num2));
                    break;
                case "/":
                    System.out.println(num1+"/"+num2+"="+(num1/num2));
                    break;
                case "%":
                    System.out.println(num1+"%"+num2+"="+(num1%num2));
                    break;
                default:
                    System.out.println("없는 연산자입니다");
            }break;

        }

    }
}
