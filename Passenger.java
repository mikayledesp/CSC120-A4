public class Passenger {
    
    public String name;
    //look at readme
    public Passenger(String name) {
        this.name = name;
    }


 /**
   * Boolean that boards  passenger on the car
   * @param   Car 
   * @return returns false if passangers can not be added on car and returns true if passanger can be
   */
 public boolean boardCar(Car c){
    if (!c.addPassenger(this)) {
        //...appropriate error message if unsuccessful
        System.out.println("No more space to board car");
        return false;
    } 
        else{
        System.out.println("Car can be boarded!");    
        return true; }
    
 }

 /**
   * Boolean that gets passenger off from car 
   * @param   Car 
   * @return returns false if passangers not on car and returns true if passanger is on car
   */
 public boolean getOffCar(Car c){
    if (!c.removePassenger(this)){
        System.out.println("Error: Passenger was not onboard and cannot be removed!");
        return false;
        
    } else {
        System.out.println("Passenger removed from car");
        return true;
    }
 }


 







}
