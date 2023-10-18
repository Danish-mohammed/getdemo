package poly;

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

class CompileTimePolymorphismExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2, 3));          // Output: 5
        System.out.println(calculator.add(2, 3, 4));       // Output: 9
        System.out.println(calculator.add(2.5, 3.5));      // Output: 6.0
    }
}

