public class Engine {
    //will represent the locomotive engine, storing information about its fuel type, level, etc.
    // Atributes here:
    FuelType fuelType;
    double maxfuel;
    double currentFuel;
    boolean fuelStatus; 
    

    /**
   * Method that refuels car be setting it equal to the max fuel
   */
    public void refuel(){
    this.currentFuel = maxfuel;
    }
    /**
   * Constructor for the Engine class
   * @param   fuelType, fuelLevel
   */
    public Engine(FuelType f, double fuelLevel){
     this.fuelType = f;
     this.maxfuel = this.currentFuel;
     this.currentFuel = fuelLevel;
     
    
    
    }
     /**
   * Boolean that detects if train can go or not based on fuel level
   * @return returns false if fuel is at zero and returns true if otherwise
   */
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
        /**
   *  Demonstrates how engine runs when certain fuel type and fuel level is declared 
   * @param args The command line arguments (ignored)
   **/
     public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }












    }
    
    
    
    
    
    
    
   