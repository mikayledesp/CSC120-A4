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
   
/**
   * Constructor for the Train class
   * @param   fuelType, fuelCapacity, nCars, passengerCapacity
   */
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
/**
   * Acessor for the engine 
   * @param   int 
   * @return  Engine 
   */
    public Engine getEngine(){
        // System.out.println(this.engine);
        return this.engine;

    }
/**
   * Gets the max compacity of the car by iterating over the number of current cars 
   * @return  max compacity of the train
*/
    public int getMaxCapacity(){
        int max = 0;
        for(int i = 0; i < this.currentCars.size(); i++){
        max = max + this.currentCars.get(i).getCapacity();
        }
        return max;
    }


/**
   * Looks at number of cars in the train and determines if there are any 
   * @param   int 
   * @return  if there are cars on the train 
   */
    public Car getCar(int i){
       if (this.currentCars.size() == 0){
        System.out.println("There are no cars in this train!");

       }
       System.out.println("There are cars in this train."  );
       return this.currentCars.get(i);
    }
 
  /**
   * Creates a loop to print out the names of each passengar based on the size of the passengar lost  
   * no params and no return statement
   */
    public void printManifest(){
        if (this.currentCars.size() > 0){
            for( Car car: this.currentCars){
            car.printManifest();            
            }
        }
    }
   /**
   * Demonstrates how to return information about the train(like its engine, max capacicity and cars), then prints out manifest of passengers on train  
   * @param args The command line arguments (ignored)
   **/
public static void main(String[] args) {
    Train myTrain = new Train(FuelType.STEAM, 15, 3, 30);
    myTrain.getMaxCapacity();
    myTrain.getCar(0);
    myTrain.getEngine();
    System.out.println("Passengers on Train: ");
    myTrain.printManifest();
    
    
}





}
