package employee;
import java.time.LocalDate;

/*
 * @author Kendra
 */
public class HourlyEmployee extends employee{
private double minimumWage= 11.45;
private double payRate;
private int hoursWorked;
    public HourlyEmployee(String first, String last, String sin, LocalDate dob, double payRate)
    {
   super(first,last,sin,dob);
   hoursWorked=0;
   setPayRate(payRate);
    }
    public void setPayRate(double payRate)
    {
        if (payRate >= minimumWage)
            this.payRate = payRate;
        else
            throw new IllegalArgumentException("Minimum wage, is $11.45");
    }

    public double getPayRate() {
        return payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
    public void addHoursWorked(float hoursWorked)
    {
     if (hoursWorked >=0 && hoursWorked <=14)
         this.hoursWorked += hoursWorked;
     else
         throw new IllegalArgumentException("hours worked must be 0-14 hours a day");
    }
    
    @Override
    public PayCheque getPayCheque() {
        double payAmount = hoursWorked * payRate;
        PayCheque newPayCheque = new PayCheque(super.toString(), payAmount);
        hoursWorked=0;
        return newPayCheque;
    }
    
}