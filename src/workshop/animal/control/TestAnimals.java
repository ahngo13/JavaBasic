package workshop.animal.control;

import workshop.animal.entity.Animal;
import workshop.animal.entity.Cat;
import workshop.animal.entity.Fish;
import workshop.animal.entity.Pet;

public class TestAnimals {

	public TestAnimals() {
		
	}

	public static void main(String[] args) {
		//CTRL + SPACE : code assist
		//CTRL + SHIFT + O : auto import
		//CTRL + shift + f : code format

		//Cat 객체를 생성하는 방법 3가지
		Cat cat1 = new Cat();
		cat1.setName("고양이");
		System.out.println(cat1.getName());
		cat1.play();
		cat1.eat();
		cat1.walk();
		
		Pet cat2 = new Cat();
		cat2.setName("고양이2");
		System.out.println(cat2.getName());
		cat2.play();
		
		Animal cat3 = new Cat();
		cat3.eat();
		cat3.walk();
		
		TestAnimals ani = new TestAnimals();
		ani.method(cat1);
		ani.method(new Fish());
//				ani.method(new Spider());
	}
	
	//polymorphic argument
	public void method(Pet pet){
		System.out.println("...");
	}

}
