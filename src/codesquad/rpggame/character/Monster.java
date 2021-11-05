package codesquad.rpggame.character;

// 몬스터는 기본적으로 힘, 방어력, 돈, 경험치라는 변수를 가지고 있다.
public class Monster extends Character {
    public int power;
    public int defense;
    public int money;
    public int experience;

    // 공격을 하는 메소드
    public int attack() {
        return power;
    }

    // 공격을 받는 메소드
    public void attacked(int sum) {
        if (defense >= sum) {
            hp -= 0;
        } else {
            hp = hp + defense - sum;
        }
    }
}
