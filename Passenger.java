public class Passenger {
    
    public String name;
    //look at readme
    public Passenger(String name) {
        this.name = name;
    }

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
