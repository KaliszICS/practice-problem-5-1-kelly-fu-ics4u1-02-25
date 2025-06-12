import java.util.Arrays;

/**
 * The Child class extends Person and includes parental and sibling relationships.
 * @author Kelly Fu
 * @version 17.0.1
 */
public class Child extends Person {
    private Parent parent1;
    private Parent parent2;
    private Child[] siblings;

    /**
     * Constructor for Child.
     * @param name    the child's name.
     * @param age     the child's age.
     * @param parent1 one parent.
     * @param parent2 the other parent.
     */
    public Child(String name, int age, Parent parent1, Parent parent2) {
        super(name, age);
        this.parent1 = parent1;
        this.parent2 = parent2;
        this.siblings = new Child[0];
    }

    // Getters only for parents
    public Parent getParent1() {
        return parent1;
    }

    public Parent getParent2() {
        return parent2;
    }

    // Getters and setters for siblings
    public Child[] getSiblings() {
        return siblings;
    }

    public void setSiblings(Child[] siblings) {
        this.siblings = siblings;
    }

    /**
     * Adds a sibling to the siblings array.
     * @param sibling the sibling to add.
     */
    public void addSibling(Child sibling) {
        siblings = Arrays.copyOf(siblings, siblings.length + 1);
        siblings[siblings.length - 1] = sibling;
    }
}
