package Employee;

import java.time.LocalDate;

/**
 *
 * @author Kendra
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String FN, String LN, LocalDate DOB, int E_SIN, double comRate, double baseSal) {
        super(FN, LN, DOB, E_SIN, comRate);
        
        setBaseSalary(baseSal);
    }
    
//    Set Base Salary for Commission Employee
    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }

//    Return a double containing the base salary
    public double getBaseSalary() {
        return baseSalary;
    }
    
//    Return the paycheque object with the baseSalary added onto the employees pay
    @Override
    public PayCheque getPayCheque() {
        double amount = baseSalary + ((super.getCommissionRate() / 100) * super.getMonthlySales());

        PayCheque newPay = new PayCheque(super.toString(), amount);
        
        return newPay;
 
    }
}