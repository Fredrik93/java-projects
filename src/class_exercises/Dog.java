package class_exercises;

public class Dog {
    int puppyAge;
    int add;

    public Dog(String name) {
        // This constructor has one parameter, name.
        System.out.println("Name chosen is :" + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("Puppy's age is :" + puppyAge);
        return puppyAge;
    }

    public int add(int x, int y) {
        add = x + y;
        return add;
    }

    public int getAdd() {
        System.out.println("numbers are: " + add);
        return add;
    }
}