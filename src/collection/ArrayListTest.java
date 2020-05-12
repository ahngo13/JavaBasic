package collection;

import java.util.ArrayList;
import java.util.List;

import jdbc.user.vo.UserVO;

public class ArrayListTest {

	public static void main(String[] args) {
		//java1.4
		List list = new ArrayList();
		list.add(new String("aaa"));
		list.add(new Integer(4));
		list.add(new Character('d'));
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//			String value = (String)list.get(i);
//		}
		
		//java5.0 - Generics
		List<String> list2 = new ArrayList<>();
		//compile 오류 발생
//		list2.add(10);
		list2.add("aaa");
		list2.add("bbb");
		//Enhanced For loop
		for(String val : list2) {
			System.out.println(val);
		}
		
		List<UserVO> users = new ArrayList<>();
		users.add(new UserVO("test","테스트",'여',"서초구"));
		
	}
}
