class Animal 
{
  private String name;

  public Animal(String name) 
{
    this.name = name;
  }

  public void makeSound() 
{
    System.out.println("Generic animal sound");
  }
}

class Mammal extends Animal 
{

  public Mammal(String name) 
{
    super(name); // Call base class constructor
  }
  public void makeSound() {
    System.out.println("Mammal sound");
  }
}

class Bird extends Animal 
{

  public Bird(String name) 
{
    super(name); 
  }

  public void makeSound() 
{
    System.out.println("Bird sound");
  }
}

class Fish extends Animal 
{

  public Fish(String name) 
{
    super(name);
  }
  public void makeSound() 
{
    System.out.println("Blub blub");
  }
}

public class Animal3 
{

  public static void main(String[] args) 
{
    Animal animal = new Animal("Animal");
    Mammal mammal = new Mammal("Cow");
    Bird bird = new Bird("Sparrow");
    Fish fish = new Fish("Goldfish");

    animal.makeSound();
    mammal.makeSound();
    bird.makeSound();
    fish.makeSound();
  }
}
