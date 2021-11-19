package oddevengame;

public class Enemy {

    private int enemyMoney;
    private int enemyCount;

    public Enemy(int enemyMoney, int enemyCount) {
        this.enemyMoney = enemyMoney;
        this.enemyCount = enemyCount;
    }

    public int getEnemyMoney() {
        return enemyMoney;
    }

    public void setEnemyMoney(int enemyMoney) {
        this.enemyMoney = enemyMoney;
    }

    public int getEnemyCount() {
        return enemyCount;
    }

    public void setEnemyCount() {
        this.enemyCount = enemyCount + 1;
    }
}
