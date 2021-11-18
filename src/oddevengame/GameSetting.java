package oddevengame;

import java.util.Scanner;

public class GameSetting {
    final int PLAYER_START_MONEY = 100;
    final int ENEMY_START_MONEY = 120;
    int stage = 1;

    public void startSetting() {
        Scanner sc = new Scanner(System.in);
        GameStart gameStart = new GameStart();
        Player player = new Player();
        Enemy enemy = new Enemy();

        System.out.println("플레이어 이름을 입력하세요.");
        String playerName = sc.next();
        player.setName(playerName);
        player.setMoney(PLAYER_START_MONEY);
        enemy.setMoney(ENEMY_START_MONEY);

        gameStart.startGame(player, enemy, stage);
    }
}
