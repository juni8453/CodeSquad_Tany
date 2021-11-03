package codesquad.day3;

import java.util.Scanner;

class CocoaMember {

    private String name;

    CocoaMember(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    static CocoaMember[] makeSquad1() {
        CocoaMember[] squad1 = {
                new CocoaMember("Donggi"),
                new CocoaMember("K"),
                new CocoaMember("Tany"),
                new CocoaMember("Taksu"),
                new CocoaMember("Hoo"),
                new CocoaMember("Jerry"),
                new CocoaMember("Nohri"),
                new CocoaMember("MK"),
                new CocoaMember("ttasjwi"),
                new CocoaMember("PO"),
                new CocoaMember("Mandoo")
        };

        return squad1;
    }
}

class RandomGacha {

    private int coin = 0;
    CocoaMember[] members;

    // RandomGacha 클래스 생성자
    RandomGacha() {
        this.members = CocoaMember.makeSquad1();
        shuffleMember();
    }

    int getUserCoin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("insert coin >>>>> ");
        int coins = sc.nextInt();
        sc.close();

        return coins;
    }

    void insertCoin(int coins) {
        this.coin += coins;
    }

    void shuffleMember() {
        CocoaMember temp = null;
        for (int i = 0; i < members.length; i++) {
            int j = (int) (Math.random() * members.length);
            temp = members[i];
            members[i] = members[j];
            members[j] = temp;
        }
    }

    void draw() {
        String result = "";

        int i = 0;
        while (coin > 0 && i < members.length) {
            result += (members[i].getName() + ", ");
            i++;
            coin--;
        }

        System.out.println(result);
        System.out.println("남은 동전을 반환합니다...");
        while (coin > 0) {
            System.out.print("\uD83D\uDFE1 ");
            coin--;
        }
        System.out.println();
        System.out.println("완료 !");
    }
}

class RandomGachaTest {

    public static void main(String[] args) {
        RandomGacha gacha = new RandomGacha();

        int coins = gacha.getUserCoin();
        gacha.insertCoin(coins);
        gacha.draw();
    }
}
