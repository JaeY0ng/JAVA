package CH33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C03제공되는함수형Interface {

	// 01
	public static Function<Integer, Integer> func1 = x -> x * x; // (x) -> {return x * x;}
	public static Function<Integer, Integer> func1_2 = x -> x + x; // (x) -> {return x + x;}
	public static Function<List<Integer>, Integer> func1_3 = x -> x.stream().reduce((a, b) -> a + b).orElse(0);
//		x.stream().reduce() // 컬렉션 stream().reduce() Optional<T> 반환
	public static Function<List<Object>,List<Integer>>func1_4 = x -> { 
		return x.stream()
				.filter(el -> el instanceof Integer)
				.map(el -> (Integer)el)
				.collect(Collectors.toUnmodifiableList());
				
	
	};
	
	
	//02
	public static Function<Integer, Integer> func2 = func1.andThen(func1_2);
	public static Function<Integer, Integer> func2_2 = func1_2.andThen(func1);
	
	
	//03
	public static BinaryOperator<Integer> func3 = (x,y) -> x + y;
	
	//04
	public static Function<Integer, Function<Integer, Integer>> func4 = x -> y -> x + y;
	
	
	
	public static void main(String[] args) {

		// 01
		System.out.println(func1.apply(10));
		System.out.println(func1_2.apply(5));
		System.out.println(func1_3.apply(Arrays.asList(1,2,3,4,5)));
		List<Object> li1 = new ArrayList();
		li1.add("홍길동");
		li1.add(10);
		li1.add(11);
		li1.add(12);
		li1.add(13);
		li1.add(14);
		li1.add(15);
		li1.add(16);
		li1.add(17);
		List<Integer> li2 = func1_4.apply(li1);
		
		System.out.println(li2);
		
		//02
		System.out.println(func2.apply(5));
		System.out.println(func2_2.apply(5));
		
		//03
		System.out.println(func3.apply(10, 20));
		
		System.out.println(func4.apply(5).apply(10) ); // 10 -> 5 + 10;
	}

	

}
