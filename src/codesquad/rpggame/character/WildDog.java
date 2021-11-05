package codesquad.rpggame.character;

public class WildDog extends Monster {

    // 공격을 하는 함수
    @Override
    public int attack() {
        System.out.println("데미지는" + power +"입니다.");
        return power;
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
