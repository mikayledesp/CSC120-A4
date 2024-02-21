import java.util.ArrayList;
import java.util.Arrays;

public class Car {

    private ArrayList<Passenger> passengersOnboard;
    private int carCapacity;

    private Car(int carMaxCapacity) {

        this.carCapacity = carMaxCapacity;
        this.passengersOnboard = new ArrayList<>();

    }

    public int getCapacity() {
        return this.carCapacity;
    }

    public int seatsRemaining() {
        return this.carCapacity - this.passengersOnboard.size();
    }
    public boolean addPassenger(Passenger p){
        if (this.passengersOnboard.contains(p)){

            return false;

        } else if (this.passengersOnboard.size() == carCapacity){

            return true;
        }
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
    
    }




}