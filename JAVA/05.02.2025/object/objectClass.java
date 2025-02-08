package example;

import java.util.Objects;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class SecondUser {
    private String name;
    private int age;

    public SecondUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class objectClass {
    public static void main(String[] args) {
        User user1 = new User("Alice", 25);
        User user2 = new User("Alice", 25);

        SecondUser secUser1 = new SecondUser("Alice", 25);
        SecondUser secUser2 = new SecondUser("Alice", 25);

        System.out.println("User Object: " + user1);
        System.out.println("SecondUser Object: " + secUser1);

        System.out.println("\nComparing User objects (with equals method): " + user1.equals(user2));
        System.out.println("Comparing SecondUser objects (without equals method): " + (secUser1 == secUser2));
    }
}
