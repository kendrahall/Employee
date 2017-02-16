package employee;
import java.time.LocalDate;
import java.time.Period;

public abstract class employeee {
    private String firstName, lastName, socialin;
    private LocalDate dateob;
    private int employeenum;
    private static int nextEmployeenum = 10001;
       
    public employeee(String first, String last, String sin, LocalDate dob)
    {
        firstName = first;
        lastName = last;
        socialin = sin;
        setBirthday(dob);
        employeenum = nextEmployeenum;
        
        nextEmployeenum++; //makes sure the next employee has a different number
        
        
    }

    public int getEmployeenum() {
        return employeenum;
    }
    
    /**
     * this method will validate birthday
     */
    public void setBirthday(LocalDate dob)
    {
        LocalDate today = LocalDate.now();
        int age= Period.between(dob, today).getYears();
        
        if (age >=15 && age <= 90)
            dateob = dob;
        else 
            throw new IllegalArgumentException("Employees must be 15-90 yeears old");
    }
    
    /**
     * this method will return the first and last name
     */
    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialin() {
        return socialin;
    }

    public LocalDate getDateob() {
        return dateob;
    }
    public abstract PayCheque getPayCheque();
    
    
}


