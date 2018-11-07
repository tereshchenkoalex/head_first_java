package io.github.tereshchenkoalex.chapter3;

public class Puppy {

    int puppyAge;

    public Puppy(String name){
        System.out.println("Name is: " + name);
    }

    public void setAge (int age){
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("Age of a puppy is: " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args){
        Puppy myPuppy = new Puppy("Baguette");

        myPuppy.setAge(10);

        myPuppy.getAge();

        System.out.println("Puppy's age is: "+ myPuppy.puppyAge);
    }
}
