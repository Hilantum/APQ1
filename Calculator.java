public class Calculator {
    public static void main(String[] args) {
       Calculator newAverage = new Calculator();

       newAverage.calcAverage(23, 45);
       newAverage.calcAverage(14, 27, 56.2);
    }

    public void calcAverage(int x, double y) {
        System.out.println("Test Average: " + (double)(x + y) / 2);        
    }

    public void calcAverage(int x, int y, double z) {
        System.out.println("Test Average: " + (double)(x + y + z) / 2);
    }
}