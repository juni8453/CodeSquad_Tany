package codesquad.day3;

import java.util.Scanner;

public class MakingIndianName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("생년월일을 입력해 주세요.");

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        String firstName = changeYear(year);
        String middleName = changeMonth(month);
        String lastName = changeDay(day);
        String resultName = firstName + middleName + lastName;

        output(resultName);
    }

    public static String changeYear(int year) {
        String[] firstName = {"시끄러운", "푸른", "적색", "조용한", "웅크린", "백색", "지혜로운", "용감한", "날카로운", "욕심 많은"};

        try {
            return firstName[year % 10];
        }catch (Exception e) {
            System.out.println("입력이 잘못되었습니다.");
            throw e;
        }
    }

    public static String changeMonth(int month) {
        String[] middleName = {"늑대", "태양", "양", "매", "황소", "불꽃", "나무", "달빛", "말", "돼지", "하늘", "바람"};

        try {
            return middleName[month - 1];

        } catch(Exception e) {
            System.out.println("입력이 잘못되었습니다.");
            throw e;
        }

    }

    public static String changeDay(int day) {
        String[] lastName = {"와(과) 함께 춤을", "의 기상", "은(는) 그림자 속에",
                "의 화신", "의 노예", "의 마법사", "의 환생", "의 죽음",
                "아래에서", "를(을) 보라", "이(가) 노래하다", "의 그림자",
                "의 일격", "에게 쫓기는 남자", "의 행진", "의 왕", "의 유령",
                "을 죽인자", "는(은) 맨날 잠잔다", "처럼", "의 고향", "의 전사",
                "은(는) 나의 친구", "의 노래", "의 정령", "의 파수꾼", "의 악마",
                "와(과) 같은 사나이", "를(을) 쓰러뜨린 자", "의 혼", "은(는) 말이 없다"};

        try {
            return lastName[day - 1];
        } catch(Exception e) {
            System.out.println("입력이 잘못되었습니다.");
            throw e;
        }

    }

    public static void output(String resultName) {
        System.out.println("당신의 이름은"+" "+resultName+" "+"입니다.");
    }
}
