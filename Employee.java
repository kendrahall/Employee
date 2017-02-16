
package employee;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Kendra
 */
public class Employee {

    public static void main(String[] args) {
      hourlyemployee tex= new HourlyEmployee("john", "rex", "3333333333",LocalDate.of(1998, Month.MARCH, 15),27.33);
      System.out.println("the employee is: "+ tex.toString());
      System.out.printf("%s was born on %s%n", tex.getFirstName(), tex.getDateob().getDayOgWeek());
      System.out.printf("%s has an employee number of %s%n",tex, tex.getEmployeenum());
      
      
    }
    
}
