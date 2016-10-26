package designPatterns.BASIC.FactoryMethod;

public class Dog extends Animal {

	@Override
	AnimalToy getToy() {
		return new DogToy();
	}
}

class Cat extends Animal{

	@Override
	AnimalToy getToy() {
		return new CatToy();
	}
}