import java.util.ArrayList;

public class Car {

    public ArrayList<Passenger> passengersOnboard;
    private int carCapacity;

    public Car(int carMaxCapacity) {

        this.carCapacity = carMaxCapacity;
        this.passengersOnboard = new ArrayList<>();

    }

    public int getCapacity() {
        System.out.println(this.carCapacity);
        return this.carCapacity;
    }

    public int seatsRemaining() {
        return this.carCapacity - this.passengersOnboard.size();
    }
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
    public boolean removePassenger(Passenger p){
        if (this.passengersOnboard.contains(p)) {
            return true;
        } else {
            return false;
        }
    }

    public void printManifest(){
      if (this.passengersOnboard.size() > 0){
        for( Passenger p: this.passengersOnboard ){
        System.out.println(p.name);
        
        }
        
        


      }
    // System.out.println("Manifest Printed!");
    
    }

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


     }


}