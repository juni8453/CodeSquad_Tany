package codesquad.rpggame.character;

// 캐릭터 중 영웅은 공통적으로 힘, 방어력, 돈, 경험치 변수를 가지고 있다.
public class Hero extends Character {
    public int power;
    public int defense;
    public int money = 0;
    public int experience = 0;

    public Hero() {

    }

    // 공격을 실행하는 메소드
    public int attack() {
        return power;
    }

    // 공격을 받는 메소드
    public void attacked(int sum) {

        //방어력이 받은 데미지보다 큰 경우
        if (defense >= sum) {
            hp -= 0;
            // 방어력이 받은 데미지보다 작은 경우
        } else {
            hp = hp + defense - sum;
        }
    }
}
