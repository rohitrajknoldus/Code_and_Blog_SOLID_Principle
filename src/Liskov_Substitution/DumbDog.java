package Liskov_Substitution;

public class DumbDog implements Animal{
    public static void main(String[] args) {
        {
            System.out.println("I am from Liskov_Substitution");

            Dog.makeNoise();
            Cat.makeNoise();
            Animal.makeNoise();
            System.out.println("I can't make noise");
        }
    }
}
