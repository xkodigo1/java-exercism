public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    
    public static int expectedMinutesInOven() {
        int timeExpected = 40;
        return timeExpected;
    } 
    
    // TODO: define the 'remainingMinutesInOven()' method

    public static int remainingMinutesInOven(int minutesInOven) {
        int remainingTime = expectedMinutesInOven() - minutesInOven;
        return remainingTime;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public static int preparationTimeInMinutes(int lasagnaLayers) {
        return lasagnaLayers * 2;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method

    public static int totalTimeInMinutes(int lasagnaLayers, int minutesInOven) {
        int layerMinutes = lasagnaLayers * 2;
        int totalTime = layerMinutes + minutesInOven;
        return totalTime;        
    }
    
}
