package workshop.animal.entity;

public class Spider extends Animal{
	
	public Spider() {
		super(8);
	}
	
	@Override
	public void eat() {
		System.out.println("�Ź̴� ������ �Դ´�.");
	}
	
	/*
	 * Implicit super constructor Animal() is undefined for default constructor. Must define an explicit constructor
	 * Animal�� �⺻ �����ڰ� ������ �⺻�����ڸ� ���󰡴µ� ������ ������� ������ �� �����Ƿ� ���� �ۼ��ؾ� ��.
	 * The type Spider must implement the inherited abstract method Animal.eat()
	 * �߻� �޼��带 ��������� �Ѵ�.
	 */
}
