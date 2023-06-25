package inheritance;

// POJO of person class
public class Person {
    protected String name;
    protected int age;
    private String gender;

    protected Person() {
        System.out.println("I am constructor of Person.");
    }

    protected Person(String name) {
        System.out.println("I am constructor of Person but not default one.");
        this.name = name;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
