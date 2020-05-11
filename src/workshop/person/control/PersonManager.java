package workshop.person.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import workshop.person.entity.PersonEntity;

public class PersonManager {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonManager personManager = new PersonManager();
		List<PersonEntity> persons = new ArrayList<>();
		personManager.fillPersons(persons);
		personManager.printTitle("                    @@@ 인물 정보 조회 시스템 @@@");
		personManager.showPerson(persons);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("==>1. 성별을 입력하세요");
		char gender = scan.next().charAt(0);
		System.out.println("성별 : '"+ gender +"'(은)는 "+
		        personManager.findbyGender(persons, gender)+"명 입니다.");
		
		personManager.printTitleLine();
		
		System.out.println("==>2. 이름을 입력하세요");
		personManager.showPerson(persons, scan.next());
	}
	
	public void fillPersons(List<PersonEntity> persons)
	{
		persons.add(new PersonEntity("이성호","7212121028102", "인천 계양구", "032-392-2932"));
		persons.add(new PersonEntity("김하늘","7302132363217", "서울 강동구", "02-362-1932"));
		persons.add(new PersonEntity("박영수","7503111233201", "서울 성북구", "02-887-1542"));
		persons.add(new PersonEntity("나인수","7312041038988", "대전 유성구", "032-384-2223"));
		persons.add(new PersonEntity("홍정수","7606221021341", "서울 양천구", "02-158-7333"));
		persons.add(new PersonEntity("이미숙","7502142021321", "서울 강서구", "02-323-1934"));
		persons.add(new PersonEntity("박성구","7402061023101", "서울 종로구", "02-308-0932"));
		persons.add(new PersonEntity("유성미","7103282025101", "서울 은평구", "02-452-0939"));
		persons.add(new PersonEntity("황재현","7806231031101", "인천 중구", "032-327-2202"));
		persons.add(new PersonEntity("최철수","7601211025101", "인천 계양구", "032-122-7832"));
 	}
	
	public void showPerson(List<PersonEntity> persons)
	{		
		printTitleLine();
		for(PersonEntity person : persons)
		{
			System.out.println("[이름] " + person.getName() +
					"\t[성별] "+person.getGender()+
					"\t[전화번호] "+person.getPhone());
			printItemLine();
		}
	}
	
	public int findbyGender(List<PersonEntity> persons, char gender)
	{
		int gendercount = 0;
		for(PersonEntity person : persons)
		{
			if(person.getGender() == gender)
			{
				gendercount++;
			}
		}
		return gendercount;
	}
	
	public void showPerson(List<PersonEntity> persons, String name)
	{
		for(PersonEntity person : persons)
		{
			if(person.getName().equals(name))
			{			
				System.out.println("-- 이름 : '"+name+"'(으)로 찾기 결과입니다. --");
				printItemLine();
				System.out.println("[이름] " + person.getName() +"\n[성별] "+person.getGender()+
								   "\n[전화번호] "+person.getPhone()+"\n[주소] "+person.getAddress());
			}
		}		
	}
	
	public void printTitle(String title)
	{
		System.out.println("\n"+title);
	}
	
	public void printTitleLine()
	{
		System.out.println("============================================================");
	}
	
	public void printItemLine()
	{
		System.out.println("------------------------------------------------------------");
	}
}
