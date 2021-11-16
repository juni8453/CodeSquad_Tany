package codesquad.day6.accountbook;

public class ShowScript {

    public void continueMessage() {
        System.out.println("계속해서 작성하시겠습니까? 작성[1] / 종료[2]");
    }

    public void startMessage() {
        System.out.println("가계부를 실행합니다.");
    }

    public void endMessage() {
        System.out.println("가계부를 종료합니다.");
    }

    public void memoMessage() {
        System.out.println("간단한 메모를 기입해주세요.");
    }

    public void dateMessage() {
        System.out.println("날짜를 기입해주세요.");
    }

    public void outcomeMessage() {
        System.out.println("지출을 기입해주세요.");
    }

    public void nameMessage() {
        System.out.println("이름을 입력하세요.");
    }

    public void passwordMessage() {
        System.out.println("비밀번호를 입력하세요.");
    }
}
