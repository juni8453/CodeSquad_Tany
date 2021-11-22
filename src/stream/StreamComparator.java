package stream;

import java.util.*;
import java.util.stream.*;

public class StreamComparator {
    public static void main(String[] args) {

        // 스트림의 선언
        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("김자바", 3, 180)
        );

        // 스트림 출력 (중간연산으로 정렬을 위해 Comparator의 메소드 사용)
        // 정렬요건을 추가하기 위해 thenComparing 사용 naturalOrder는 기본 비교 방법을 따르는 것
        studentStream.sorted(Comparator.comparing(Student::getBan)
               .thenComparing(Comparator.naturalOrder()))
               .forEach(System.out::println);
    }
}

// Comparable<T> 인터페이스 구현
class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    String getName() {
        return name;
    }

    int getBan() {
        return ban;
    }

    int getTotalScore() {
        return totalScore;
    }


    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}
