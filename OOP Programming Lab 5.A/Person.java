class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Sabrina", 20);
        Person person2 = new Person("Anika", 21);

        System.out.println("Person 1 Name: " + person1.name);
        System.out.println("Person 1 Age: " + person1.age);

        System.out.println("Person 2 Name: " + person2.name);
        System.out.println("Person 2 Age: " + person2.age);
    }
}
