package main.assisted_problem.animal_hierarchy;

public class Cat extends Animal
{
    public Cat(String name, int age)
    {
        super(name, age);
        System.out.println("Cat Name : " + name + " and age : " + age);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Cat meows.");
    }
}