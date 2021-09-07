package StacksAndQueues;

import java.util.LinkedList;

abstract class Animal{
	private int order;
	protected String name;
	public Animal(String n){
		name = n;
	}
	public void setOrder(int ord) {
		order = ord;
	}
	public int getOrder() {
		return order;
	}
	public boolean isOlderthan(Animal a) {
		return this.order< a.getOrder();
		
	}
	public String getName() {
          return name;
    }

	
}
 class Dog extends Animal{
	public Dog(String n) {
		super(n);
	}
	@Override
    public String toString() {
          return "Dog Name: " + this.getName();
    }
}
 class Cat extends Animal{
	public Cat(String n) {
		super(n);
	}
	@Override
    public String toString() {
          return "Cat Name: " + this.getName();
    }
}
class AnimalQueue{
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	private int order = 0;
	
	public void enqueue(Animal n){
		n.setOrder(order);
		order++;
		if(n instanceof Dog) dogs.addLast((Dog) n);
		else if(n instanceof Cat) cats.addLast((Cat) n);
		
	}
	public Animal dequeueAny() {
		if(dogs.size() == 0)  return dequeueCats();
		else if(cats.size() ==0)  return dequeueDogs();
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		if(dog.isOlderthan(cat))
			 return dequeueDogs();
		else
			 return dequeueCats();
	}
	public Dog dequeueDogs() {
		return dogs.poll();
	}
	public Cat dequeueCats() {
		return cats.poll();
	}
}

public class AnimalShelter {

	public static void main(String[] args) {
		AnimalQueue q = new AnimalQueue();
		q.enqueue(new Dog("dog1"));
		q.enqueue(new Dog("dog2"));
		q.enqueue(new Cat("cat1"));
		q.enqueue(new Cat("Cat2"));
		q.enqueue(new Dog("dog3"));
		
		System.out.println("Perform dequeueDogs: "+ q.dequeueDogs());
		System.out.println("Perform dequeueAny: "+ q.dequeueAny());

	}

}
