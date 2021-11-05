package codesquad.rpggame.map;

public class PotionStore extends Map {
    int powerPotion = 100;;
    int defensePotion = 100;
    int experiencePotion = 300;
    int hpPotion = 10;
    int mpPotion = 10;

    public int show(int money, int number) {
        name = "포션 상점";
        System.out.println(name + "에서 물건을 구매하는 중 입니다.");
        if (number == 1) {
            // 힘 포션 가격보다 돈이 더 많을 떄,
            if (powerPotion <= money) {
                return money - powerPotion;
            }
        }

        if (number == 2) {
            if (defensePotion <= money) {
                return money - defensePotion;
            }
        }

        if (number == 3) {
            if (experiencePotion <= money) {
                return money - experiencePotion;
            }
        }

        if (number == 4) {
            if (hpPotion <= money) {
                return money - hpPotion;
            }
        }

        if (number == 5) {
            if (mpPotion <= money) {
                return money - mpPotion;
            }
        }

        // 돈이 부족할 때,
        return -1;

    }
}
