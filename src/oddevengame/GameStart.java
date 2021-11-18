package oddevengame;

import java.util.Random;
import java.util.Scanner;

public class GameStart {

   public void startGame(Player player, Enemy enemy, int stage) {

       System.out.println("게임을 시작합니다.");
       System.out.println("플레이어의 이름은 " + player.getName() + "입니다.");
       System.out.println("플레이어의 현재 소지금은 " + player.getMoney() + "입니다.");
       System.out.println("상대의 현재 소지금은 " + enemy.getMoney() + "입니다.");
       System.out.println("===================================================");
       System.out.println("현재 스테이지 : " + stage);

       // 상대가 1 ~ 20의 임의의 숫자를 뽑는 메소드 실행
       int enemyPick = PickRandomCount();

       // 홀 짝 고르는 메소드 실행
       checkOddEven(enemyPick);

    }

    public int PickRandomCount() {
        Random random = new Random();
        int enemyPick = random.nextInt(21);
        return enemyPick;
    }

    public void checkOddEven(int enemyPick) {
        Scanner sc = new Scanner(System.in);
        System.out.println("홀인지 짝인지 골라주세요. 홀[1] 짝[2]");
        int checkNumber = sc.nextInt();

        // 배팅 금액 확인
        checkBettingMoney();

    }

    public void checkBettingMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("배팅 금액을 입력하세요.");
        int checkMoney = sc.nextInt();

        // 게임 결과 확인
        gameResult();

    }

    public void gameResult() {

    }
}
