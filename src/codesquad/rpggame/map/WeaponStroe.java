package codesquad.rpggame.map;

public class WeaponStroe extends Map {
    int commonWeapon = 100;
    int commomShield = 100;

    public int show(int money, int number) {
        name = "무기 상점";
        System.out.println(name + "에서 물건을 구매하는 중 입니다.");

        if (number == 1) {
            // 무기보다 돈이 더 많을 때,
            if (commonWeapon <= money) {
                return money - commonWeapon;
            }
        }

        if (number == 2) {
            if (commomShield <= money) {
                return money - commomShield;
            }
        }

        // 돈이 부족할 때,
        return -1;
    }
}
