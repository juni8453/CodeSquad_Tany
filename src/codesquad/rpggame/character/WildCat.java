package codesquad.rpggame.character;

public class WildCat extends Monster {

    // 공격하는 함수
    @Override
    public int attack() {
        System.out.println("데미지는" + power + "입니다.");
        return power;

    }

    // 공격받는 함수
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
