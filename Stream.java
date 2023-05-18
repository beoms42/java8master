import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {

        List<List<String>> userList = new CSVReader().readCSV();

        //문제 1.1
        //위와 같은 데이터를 조회하여 각 취미를 선호하는 인원이 몇 명인지 계산하여라.

        /**
         * 예상답안
         * 축구 : 3명
         * 당구 : 3명
         * 등등
         */

        Map<String, Integer> collect = userList.stream()
                // 공백을 제거해주고
                .map(line -> line.get(1).replaceAll("\\s", ""))
                // flatMap으로 List<String>을 큰 String으로 만듬
                .flatMap(hobbies -> Arrays.stream(hobbies.split(":")))
                //hobby -> hobby : 맵의 key값, hobby는 value값, value값이 같으면 전값 + 새 밸류값
                .collect(Collectors.toMap(hobby -> hobby, hobby -> 1, (oldValue, newValue) -> newValue += oldValue));

        System.out.println("collect = " + collect);


        //문제 1.2
        //위와 같은 데이터를 조회하여 각 취미를 선호하는 정씨 성을 갖는 인원이 몇 명인지 계산하여라.


        //문제 1.3
        //위와 같은 데이터를 조회하여 소개 내용에 '좋아'가 몇번 등장하는지 계산하여라.
    }

}

