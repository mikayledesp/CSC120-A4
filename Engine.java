public class Engine {
    //will represent the locomotive engine, storing information about its fuel type, level, etc.
    // Atributes here:
    String FuelType;
    double maxfuel;
    double currentFuel;
    boolean fuelStatus; 
    
    //   - a constructor, which takes in initial values for the attributes named above and sets them appropriately
    public  void Main(double mfuel,double cFuel, String ftype){
     maxfuel = mfuel;
     currentFuel = cFuel;
     FuelType = ftype;
    
    
    }
    public boolean go(){
     fuelStatus = true;
     while(fuelStatus){
        currentFuel -= 1;
        System.out.println("Fuel status equals not empty, train can run");
     
     if (currentFuel == 0){
        fuelStatus = false;
        System.out.println("Fuel status equals empty, train cannot run");
     }
     }
        return fuelStatus;
    }
    
    
    
    
    
    
    
    //   - a `refuel()` method which will reset the `Engine`'s current fuel level to the maximum, and which doesn't need to `return` anything
    //   - a `go()` which will decrease the current fuel level, print some useful information (e.g. remaining fuel level), and return `True` if the fuel level is above 0 and `False` otherwise.
    
    public static void main(String[] args) {
        Engine myEngine = new Engine();
        myEngine.currentFuel = 7;
        myEngine.maxfuel = 30;
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
    
    }