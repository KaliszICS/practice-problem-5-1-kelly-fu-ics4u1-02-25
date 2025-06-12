import java.util.Arrays;

/**
 * The Parent class extends Person and includes spouse and children relationships.
 * @author Kelly Fu
 * @version 17.0.1
 */
public class Parent extends Person {
    private Parent spouse;
    private Child[] children;

    /**
     * Main constructor including spouse.
     * @param name   the parent's name.
     * @param age    the parent's age.
     * @param spouse the spouse (another Parent).
     */
    public Parent(String name, int age, Parent spouse) {
        super(name, age);
        this.spouse = spouse;
        this.children = new Child[0];
    }

    /**
     * Secondary constructor (same as Person).
     * @param name the parent's name.
     * @param age  the parent's age.
     */
    public Parent(String name, int age) {
        super(name, age);
        this.spouse = null;
        this.children = new Child[0];
    }

    // Setters and getters
    public Parent getSpouse() {
        return spouse;
    }

    public void setSpouse(Parent spouse) {
        this.spouse = spouse;
    }

    public Child[] getChildren() {
        return children;
    }

    public void setChildren(Child[] children) {
        this.children = children;
    }

    /**
     * Adds a child to the children array.
     * @param child the child to add.
     */
    public void addChild(Child child) {
        children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = child;
    }
}
