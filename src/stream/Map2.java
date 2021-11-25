package stream;

import java.io.File;
import java.util.stream.Stream;

public class Map2 {
    public static void main(String[] args) {
        File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
                new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
        };

        Stream<File> fileStream = Stream.of(fileArr);

        // map() 중개 연산을 이용해서 Stream<File> -> Stream<String>으로 변환
        Stream<String> filenameString = fileStream.map(f -> f.getName());
        filenameString.forEach(System.out::println);

        // 위의 코드를 여러 중개 연산 조건들을 걸고 최종 연산 forEach 까지 이어서 쓰기
        fileStream = Stream.of(fileArr);
        fileStream.map(f -> f.getName())
                .filter(f -> f.indexOf('.') != -1)
                .map(f -> f.substring(f.indexOf('.') + 1))
                .map(f -> f.toUpperCase())
                .distinct()
                .forEach(System.out::println);

        System.out.println();
    }
}
