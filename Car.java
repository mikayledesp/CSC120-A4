import java.util.ArrayList;

public class Car {

    public ArrayList<Passenger> passengersOnboard;
    private int carCapacity;
/**
   * Constructor for the Car class
   * @param   carMaxCapacity
   * @return  if there are cars on the train 
   */
    public Car(int carMaxCapacity) {

        this.carCapacity = carMaxCapacity;
        this.passengersOnboard = new ArrayList<>();

    }
 /**
   * Accessor to return the capacity of the specific train car in a way thats acessible to the other java files
   * @return  the car capacity method 
   */
    public int getCapacity() {
        System.out.println(this.carCapacity);
        return this.carCapacity;
    }
 /**
   * Returns seats remaining by subtracting number of passengers from the car capacity 
   * @return value of seats left after subtracting size of passenger list
   */
    public int seatsRemaining() {
        return this.carCapacity - this.passengersOnboard.size();
    }
     /**
   * Returns a boolean value based on if the passenger is on board and adds them if they are not already on board
   * @param   s the passengers declared 
   * @return  true or false boolean. Addition of passenger based on if the answer is false
   */
    public boolean addPassenger(Passenger p){
        if (this.passengersOnboard.contains(p)){
            System.out.println( "passenger already on board");
            return false;
            
        } else if (this.passengersOnboard.size() == carCapacity){

            return true;
        }
        System.out.println("Passenger Added");
        this.passengersOnboard.add(p);
        return true;
        
    }
    /**
   * Returns a boolean value based on if the passenger is on board and removes them if they are
   * @param   s the passengers declared 
   * @return  true or false boolean. Removal based on if the answer is false
   */
    public boolean removePassenger(Passenger p){
        if (!this.passengersOnboard.contains(p)) {
            return true;
        } else  {
            System.out.println("Passenger Removed: Please Re-Print Manifest");
            this.passengersOnboard.remove(p);
            return false;
        }
       
    }
/**
   * Creates a loop to print out the names of each passengar based on the size of the passengar lost  
   * no params and no return statement
   */
    public void printManifest(){
      if (this.passengersOnboard.size() > 0){
        for( Passenger p: this.passengersOnboard ){
        System.out.println(p.name);
        
        }
        
        


      }
    
    
    }

    /**
   * Helps to declare the Passengars on entire the entire train. Then demonstrates how to add passengers to a specific car of the train and then printing a manifest of all passengers added  
   * @param args The command line arguments (ignored)
   **/
    public static void main(String[] args) {
        Passenger myPass1 = new Passenger("Jan");
        Passenger myPass2 = new Passenger("Mikayle");
        Passenger myPass3 = new Passenger("Candida");
        Passenger myPass4 = new Passenger("Christopher");
        Passenger myPass5 = new Passenger("Annå");
        Car car1 = new Car(3);
        Car car2 = new Car(4);
        car1.addPassenger(myPass1);
        car1.addPassenger(myPass2);
        car1.addPassenger(myPass3);
        car2.addPassenger(myPass4);
        car2.addPassenger(myPass5);
        car1.addPassenger(myPass1);
        System.out.println("Passengers on Car 1: ");
        car1.printManifest();
        System.out.println("Passangers on Car 2: ");
        car2.printManifest();
        car2.removePassenger(myPass5);
        System.out.println("Manifest reprinting....");
        car2.printManifest();
        car2.seatsRemaining();


     }


}