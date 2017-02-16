/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.time.LocalDate;

/**
 *
 * @author Kendra
 */
class PayCheque {
    private double amout;
    private LocalDate dateIssued;
    private int chequeNum;
    private static int nextchequeNum = 10000;
    private String employeeName, notes;
    private double amount;
    
    public PayCheque(String employee, double amount){
        employeeName = employee;
        chequeNum = nextchequeNum;
        nextchequeNum++;
        dateIssued=LocalDate.now();
        notes="  ";
        setChequeAmount(double amount);
    }

    
    
    /**
     * this will validate the cheque amount is validate
     */
    
    
    private void setChequeAmount(double amount)
    {
        if (amount >0)
            this.amount = amount;
        else 
            throw new IllegalArgumentException("Cheque value must be greater than 0");
    }

    public double getAmout() {
        return amout;
    }

    public LocalDate getDateIssued() {
        return dateIssued;
    }

    public int getChequeNum() {
        return chequeNum;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getNotes() {
        return notes;
    }

    public double getAmount() {
        return amount;
    }
    public String toString()
    {
        return String.format("Cheque # %d, made out to %s for the amount pf $%.2f", 
                                                getChequeNum(), getEmployeeName(), getAmount());
    }
    
}


}
