package poly;

class Animal {
    // Method in the superclass
    public void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

class Dog extends Animal {
    // Method overridden in the subclass
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    // Method overridden in the subclass
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class RunTimePolymorphismExample {
    public static void main(String[] args) {
        Dog animal1 = new Dog();  // Upcasting
        Animal animal2 = new Cat();  // Upcasting

        animal1.makeSound();  // Output: Bark
        animal2.makeSound();  // Output: Meow
    }
}

