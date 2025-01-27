package main.assisted_problem.animal_hierarchy;

public class Dog extends Animal
{

    public Dog(String name, int age)
    {
        super(name, age);
        System.out.println("Dog Name : " + name + " and age : " + age);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Dog barks.");
    }
}