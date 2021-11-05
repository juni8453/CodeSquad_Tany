package codesquad.rpggame.character;

import java.util.Scanner;

public class Magician extends Hero {

    // 공격을 하는 함수
    @Override
    public int attack() {
        int sum = 0;

        // mp가 남아있는 경우
        if (mp >= 10) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 헬파이어 공격");
            System.out.println("2. 블리자드 공격");
            System.out.println("공격 번호를 입력하세요.");
            int number = sc.nextInt();

            if (number == 1) {
                sum += level * 10;
                sum += power * 15;
                sum += defense * 5;
                System.out.println("데미지는" + sum + "입니다.");
                mp -= 5;
                return sum;
            }

            else if (number == 2) {
                sum += level * 8;
                sum += power * 13;
                sum += defense * 10;
                System.out.println("데미지는" + sum + "입니다.");
                mp -= 5;
                return sum;
            }
            System.out.println("데미지는" + sum + "입니다.");
            return sum;
        }

        // mp가 존재하지 않는 경우
        else {
            System.out.println("MP가 남아있지 않습니다.");
            return sum;
        }
    }

    // 공격을 받는 함수
    @Override
    public void attacked(int sum) {
        // 방어력이 받은 데미지보다 큰 경우
        if (defense >= sum) {
         hp -= 0;
        } else {
            hp = hp + defense - sum;
        }
    }
}
