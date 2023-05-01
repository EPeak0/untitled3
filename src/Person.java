public class Person {
    protected String name;
    protected int age;
    /**
     * Constructor of the class Person
     *
     * @param name2 The name of the person
     * @param age The age of the person
     */
    public Person(String name2, int age) {
        this.name = name2;
        this.age = age;
    }
    /**
     * Getter method for the name of the Person
     *
     * @return The person name
     */
    public String getName(){
        return this.name;
    }
}
