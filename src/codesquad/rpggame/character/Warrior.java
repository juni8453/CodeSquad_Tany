package codesquad.rpggame.character;

import java.util.Scanner;

public class Warrior extends Hero {

    // 공격을 하는 함수
    @Override
    public int attack() {
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("1. 파워 스트라이크");
        System.out.println("2. 삼단 베기");
        System.out.println("공격 번호를 입력하세요 :");
        int number = sc.nextInt();

        // 파워 스트라이크
        if (number == 1) {
            sum += level * 10;
            sum += power * 30;
            System.out.println("데미지는" + sum + "입니다.");
            return sum;
        }

        // 삼단 베기
        else if (number == 2) {
            sum += level * 20;
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

