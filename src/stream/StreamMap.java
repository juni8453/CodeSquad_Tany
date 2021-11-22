package stream;

import java.io.*;
import java.util.stream.*;

public class StreamMap {
    public static void main(String[] args) {
        File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
                new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
        };

        // 스트림 선언
        Stream<File> fileStream = Stream.of(fileArr);

        // map()으로 Stream<File>을 Stream<String>으로 변환 후 모든 파일의 이름 출력
        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);

        // 스트림은 최종 연산 이후 다시 사용할 수 없으므로 다시 생성해주기
        fileStream = Stream.of(fileArr);

        // 아까와 동일하게 Stream<File>을 Stream<String>으로 변환
        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1)          // 확장자가 없는 것은 제외
                .map(s -> s.substring(s.indexOf('.') + 1))  // 확장자만 추출
                .map(String::toUpperCase)                   // 모두 대문자로 반환
                .distinct()                                 // 중복 제거
                .forEach(System.out::println);

        System.out.println();
    }
}
