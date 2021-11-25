package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamComparator {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 180)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Student::getTotalScore)
                        .thenComparing(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}

// Comparable<T> 인터페이스 구현
// 기본적으로 sorted를 사용하려면 정렬하려는 객체에 Comparable 인터페이스가 구현되있어야 한다.

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    String getName() {return name;}
    int getBan() {return ban;}
    int getTotalScore() {return totalScore;}

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    @Override
    public int compareTo(Student s) {
        return 0;
    }
}
