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
		personManager.printTitle("                    @@@ �ι� ���� ��ȸ �ý��� @@@");
		personManager.showPerson(persons);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("==>1. ������ �Է��ϼ���");
		char gender = scan.next().charAt(0);
		System.out.println("���� : '"+ gender +"'(��)�� "+
		        personManager.findbyGender(persons, gender)+"�� �Դϴ�.");
		
		personManager.printTitleLine();
		
		System.out.println("==>2. �̸��� �Է��ϼ���");
		personManager.showPerson(persons, scan.next());
	}
	
	public void fillPersons(List<PersonEntity> persons)
	{
		persons.add(new PersonEntity("�̼�ȣ","7212121028102", "��õ ��籸", "032-392-2932"));
		persons.add(new PersonEntity("���ϴ�","7302132363217", "���� ������", "02-362-1932"));
		persons.add(new PersonEntity("�ڿ���","7503111233201", "���� ���ϱ�", "02-887-1542"));
		persons.add(new PersonEntity("���μ�","7312041038988", "���� ������", "032-384-2223"));
		persons.add(new PersonEntity("ȫ����","7606221021341", "���� ��õ��", "02-158-7333"));
		persons.add(new PersonEntity("�̹̼�","7502142021321", "���� ������", "02-323-1934"));
		persons.add(new PersonEntity("�ڼ���","7402061023101", "���� ���α�", "02-308-0932"));
		persons.add(new PersonEntity("������","7103282025101", "���� ����", "02-452-0939"));
		persons.add(new PersonEntity("Ȳ����","7806231031101", "��õ �߱�", "032-327-2202"));
		persons.add(new PersonEntity("��ö��","7601211025101", "��õ ��籸", "032-122-7832"));
 	}
	
	public void showPerson(List<PersonEntity> persons)
	{		
		printTitleLine();
		for(PersonEntity person : persons)
		{
			System.out.println("[�̸�] " + person.getName() +
					"\t[����] "+person.getGender()+
					"\t[��ȭ��ȣ] "+person.getPhone());
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
				System.out.println("-- �̸� : '"+name+"'(��)�� ã�� ����Դϴ�. --");
				printItemLine();
				System.out.println("[�̸�] " + person.getName() +"\n[����] "+person.getGender()+
								   "\n[��ȭ��ȣ] "+person.getPhone()+"\n[�ּ�] "+person.getAddress());
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
