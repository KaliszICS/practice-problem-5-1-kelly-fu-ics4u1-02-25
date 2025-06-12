/**
 * The Person class represents a basic person with a name and age.
 * @author Kelly Fu
 * @version 17.0.1
 */
public class Person {
    private String name;
    private int age;

    /**
     * Constructor for Person.
     * @param name the person's name.
     * @param age  the person's age.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

