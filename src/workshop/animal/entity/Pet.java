package workshop.animal.entity;

public interface Pet {
	//추상 메서드는 body를 가질 수 없다.
	public abstract void setName(String name);
	String getName();
	void play();
}
