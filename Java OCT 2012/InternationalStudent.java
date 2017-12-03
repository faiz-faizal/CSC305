
/**
 * Write a description of class InternationalStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InternationalStudent extends Student
{
    // instance variables - replace the example below with your own
    private String countryFrom;
    
    public InternationalStudent(){
        super();
    }
    
    //constructor for InternationalStudent
    public InternationalStudent(String id, String name, String program, String gender, boolean college, String countryFrom)
    {
        super(id, name, program, gender, college);
        this.countryFrom = countryFrom;
    }
    //setter method
    public void setCountryFrom(String countryFrom) { this.countryFrom = countryFrom; }
    //getter method
    public String getCountryFrom(){ return countryFrom;}
    //processor method for InternationalStudent
    public double calculateFees()
    {
       //international university charge
       double fees = 1200;
       //college charge
       if(college)
           fees += 300;    
       
       //student's visa charge
       if(!(countryFrom.equalsIgnoreCase("Yemen" )))
            fees += 500; 
       return fees;
    }
    //printer method
    public String toPrint(){
        
           String print ="Student Details \n ID:" + id +
           "\nNAME: " + name + "\nPROGRAM " + program + "\nGENDER: " + gender + "\nCOLLEGE: " + college +
           "\nCOUNTRY FROM: " + countryFrom + "\n" + "\nTOTAL FEE:" + calculateFees() + "\n";
           
        return print;
    }
}
