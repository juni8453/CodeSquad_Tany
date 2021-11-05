package codesquad.rpggame.main;

import java.util.Arrays;
import java.util.Scanner;
import codesquad.rpggame.character.*;
import codesquad.rpggame.map.*;

// 게임의 진행을 담당하는 클래스
public class GameMain {

    public static void main(String args[]) {

        // 기본적인 변수 설정
        Scanner sc = new Scanner(System.in);
        Hero hero = new Hero();

        // 게임의 기본적인 셋팅을 하는 부분
        System.out.println("-----RPG Game-----");
        System.out.println("1. 전사");
        System.out.println("2. 궁수");
        System.out.println("3. 마법사");
        System.out.println("직업의 번호를 입력하세요 :");
        int number = sc.nextInt();

        // 전사가 선택된 경우
        if (number == 1) {
            System.out.println("전사를 선택하셨습니다.");
            hero = new Warrior();
            hero.power = 15;
            hero.defense = 25;
            hero.level = 1;
            hero.hp = 80;
            hero.mp = 0;
        }

        // 궁수가 선택된 경우
        if (number == 2) {
            System.out.println("궁수를 선택하셨습니다.");
            hero = new Archer();
            hero.power = 20;
            hero.defense = 5;
            hero.level = 1;
            hero.hp = 50;
            hero.mp = 0;
        }

        // 마법사가 선택된 경우
        if (number == 3) {
            System.out.println("마법사를 선택하셨습니다.");
            hero = new Magician();
            hero.power = 18;
            hero.defense = 10;
            hero.level = 1;
            hero.hp = 60;
            hero.mp = 60;
        }

        System.out.println("영웅의 이름을 입력하세요 :");
        hero.name = sc.next();
        System.out.println("이름이 입력되었습니다.");
        System.out.println("게임에 입장하셨습니다.");

        // 게임 start
        while (true) {
            // 영웅의 능력치 보여주기
            System.out.println("----------");
            System.out.println("현재 당신의 이름 :" + hero.name);
            System.out.println("현재 당신의 레벨 :" + hero.level);
            System.out.println("현재 당신의 힘: " + hero.power);
            System.out.println("현재 당신의 방어력: " + hero.defense);
            System.out.println("현재 당신의 HP: " + hero.hp);
            System.out.println("현재 당신의 MP: " + hero.mp);
            System.out.println("현재 당신의 돈: " + hero.money);
            System.out.println("현재 당신의 경험치: " + hero.experience);
            System.out.println("----------");

            // 이동 경로 선택
            System.out.println("1. 사냥터");
            System.out.println("2. 무기 상점");
            System.out.println("3. 포션 상점");
            System.out.print("입장할 장소를 입력하세요.");
            number = sc.nextInt();

            // 사냥터에 입장했다면 ?
            if (number == 1) {
                Monster monster = new Monster();
                System.out.println("사냥터에 입장하셨습니다.");
                System.out.println("1. 너구리");
                System.out.println("2. 살쾡이");
                System.out.println("3. 들개");
                System.out.println("4. 멧돼지");
                System.out.println("전투할 상대를 입력하세요.");
                number = sc.nextInt();

                // 너구리와 전투하는 경우
                if (number == 1) {
                    monster = new Raccon();
                    monster.name = "너구리";
                    monster.hp = 100;
                    monster.mp = 0;
                    monster.level = 1;
                    monster.power = 20;
                    monster.defense = 5;
                    monster.money = 10;
                    monster.experience = 10;
                }

                if (number == 2) {
                    monster = new WildCat();
                    monster.name = "살쾡이";
                    monster.hp = 2000;
                    monster.mp = 0;
                    monster.level = 5;
                    monster.power = 100;
                    monster.defense = 20;
                    monster.money = 30;
                    monster.experience = 50;
                }

                if (number == 3) {
                    monster = new WildDog();
                    monster.name = "들개";
                    monster.hp = 3000;
                    monster.mp = 0;
                    monster.level = 15;
                    monster.power = 300;
                    monster.defense = 30;
                    monster.money = 50;
                    monster.experience = 100;
                }

                if (number == 4) {
                    monster = new WildPig();
                    monster.name = "멧돼지";
                    monster.hp = 10000;
                    monster.mp = 0;
                    monster.level = 30;
                    monster.power = 1000;
                    monster.defense = 80;
                    monster.money = 200;
                    monster.experience = 300;
                }

                // 전투 시작
                while (true) {
                    System.out.println("영웅의 공격입니다.");
                    monster.attacked(hero.attack());

                    // 몬스터의 체력이 0보다 작거나 같은 경우
                    if (monster.hp <= 0) {
                        System.out.println("몬스터가 죽었습니다.");
                        hero.experience += monster.experience;
                        hero.money += monster.money;
                        break;
                    }

                    System.out.println("몬스터의 공격입니다.");
                    hero.attacked(monster.attack());

                    // 영웅의 체력이 0보다 작거나 같은 경우
                    if (hero.hp <= 0) {
                        System.out.println("영웅이 죽었습니다.");

                        // 영웅의 체력을 1로 만들고 부활시키기
                        hero.hp = 1;
                        System.out.println("영웅의 체력" + hero.hp + "으로 부활했습니다.");
                        break;
                    }
                }
            }

            // 무기 상점에 입장했다면 ?
            else if (number == 2) {
                WeaponStroe weaponStroe = new WeaponStroe();
                System.out.println("무기 상점에 입장하셨습니다.");
                System.out.println("1. 공통 무기 100원");
                System.out.println("2. 공통 방패 100원");
                System.out.print("원하시는 물건을 입력하세요.");
                number = sc.nextInt();
                int temp = hero.money;

                // 돈이 부족하지 않은 경우에만 구입
                if ((hero.money = weaponStroe.show(hero.money, number)) != -1) {
                    System.out.println("구입이 완료되었습니다.");
                    if (number == 1) {
                        hero.power += 5;
                    }

                    if (number == 2) {
                        hero.defense += 5;
                    }
                }

                // 돈이 부족한 경우
                else {
                    System.out.println("돈이 부족합니다.");
                    hero.money = temp;
                }
            }

            // 포션 상점에 입장했다면 ?
            else if (number == 3) {
                PotionStore potionStore = new PotionStore();
                System.out.println("포션 상점에 입장하셨습니다.");
                System.out.println("1. 힘 증강 포션 100원");
                System.out.println("2. 방어력 증강 포션 100원");
                System.out.println("3. 경험치 증강 포션 300원");
                System.out.println("4. HP 회복 포션 10원");
                System.out.println("5. MP 회복 포션 10원");
                System.out.print("원하시는 물건을 입력하세요.");
                number = sc.nextInt();
                int temp = hero.money;

                if ((hero.money = potionStore.show(hero.money, number)) != -1) {
                    System.out.println("구입이 완료되었습니다.");

                    if (number == 1) {
                        hero.power += 3;
                    }

                    if (number == 2) {
                        hero.defense += 3;
                    }

                    if (number == 3) {
                        hero.experience += 50;
                    }

                    if (number == 4) {
                        hero.hp +=  50;
                    }

                    if (number == 5) {
                        hero.mp += 50;
                    }
                }

                else {
                    System.out.println("돈이 부족합니다.");
                    hero.money = temp;
                }

                if (hero.experience >= hero.level) {
                    hero.level += 1;
                    System.out.println("영웅의 레벨이" + hero.level + "이 되었습니다.");
                    hero.money += hero.level * 50;
                    System.out.println("레벨업 기념으로 돈이" + hero.level * 50 + "원 증가했습니다.");
                    hero.experience = 0;
                }
            }
        }
    }
}
