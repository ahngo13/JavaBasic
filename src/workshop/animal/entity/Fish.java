package workshop.animal.entity;

public class Fish extends Animal implements Pet {
	private String name;
	
	public Fish(String name) {
		super(0);
		this.name = name;
	}
	
	public Fish() {
		//������ ���� ȣ��
		this("");
	}
	
	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void play() {
		System.out.println("������ ���ġ�� ��ƿ�");
	}

	@Override
	public void eat() {
		System.out.println("������ ������ �Ծ��");
	}
	
	//���� ���� ����� �ٸ��� ������ �������̵� ���ش�.
	//������ �ȴ� ����� ����.
	@Override
	public void walk() {
		super.walk();
	}

}
