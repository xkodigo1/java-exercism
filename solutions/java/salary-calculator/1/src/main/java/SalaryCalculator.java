public class SalaryCalculator {

    // Returns 0.85 if 5 or more days are skipped, otherwise 1.0
    public double salaryMultiplier(int daysSkipped) {
        return (daysSkipped >= 5) ? 0.85 : 1.0;
    }

    // Returns 13 if 20 or more products are sold, otherwise 10
    public int bonusMultiplier(int productsSold) {
        return (productsSold >= 20) ? 13 : 10;
    }

    // Returns the total bonus for products sold
    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    // Calculates the final salary including bonus and penalty, capped at 2000
    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = salaryMultiplier(daysSkipped) * 1000.0;
        double total = baseSalary + bonusForProductsSold(productsSold);
        return Math.min(2000, total); // Ensure salary does not exceed 2000
    }
} 
