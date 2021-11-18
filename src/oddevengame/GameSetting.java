package oddevengame;

import java.util.Scanner;

public class GameSetting {

    int playerMoney = 100;
    int enemyMoney = 120;
    int stage = 1;

    public void startSetting() {
        Scanner sc = new Scanner(System.in);
        GameStart gameStart = new GameStart();

        System.out.println("플레이어 이름을 입력하세요.");
        String playerName = sc.next();
        Player player = new Player(playerName, playerMoney);
        Enemy enemy = new Enemy(enemyMoney);

        gameStart.startGame(player, enemy, stage);
    }
}
