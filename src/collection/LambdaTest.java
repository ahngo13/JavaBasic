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
		
		//���ٽ� ����
		System.out.println("���ٽ�");
		//Comsumer�� ���� �߻�޼��带 void accept(T t)
		list.forEach(val2 -> System.out.println("val2:" + val2));
		
		//method Reference
		list.forEach(System.out::println);
	}

}
