
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
i

public class Main
{
    public static void main(String[] args)
    {
        
        
        
        Movies[] arrayMov = new Movies[100];
        
        
        double totalCharge = 0;
        for(int i=0; i<arrayMov.length; i++)
        {
            if(arrayMov[i] instanceof DailyRental)
            {
                totalCharge = totalCharge + arrayMov[i].calCharges();
            }
        }
        
        for(int i=0; i<arrayMov.length; i++)
        {
            if(arrayMov[i] instanceof MonthlySubscribe)
            {
                totalCharge = totalCharge + arrayMov[i].calCharges();
            }
        }
        
        int numOfCust_AddAnim = 0;
        for(int i=0; i<arrayMov.length; i++)
        {
             if(arrayMov[i] instanceof MonthlySubscribe)
            {
                if(arrayMov[i].getAddMovies().equalsIgnoreCase("Animation"))
                { numOfCust_AddAnim++;}
            }
        }
    }
    
}
