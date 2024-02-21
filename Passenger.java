public class Passenger {
    
    public String name;
    //look at readme
    public Passenger(String name) {
        this.name = name;
    }

 public boolean boardCar(Car c){
    if (c.addPassenger(this) == true){
        return true;
    } else{
        return false;   
    }
    
 }
 public boolean getOffCar(Car c){
    if (c.removePassenger(this) == true){
        return true;
    } else {
        return false;
    }
 }
  







}
