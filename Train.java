import java.util.ArrayList;

public class Train {
    Engine engine;
    Car car1 = new Car(10);
    Car car2 = new Car(3);
    Car car3 = new Car(4);
    Passenger myPass1 = new Passenger("Jan");
    Passenger myPass2 = new Passenger("Mikayle");
    Passenger myPass3 = new Passenger("Candida H");
    Passenger myPass4 = new Passenger("Candida G");
    private ArrayList<Car> currentCars = new ArrayList<Car>();
   

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType,fuelCapacity);
        this.currentCars = new ArrayList<>(nCars);
        this.currentCars.add(car1);
        this.currentCars.add(car2);
        this.currentCars.add(car3);
        car1.addPassenger(myPass1);
        car1.addPassenger(myPass2);
        car1.addPassenger(myPass3);
        car1.addPassenger(myPass4);
    }

    public Engine getEngine(){
        // System.out.println(this.engine);
        return this.engine;

    }

    public int getMaxCapacity(){
        int max = 0;
        for(int i = 0; i < this.currentCars.size(); i++){
        max = max + this.currentCars.get(i).getCapacity();
        }
        return max;
    }



    public Car getCar(int i){
       if (this.currentCars.size() == 0){
        System.out.println("There are no cars in this train!");

       }
       System.out.println("There are cars in this train."  );
       return this.currentCars.get(i);
    }

    public void printManifest(){
        if (this.currentCars.size() > 0){
            for( Car car: this.currentCars){
            car.printManifest();            
            }
        }
    }

public static void main(String[] args) {
    Train myTrain = new Train(FuelType.STEAM, 15, 3, 30);
    myTrain.getMaxCapacity();
    myTrain.getCar(0);
    myTrain.getEngine();
    System.out.println("Passengers on Car 1: ");
    myTrain.printManifest();
    
}





}
