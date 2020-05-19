package collection;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		
		for (String val : list) {
			System.out.println("val1:" + val);
		}
		
		//람다식 적용
		System.out.println("람다식");
		//Comsumer가 가진 추상메서드를 void accept(T t)
		list.forEach(val2 -> System.out.println("val2:" + val2));
		
		//method Reference
		list.forEach(System.out::println);
	}

}
