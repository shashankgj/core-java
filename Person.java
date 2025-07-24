public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void validateEligibleforVoting(int age) {
        if (age <= 0) 
        {
            System.out.println("Invalid age");
        }        
        else if (age >= 18)
        {
            System.out.println(name + " is eligible for voting.");
        } else 
        {
            System.out.println(name + " is NOT eligible for voting.");
        }
    }

    public static void main(String[] args) 
    {

        Person person1 = new Person("Rahul", 20);
        person1.validateEligibleforVoting(person1.age);

        Person person2 = new Person("Aditi", 16);
        person2.validateEligibleforVoting(person2.age);

        Person person3 = new Person("hemanth", 0);
        person3.validateEligibleforVoting(person3.age);
    }
}
