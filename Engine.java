public class Engine {
    //will represent the locomotive engine, storing information about its fuel type, level, etc.
    // Atributes here:
    FuelType fuelType;
    double maxfuel;
    double currentFuel;
    boolean fuelStatus; 
    


    public void refuel(){
    this.currentFuel = maxfuel;
    }
    //   - a constructor, which takes in initial values for the attributes named above and sets them appropriately
    public Engine(FuelType f, double fuelLevel){
     this.fuelType = f;
     this.maxfuel = this.currentFuel;
     this.currentFuel = fuelLevel;
     
    
    
    }

    public boolean go(){
     
    //  while(fuelStatus){
    //     currentFuel -= 1;
    //     System.out.println("Fuel status equals not empty, train can run");
     
     if (this.currentFuel >  0){
        this.currentFuel -= 10;
        return true; 
        
     } 
     else{
        this.currentFuel = 0;
        return false;
     }

     }
     
     public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }












    }
    
    
    
    
    
    
    
    //   - a `refuel()` method which will reset the `Engine`'s current fuel level to the maximum, and which doesn't need to `return` anything
    //   - a `go()` which will decrease the current fuel level, print some useful information (e.g. remaining fuel level), and return `True` if the fuel level is above 0 and `False` otherwise.
    
    