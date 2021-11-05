package codesquad.rpggame.character;

public class Raccon extends Monster {

    // 공격을 하는 함수
    public int attack() {
        System.out.println("데미지는" + power + "입니다.");
        return power;
    }

    // 공격을 받는 함수
    public void attacked(int sum) {
        // 방어력이 받은 데미지보다 큰 경우
        if (defense >= sum) {
            hp -= 0;
        } else {
            hp = hp + defense - sum;
        }
    }
}
