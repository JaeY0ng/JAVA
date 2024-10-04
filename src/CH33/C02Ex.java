package CH33;

import java.util.Arrays;
import java.util.Comparator;

@FunctionalInterface
interface functional {
    int execute(int... args);
}

class Calc {
    functional sum;
    functional sub;
    functional mul;
    functional div;

    Calc() {
        // sum: 모든 인자를 더함
        sum = (args) -> Arrays.stream(args).sum();

//        sub = (args) -> Arrays.stream(args)
//                .sorted()    // 작은 수부터 큰 수로 정렬 후 감산 -> 문제 설명 반영(정렬 후 차례로 감산)
//                .reduce((a, b) -> a - b) // 
//                .orElse(0);  // 값이 없을 때 0 반환
        
        // sub: 인자들을 큰 수에서 작은 수로 정렬 후, 차례로 감산
        sub = (args) -> 
         		Arrays.stream(args)
        		   .boxed()  // int를 Integer로 변환
                   .sorted(Comparator.reverseOrder())  // 내림차순 정렬
                   .reduce((a, b) -> a - b)  // 누적 감산
                   .orElse(0);  // 값이 없을 경우 0 반환
         		   
        // mul: 모든 인자를 곱함
        mul = (args) -> Arrays.stream(args)
                .reduce((a, b) -> a * b)
                .orElse(0);  // 값이 없을 때 0 반환

        // div: 차례대로 나눗셈 진행
        div = (args) -> Arrays.stream(args)
        		.boxed()  // int를 Integer로 변환
                .sorted(Comparator.reverseOrder())
                .reduce((a, b) -> a / b)
                .orElse(0);  // 값이 없을 때 0 반환
    }
}

public class C02Ex {

    public static void main(String[] args) throws NullPointerException {
    	
        Calc calc = new Calc();
        System.out.println("합 : " + calc.sum.execute(10, 20, 30, 40, 50, 60));  // 210
        System.out.println("차 : " + calc.sub.execute(1,4,2,5));  // 5-4-2-1 -> -2
        System.out.println("곱 : " + calc.mul.execute(2, 3, 4));  // 24
        System.out.println("나눗셈 : " + calc.div.execute(100, 2, 5));  // 100 / 2 / 5 = 10
    }
}
