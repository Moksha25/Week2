package main.assisted_problem.animal_hierarchy;

public class Bird extends Animal
{
    public Bird(String name, int age)
    {
        super(name, age);
        System.out.println("Bird Name : " + name + " and age : " + age);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Bird chirps.");
    }
}