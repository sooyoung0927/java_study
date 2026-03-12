package poketmon;

import java.util.Scanner;

public class Order {

    Scanner sc = new Scanner(System.in);
    String nameOfPoketmon;

    Poketmon pp = new Pikachu();
    Poketmon pt = new Turtle();
    Poketmon pf = new Firiry();

    public void selectPoketmon() {
        System.out.println("포켓몬을 골라보자");
        System.out.print("1: 피카츄 2: 파이리 3: 꼬부기");
        int no = sc.nextInt();

        switch (no) {
            case 1:
                nameOfPoketmon="피카츄";
                System.out.println("피카츄를 콜랐습니다");
                selectAttack();
                break;
            case 2:
                nameOfPoketmon="파이리";
                System.out.println("파이리를 콜랐습니다");
                selectAttack();
                break;
            case 3:
                nameOfPoketmon="꼬부기";
                System.out.println("꼬부기를 콜랐습니다");
                selectAttack();
                break;
            default:
                System.out.println("1~3까지의 변호만 입력하세요");
        }
    }

    public void selectAttack() {
        System.out.println("포켓몬의 행위를 골라보자");
        System.out.print("1: 출격 2: 들어와 3: 몸통박치기 4: 눈빛 공격 5: 포켓몬 교환");
        int actno = sc.nextInt();

        switch (actno) {
            case 1:
                //출격
                if(nameOfPoketmon=="피카츄"){
                    ((Pikachu) pp).go();
                    selectAttack();
                }else if(nameOfPoketmon=="파이리"){
                    ((Firiry) pf).go();
                    selectAttack();
                }else{
                    ((Turtle) pt).go();
                    selectAttack();
                }
                break;
            case 2:
                //들어와
                if(nameOfPoketmon=="피카츄"){
                    ((Pikachu) pp).comeback();
                    System.out.println("도망치자 !!");
                }else if(nameOfPoketmon=="파이리"){
                    ((Firiry) pf).comeback();
                    System.out.println("도망치자 !!");
                }else{
                    ((Turtle) pt).comeback();
                    System.out.println("도망치자 !!");
                }
                break;
            case 3:
                //몸통 박치기
                if(nameOfPoketmon=="피카츄"){
                    ((Pikachu) pp).bodyattack();
                    selectAttack();
                }else if(nameOfPoketmon=="파이리"){
                    ((Firiry) pf).bodyattack();
                    selectAttack();
                }else{
                    ((Turtle) pt).bodyattack();
                    selectAttack();
                }
                break;
            case 4:
                //눈빛 박치기
                if(nameOfPoketmon=="피카츄"){
                    ((Pikachu) pp).eyeattack();
                    selectAttack();
                }else if(nameOfPoketmon=="파이리"){
                    ((Firiry) pf).eyeattack();
                    selectAttack();
                }else{
                    ((Turtle) pt).eyeattack();
                    selectAttack();
                }
                break;
            case 5:
                System.out.println("포켓몬 교체");
                changePoketmon();
            default:
                System.out.println("1~4까지의 변호만 입력하세요");
                selectAttack();
        }
    }

    public void changePoketmon() {
        System.out.println("포켓몬을 교체합니다");
        selectPoketmon();
    }
}
