package oddevengame;

import java.util.Random;
import java.util.Scanner;

public class GameStart {

   public void startGame(Player player, Enemy enemy, int stage) {

       System.out.println("게임을 시작합니다.");
       System.out.println("플레이어의 이름은 " + player.getPlayerName() + "입니다.");
       System.out.println("플레이어의 현재 소지금은 " + player.getPlayerMoney() + "입니다.");
       System.out.println("상대의 현재 소지금은 " + enemy.getEnemyMoney() + "입니다.");
       System.out.println("===================================================");
       System.out.println("현재 스테이지 : " + stage);

       int enemyPickCard = groupOfRandomCards();
       System.out.println("Test 용 상대의 숫자 확인 : " + enemyPickCard);
       checkBetting(player, enemy, enemyPickCard, stage);
    }

    public int groupOfRandomCards() {
        Random randomCards = new Random();
        return randomCards.nextInt(21) + 1;
    }

    // 객체를 넘기는 것 보다 player.get ~ , enemy.get 을 넘겨도 된다면 그렇게 바꾸기
    public void checkBetting(Player player, Enemy enemy, int enemyPickCard, int stage) {
        Scanner sc = new Scanner(System.in);
        int playerMoney = player.getPlayerMoney();
        int enemyMoney = enemy.getEnemyMoney();
        int limitBettingMoney = Math.min(playerMoney, enemyMoney);

        System.out.println("홀짝을 골라주세요. 홀[1] 짝[2]");
        int checkOddEven = sc.nextInt();

        while (checkOddEven != 1 && checkOddEven != 2) {
            System.out.println("홀[1] 또는 짝[2]을 골라주세요.");
            checkOddEven = sc.nextInt();
        }

        System.out.println("최대 배팅 가능한 금액은 " + limitBettingMoney + "입니다.");
        System.out.println("배팅할 금액을 입력해주세요.");
        int bettingMoney = sc.nextInt();

        while (bettingMoney < 0) {
            System.out.println("배팅 금액을 확인하고 다시 입력해주세요.");
            bettingMoney = sc.nextInt();
        }

        if (bettingMoney > limitBettingMoney) {
            System.out.println("최대 금액으로 배팅합니다.");
            bettingMoney = limitBettingMoney;
        }

        gameResult(checkOddEven, enemyPickCard, bettingMoney, stage, player, enemy);
    }

    public void gameResult(int checkOddEven, int enemyPickCard, int bettingMoney, int stage, Player player, Enemy enemy) {

        // 플레이어가 홀수를 고르고 상대방이 가지고 있는 패가 홀수가 맞을 경우,
        if (checkOddEven == 1 && enemyPickCard % 2 != 0) {
            player.setPlayerMoney(player.getPlayerMoney() + bettingMoney);
            enemy.setEnemyMoney(enemy.getEnemyMoney() - bettingMoney);
            System.out.println("플레이어의 승리! / 상대방의 패배!");
            System.out.println("현재 플레이어의 돈 : " + player.getPlayerMoney());
            System.out.println("현재 상대방의 돈 : " + enemy.getEnemyMoney());

            // 상대방이 패배했음에도 돈이 남아 있을 경우 게임 재개
            if (enemy.getEnemyMoney() != 0) {
                stage += 1;
                startGame(player, enemy, stage);
            }

            if (enemy.getEnemyMoney() == 0) {
                System.out.println("상대방의 소지금이 0원이므로 게임을 종료합니다.");
            }

            // 홀수를 골랐지만 상대방이 짝수라면,
            if (enemyPickCard % 2 == 0) {
                player.setPlayerMoney(player.getPlayerMoney() - bettingMoney);
                enemy.setEnemyMoney(enemy.getEnemyMoney() + bettingMoney);
                System.out.println("상대방의 승리! / 플레이어의 패배!");
                System.out.println("현재 플레이어의 돈 : " + player.getPlayerMoney());
                System.out.println("현재 상대방의 돈 : " + enemy.getEnemyMoney());

                // 플레이어가 패배했음에도 돈이 남아 있을 경우 게임 재개
                if (player.getPlayerMoney() != 0) {
                    stage += 1;
                    startGame(player, enemy, stage);
                }

                if (player.getPlayerMoney() == 0) {
                    System.out.println("플레이어의 소지금이 0원이므로 게임을 종료합니다.");
                }
            }
        }

        // 플레이어가 짝수를 고르고 상대방이 가지고 있는 패가 짝수가 맞을 경우,
        if (checkOddEven == 2 && enemyPickCard % 2 == 0) {
            player.setPlayerMoney(player.getPlayerMoney() + bettingMoney);
            enemy.setEnemyMoney(enemy.getEnemyMoney() - bettingMoney);
            System.out.println("플레이어의 승리! / 상대방의 패배!");
            System.out.println("현재 플레이어의 돈 : " + player.getPlayerMoney());
            System.out.println("현재 상대방의 돈 : " + enemy.getEnemyMoney());

            // 짝수를 골랐지만 상대방이 홀수라면,
            if (enemyPickCard % 2 != 0) {
                player.setPlayerMoney(player.getPlayerMoney() - bettingMoney);
                enemy.setEnemyMoney(enemy.getEnemyMoney() + bettingMoney);
                System.out.println("상대방의 승리! / 플레이어의 패배!");
                System.out.println("현재 플레이어의 돈 : " + player.getPlayerMoney());
                System.out.println("현재 상대방의 돈 : " + enemy.getEnemyMoney());

                if (player.getPlayerMoney() == 0) {
                    System.out.println("플레이어의 소지금이 0원이므로 게임을 종료합니다.");
                }
            }
        }
    }
}
