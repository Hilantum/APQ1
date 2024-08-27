public class Client {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X5M60i", "Isaac Dennis", false);
        
        System.out.println("\nMake: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Owner: " + car.getOwner());
        System.out.println("Sports Car?: " + Boolean.toString(car.isSportsCar()));
        
        System.out.println();
        car.setSportsBool(true);
        
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Owner: " + car.getOwner());
        System.out.println("Sports Car?: " + Boolean.toString(car.isSportsCar()));
    }
}