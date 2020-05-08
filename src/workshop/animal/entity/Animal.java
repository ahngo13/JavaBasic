package workshop.animal.entity;

/*
	�߻�Ŭ������ �߻�޼��带 �ݵ�� �ϳ� ������ �ұ��?
	-> ���� ���� �ִ�.
	
	Animal ani = new Animal(); (x) ������ ��ü�� ������ �� ����.
	�ڽ�Ŭ������ ���ؼ� ��ü������ �����ϴ�.
	Animal fish = new Fish(); (o)
*/

public abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	// �߻� �޼���� �ٵ� ������ �ȵ�
	public abstract void eat();
	
	public void walk() {
		System.out.println("������" + this.legs + "���� �ٸ��� �ȴ´�!");
	}
}
