package thirdpack;

public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Cost of driving");

        String userCurrency = "$";
        double cost = 1.2;      //cost of fuel
        double usage = 8.0 / 100.0; // usage of fuel for 1 km

        System.out.println("Cost of fuel for 120 km will be: " + fuelCost(cost, usage, 120) + userCurrency);
    }

    public static double fuelCost(double cost, double usage, double distance)
    
    {

        double usedFuel = usage * distance;
        double totalCost = usedFuel * cost;

        return totalCost;
    }
}
