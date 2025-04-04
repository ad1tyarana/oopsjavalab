class Calculator {
    public int add(int a, int b) {      //adding integers
        return a + b;
    }
    public double add(double a, double b) {     //adding double
        return a + b;
    }
    public int add(int a, int b, int c) {          //adding three integers
        return a + b + c;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();     //object of calculator class
        int sumInt = calc.add(5, 10);
        System.out.println("Sum of two integers: " + sumInt);
        double sumDouble = calc.add(5.5, 3.2);
        System.out.println("Sum of two doubles: " + sumDouble);
        int sumThreeIntegers = calc.add(1, 2, 3);
        System.out.println("Sum of three integers: " + sumThreeIntegers);
    }
}
