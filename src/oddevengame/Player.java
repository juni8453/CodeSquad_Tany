package oddevengame;

public class Player {

    private String playerName;
    private int playerMoney;

    public Player(String playerName, int playerMoney) {
        this.playerName = playerName;
        this.playerMoney = playerMoney;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerMoney() {
        return playerMoney;
    }

    public void setPlayerMoney(int playerMoney) {
        this.playerMoney = playerMoney;
    }
}
