package codesquad.rpggame.character;

import java.util.Scanner;

// 궁수 클래스
public class Archer extends Hero {

    // 공격을 하는 메소드
    @Override
    public int attack() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 화살 공격");
        System.out.println("2. 연속 화살 공격");
        System.out.println("공격 번호를 입력하세요 :");
        int number = sc.nextInt();
        int sum = 0; // 전체 공격력을 의미하는 변수

        // 화살 공격
        if (number == 1) {
            sum += level * 15;
            sum += power *15;
            sum += defense * 15;
            System.out.println("데미지는" + sum + "입니다.");
            return sum;
        }

        // 연속 화살 공격
        else if (number == 2) {
            sum += level * 15;
            sum += power * 15;
            sum += defense * 15;
            System.out.println("데미지는" + sum + "입니다.");
            return sum;
        }
        System.out.println("데미지는" + sum + "입니다.");
        return sum;
    }

    // 공격을 받는 함수
    @Override
    public void attacked(int sum) {
        if (defense >= sum) {
            hp -= 0;
        } else {
            hp = hp + defense - sum;
        }
    }
}
