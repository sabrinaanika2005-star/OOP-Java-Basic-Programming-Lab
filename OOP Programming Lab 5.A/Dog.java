class Dog {
    String name, breed;

    Dog(String n, String b) {
        name = n; breed = b;
    }

    void setName(String n) { name = n; }
    void setBreed(String b) { breed = b; }

    public static void main(String[] args) {
        Dog d1 = new Dog("Tommy", "Labrador");
        Dog d2 = new Dog("Bruno", "Bulldog");

        d1.setName("Max");
        d2.setBreed("Poodle");

        System.out.println(d1.name + " - " + d1.breed);
        System.out.println(d2.name + " - " + d2.breed);
    }
}